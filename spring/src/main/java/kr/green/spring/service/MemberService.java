package kr.green.spring.service;

import org.springframework.stereotype.Service;

import kr.green.spring.vo.MemberVO;


public interface MemberService {
	//성공여부 
	public boolean singup(MemberVO mVo);
}
