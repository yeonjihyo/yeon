package kr.green.spring.controller;

import java.util.ArrayList;

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
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String boardListGet(Model model) {
		ArrayList<BoardVO> boardList=boardService.getBoardList();
		
//		for(BoardVO tmp:boardList) {
//			System.out.println(tmp);
//		} 
		model.addAttribute("list", boardList);
		return "/board/list";
	}
	@RequestMapping(value = "/display", method = RequestMethod.GET)
	public String boardDisplayGet(Model model,Integer num) {
		//조회수 증가 bvo앞에 쓰는 이유는 먼저 조회수를 올리고 게시글을 가져오려고 
		boardService.updateViews(num);
		BoardVO bVo =boardService.getBoard(num);
		model.addAttribute("board", bVo);
		return "/board/display";
		
	}
	
}
