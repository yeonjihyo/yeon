package kr.green.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
	//회원 가입 시 암호화가 진행되는 MemberService에 BCryptPasswordEncoder 멤버 객체 추가
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public boolean singup(MemberVO mVo) {
		// 기존에 해당 아이디가 있는지 없는지 체크
		//있으면 return false를 반환하고 종료
		//없으면 회원가입진행
		if(mVo ==null) {
			return false;
		}
		mVo.setName("");
		if(memberDao.getMember(mVo.getId()) != null) {
			return false;
		}	
		//회원가입창에서 입력받은 암호를 암호화 시킴
		String encodePw = passwordEncoder.encode(mVo.getPw());
		//회원 정보의 비밀번호를 암호화된 비밀번호로 변경
		mVo.setPw(encodePw);
		memberDao.signup(mVo);
		return true;
	}

//	@Override
//	public boolean signin(MemberVO mVo) {
//		if(mVo ==null) {//예외처리 //입력된정보가 없으면 
//			return false;
//		}
//		//dao에게 id와 일치하는 회원 정보를 가져오게 시켜서 oVo에 저장
//		MemberVO oVo=memberDao.getMember(mVo.getId());
//		if(oVo ==null) {//저장된 회원정보가 없으면 
//			return false;//회원이 아니라고 알려줌
//		}
//		if(oVo.getPw().equals(mVo.getPw())) {//가져온 회원정보의 비밀번호와 입력한 회원정보의 비밀번호를 equals를 통해 비교
//			return true;//같으면 회원이라고 알려줌
//		}
//		return false;
//	}
	@Override
	public MemberVO signin(MemberVO mVo) {
		if(mVo ==null) {//예외처리 //입력된정보가 없으면 
			return null;
		}
		MemberVO oVo=memberDao.getMember(mVo.getId());
		if(oVo ==null) { 
			return null;
		}
		if(passwordEncoder.matches(mVo.getPw(), oVo.getPw())) {//내가직접입력한번호화 암호화된 번호를 비교 ,괄호안에 순서중요 
			return oVo;
		}
		return null;
	}

	@Override
	public boolean modify(MemberVO mVo,String oldPw) {
		if(mVo ==null) {
			return false;
		}
		if(memberDao.getMember(mVo.getId()).getPw().equals(oldPw)) {
			memberDao.modify(mVo);//dao에게 수정될 회원정보를 전달하여 db에 회원테이블업데이트 요청(dao에게 일시킴)
			return true;
		}
		return false;
	}

	@Override
	public boolean isMember(String id) {
		//여기서 getMember(id)는 해당아이디와 일치하는 회원정보를 가져오는거 의 의미 
		if(memberDao.getMember(id) == null) {
			return false;
		}
		return true;
	}
	

	
	
}
