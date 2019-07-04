package kr.green.spring.dao;

import kr.green.spring.vo.MemberVO;

public interface MemberDAO {

	void signup(MemberVO mVo);

	MemberVO getMember(String id);
	
}
