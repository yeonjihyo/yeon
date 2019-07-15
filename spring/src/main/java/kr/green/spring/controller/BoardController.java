package kr.green.spring.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.green.spring.service.BoardService;
import kr.green.spring.vo.BoardVO;

@Controller
@RequestMapping(value = "/board")
//이게 생략되었을 경우 아래 @RequestMapping의 value에 /board/list 이렇게 추가해주면 된다 
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	//게시판목록
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String boardListGet(Model model) {
		ArrayList<BoardVO> boardList=boardService.getBoardList();
		
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
		//BoardVO bVo =boardService.getBoard(num);
		model.addAttribute("board", num);
		return "board/modify";
	}
	@RequestMapping (value= "/modify", method=RequestMethod.POST)//수정된내용을 전송해야하니까 post가 필요
	//HttpServletRequest : 요청된 정보가 들어있는거 
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
	public String boardRegisterPost(Model model,BoardVO boardVo, HttpServletRequest r) {
		System.out.println(boardVo);//게시판정보가잘들어오는지확인//게시판들어가서 등록마쳤을떄 정보가 떠야함 
		boardService.registerBoard(boardVo);
		return "redirect:/board/list";
	}
	//게시글삭제
	@RequestMapping (value= "/delete", method=RequestMethod.GET)
	public String boardDisplayDeleteGet(Model model,Integer num, HttpServletRequest r) {
		if(boardService.isWriter(num,r)) {//작성자면 삭제해라 
			boardService.deleteBoard(num);
		}
		return "redirect:/board/list";//삭제기능만처리하겟다,jsp안만들어도됨
	}

}
