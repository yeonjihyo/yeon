package kr.green.spring.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.spring.dao.BoardDAO;
import kr.green.spring.vo.BoardVO;

@Service
public class BoardServiceImp implements BoardService {

	@Autowired
	BoardDAO boardDao;
	
	@Override
	public ArrayList<BoardVO> getBoardList() {
		// TODO Auto-generated method stub
		return boardDao.getBoardList();
	}

	@Override
	public BoardVO getBoard(Integer num) {
		// TODO Auto-generated method stub
		if(num == null) {
			return null;
		}//예외처리  기본키가 번호이기때문에 
		return boardDao.getBoard(num);
	}

	

	

}
