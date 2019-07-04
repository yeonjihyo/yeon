package kr.green.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.spring.dao.MemberDAO;
import kr.green.spring.vo.MemberVO;

@Service
public class MemberServiceImp implements MemberService{

	/*
	 인터페이스는 객체를 생성할 수 있다

	MemberService mS= new MemberServiceImp();
	인터페이스를 구현한 클래스는 객체를 생성할 수 있다.
	
	인터페이스는 인터페이스로 객체를 생성할 수 없다 
	MemberService mS= new MemberService();
	
	인터페이스는 생성자가 없기 때문에 객체를 생성할 수 없지만 
	위에와 같이 인터페이스를 구현한 클래스는 클래스이기 때문에 자동으로 생성자가 생기기 때문에 객체를 생성할 수 있음 
	 */
	@Autowired
	MemberDAO memberDao;
	
	@Override
	public boolean singup(MemberVO mVo) {
		// 기존에 해당 아이디가 있는지 없는지 체크
		//있으면 return false를 반환하고 종료
		//없으면 회원가입진행
		if(mVo ==null)
			return false;
		mVo.setName("");
		if(memberDao.getMember(mVo.getId()) != null)
			return false;
		memberDao.signup(mVo);
		return true;
	}
	
}
