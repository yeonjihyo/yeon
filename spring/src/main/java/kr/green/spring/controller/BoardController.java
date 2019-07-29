package kr.green.spring.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import kr.green.spring.pagination.Criteria;
import kr.green.spring.pagination.PageMaker;
import kr.green.spring.service.BoardService;
import kr.green.spring.utils.UploadFileUtils;
import kr.green.spring.vo.BoardVO;

@Controller
@RequestMapping(value = "/board")
//이게 생략되었을 경우 아래 @RequestMapping의 value에 /board/list 이렇게 추가해주면 된다 
public class BoardController {
	
	@Autowired
	BoardService boardService;
	@Resource//서블릿에등록하는거로 서블릿에서 이름이 uploadPath인애를찾음
	private String uploadPath;
	
	//게시판목록
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String boardListGet(Model model, Criteria cri) {
		cri.setPerPageNum(2);//게시글의갯수
		ArrayList<BoardVO> boardList=boardService.getBoardList(cri);
		PageMaker pm=new PageMaker();
		
		System.out.println(cri);
		
		//pm의 현재 페이지 정보 설정
		pm.setCriteria(cri);
		//pm의 displayPageNum 설정
		pm.setDisplayPageNum(5);//페이지네이션의갯수
		//pm의 총 게시글 수 설정
		int totalCount =boardService.getTotalCount(cri);
		pm.setTotalCount(totalCount);
		model.addAttribute("pageMaker", pm);
		
//		for(BoardVO tmp:boardList) {
//			System.out.println(tmp);
//		} 
		model.addAttribute("list", boardList);
		return "/board/list";
	}
	//게시글
	@RequestMapping(value = "/display", method = RequestMethod.GET)
	public String boardDisplayGet(Model model,Integer num) {
		//조회수 증가 bvo앞에 쓰는 이유는 먼저 조회수를 올리고 게시글을 가져오려고 
		boardService.updateViews(num);
		BoardVO bVo =boardService.getBoard(num);
		model.addAttribute("board", bVo);
		return "/board/display";
	}
	//게시글수정
	@RequestMapping (value= "/modify", method=RequestMethod.GET)
	public String boardModifyGet(Model model,Integer num, HttpServletRequest r) {
		if(!boardService.isWriter(num,r)) {//작성자가아니면 리스트로가라 
			return "redirect:/board/list";
		}
		BoardVO bVo =boardService.getBoard(num);
		model.addAttribute("board", bVo);
		return "board/modify";
	}
	@RequestMapping (value= "/modify", method=RequestMethod.POST)//수정된내용을 전송해야하니까 post가 필요
	//HttpServletRequest : 요청된 정보가 들어있는거 ,현재 열려있는 서버->객체로가져옴(세션에담아)
	public String boardModifyPost(Model model,BoardVO bVo,HttpServletRequest r) {
		System.out.println(bVo);
		boardService.updateBoard(bVo,r);//로그인한 사람이 작성자인지 아닌지 확인하기 위해 r을 넣어줌
		model.addAttribute("num", bVo.getNum());
		return "redirect:/board/display";
	}
	//게시글등록
	@RequestMapping (value= "/register", method=RequestMethod.GET)
	public String boardRegisterGet(Model model) {
		
	
		return "board/register";
	}
	@RequestMapping (value= "/register", method=RequestMethod.POST)
	public String boardRegisterPost(Model model,MultipartFile file2,BoardVO boardVo) throws IOException, Exception {
		System.out.println(boardVo);//게시판정보가잘들어오는지확인//게시판들어가서 등록마쳤을떄 정보가 떠야함
		if(file2.getOriginalFilename().length() != 0) {
			String file = UploadFileUtils.uploadFile(uploadPath, file2.getOriginalFilename(),file2.getBytes());
			//UploadFileUtils : 객체를안만들고 불러오는게 가능한 이유는 uploadFile에 static이 붙었기 때문에 
			boardVo.setFile(file);
		}
		boardService.registerBoard(boardVo);
		
		return "redirect:/board/list";
	}
	
	//게시글삭제
	@RequestMapping (value= "/delete", method=RequestMethod.GET)
	public String boardDisplayDeleteGet(Model model,Integer num, HttpServletRequest r) {// r: 작성자정보가져오기위해 세션에 접근
		if(boardService.isWriter(num,r)) {//작성자면 삭제해라 
			boardService.deleteBoard(num);
		}
		return "redirect:/board/list";//삭제기능만처리하겟다,jsp안만들어도됨
	}
	//파일업로드
	//@RequestMapping없음,내부적으로호출하기위한메소드  
	private String uploadFile(String name, byte[] data)
		throws Exception{
	    /* 고유한 파일명을 위해 UUID를 이용 */
		UUID uid = UUID.randomUUID();
		String savaName = uid.toString() + "_" + name;
		File target = new File(uploadPath, savaName);
		FileCopyUtils.copy(data, target);
		return savaName;
	}
	
	//파일다운로드
	@ResponseBody
	@RequestMapping("/download")
	public ResponseEntity<byte[]> downloadFile(String fileName)throws Exception{
	    InputStream in = null;
	    ResponseEntity<byte[]> entity = null;
	    try{
	        HttpHeaders headers = new HttpHeaders();
	        in = new FileInputStream(uploadPath+fileName);

	        fileName = fileName.substring(fileName.indexOf("_")+1);
	        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
	        headers.add("Content-Disposition",  "attachment; filename=\"" 
				+ new String(fileName.getBytes("UTF-8"), "ISO-8859-1")+"\"");
	        entity = new ResponseEntity<byte[]>(IOUtils.toByteArray(in),headers,HttpStatus.CREATED);
	    }catch(Exception e) {
	        e.printStackTrace();
	        entity = new ResponseEntity<byte[]>(HttpStatus.BAD_REQUEST);
	    }finally {
	        in.close();
	    }
	    return entity;
	}

}
