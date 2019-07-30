package kr.green.spring.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import kr.green.spring.pagination.Criteria;
import kr.green.spring.vo.MemberVO;


public interface MemberService {
	//성공여부 
	public boolean singup(MemberVO mVo);
	//로그인여부 
	public MemberVO signin(MemberVO mVo);
	//회원수정
	public boolean modify(MemberVO mVo,String oldPw);
	//회원여부
	public boolean isMember(String id);
	//값만가져오려는 디비에접근할필요없지만 헷갈리ㅣ까 
	public String getVal(String id);
	public boolean checkMember(String id, String email);
	public String createPw();
	public void modify(String id, String email, String newPw);
	public void sendMail(String email, String title, String contents);
	public ArrayList<MemberVO> getAllMember(Criteria cri);
	public int getTotalCount();
	public void updateAuthority(MemberVO mVo);
	
	
}
