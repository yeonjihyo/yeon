package kr.green.spring.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.spring.dao.BoardDAO;
import kr.green.spring.pagination.Criteria;
import kr.green.spring.vo.BoardVO;
import kr.green.spring.vo.MemberVO;

@Service
public class BoardServiceImp implements BoardService {

	@Autowired
	BoardDAO boardDao;
	
	@Override
	public ArrayList<BoardVO> getBoardList(Criteria cri) {
		// TODO Auto-generated method stub
		return boardDao.getBoardList(cri);
	}

	@Override
	public BoardVO getBoard(Integer num) {
		if(num == null) {
			return null;
		}//예외처리  기본키가 번호이기때문에 
		return boardDao.getBoard(num);
	}

	@Override
	public void updateViews(Integer num) {
		// TODO Auto-generated method stub
		//첫번째 방법:
		//boardDao.updateViews(num);
		//두번째방법 :
		BoardVO tmp = boardDao.getBoard(num);
		if(tmp != null) {
			int oldViews = tmp.getViews();//현재조회소를 올드뷰에 저장
			tmp.setViews(oldViews+1);
			boardDao.updateBoard(tmp);
		}
	}

	@Override
	public void updateBoard(BoardVO bVo, HttpServletRequest r) {
		MemberVO user =(MemberVO)r.getSession().getAttribute("user");
		if(user == null || bVo == null) return ;
		if(bVo.getWriter() != null && bVo.getWriter().equals(user.getId())) {//
			boardDao.updateBoard(bVo);
		}
	}

	@Override
	public void registerBoard(BoardVO boardVo) {
		boardDao.registerBoard(boardVo);
		
	}

	@Override
	public void deleteBoard(Integer num) {
		if(num == null || num<=0) {
			return;
		}
		boardDao.deleteBoard(num);
		
	}

	@Override
	public boolean isWriter(Integer num, HttpServletRequest r) {
		 BoardVO board=boardDao.getBoard(num);//게시판번호가져옴
		 MemberVO user =(MemberVO)r.getSession().getAttribute("user");//유저정보가져옴
		 if(board != null && user != null && board.getWriter().equals(user.getId())) {
			 //작성자와 아이디 모두 낫널이 체크되 있으니까 널이아니라는거는 정보가있는거고 널이면 빈문자열이 있는거니까 이퀄스를 통해 비교
			 return true;
		 }
		 return false;
	}

	@Override
	public int getTotalCount(Criteria cri) {
		
		return boardDao.getTotalCount(cri);
	}

	@Override
	public ArrayList<BoardVO> getBoardListAll(Criteria cri) {
		// TODO Auto-generated method stub
		return boardDao.getBoardListAll(cri);
	}

	@Override
	public int getTotalCountAll(Criteria cri) {
		// TODO Auto-generated method stub
		return boardDao.getTotalCountAll(cri);
	}

	@Override
	public void updateValid(BoardVO bVo) {
		boardDao.updateValid(bVo);
		
	}

	


}
