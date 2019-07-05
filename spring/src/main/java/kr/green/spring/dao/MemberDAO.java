package kr.green.spring.dao;

import kr.green.spring.vo.MemberVO;

public interface MemberDAO {
	//회원정보를 매개변수로 가진 가입메소드
	void signup(MemberVO mVo);
	//리턴타입이 MemberVO 인 getMember라는 메소드?
	MemberVO getMember(String id);
	
	void modify(MemberVO mVo);
}
