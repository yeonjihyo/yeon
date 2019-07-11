package kr.green.spring.service;

import org.springframework.stereotype.Service;

import kr.green.spring.vo.MemberVO;


public interface MemberService {
	//성공여부 
	public boolean singup(MemberVO mVo);
	//로그인여부 
	public MemberVO signin(MemberVO mVo);
	//회원수정
	public boolean modify(MemberVO mVo,String oldPw);
	
	
}
