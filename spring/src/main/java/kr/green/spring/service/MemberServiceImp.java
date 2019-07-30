package kr.green.spring.service;

import java.util.ArrayList;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.green.spring.dao.MemberDAO;
import kr.green.spring.pagination.Criteria;
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
	@Autowired
	private JavaMailSender mailSender;
	
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

	@Override
	public String getVal(String id) {
		String [] arr = id.split("=");
		if(arr.length ==2) {
			return arr[1];
		}else {
			return "";
		}
		
	}

	@Override
	public boolean checkMember(String id, String email) {
		MemberVO user= memberDao.getMember(id);
		if(user != null && user.getEmail().equals(email)) {
			return true;
		}
		return false;
	}

	@Override
	public String createPw() {
		//임시비밀번호 8자리 생성
		String str="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String pw="";
		for (int i=0;i<8;i++) {
			int r=(int)(Math.random()*62);
			pw +=str.charAt(r);
			//문자열에서 랜덤한번지의 숫자를 이어붙인다
			//charAt() : 문장중에 인덱스 위치에 해당되는 문자 추출하기
			
		}
		return pw;
	}

	@Override
	public void modify(String id, String email, String newPw) {
		MemberVO user=memberDao.getMember(id);
		if(user == null) {
			return;
		}
		if (!user.getEmail().equals(email)) {
			return;
		}
		String encodePw = passwordEncoder.encode(newPw);
		user.setPw(encodePw);
		memberDao.modify(user);
	}

	@Override
	public void sendMail(String email, String title, String contents) {
		String setfrom = "yjihyo1321@naver.com";     
	    try {
	        MimeMessage message = mailSender.createMimeMessage();
	        MimeMessageHelper messageHelper 
	            = new MimeMessageHelper(message, true, "UTF-8");

	        messageHelper.setFrom(setfrom);  // 보내는사람 생략하거나 하면 정상작동을 안함
	        messageHelper.setTo(email);     // 받는사람 이메일
	        messageHelper.setSubject(title); // 메일제목은 생략이 가능하다
	        messageHelper.setText(contents);  // 메일 내용

	        mailSender.send(message);
	    } catch(Exception e){
	        System.out.println(e);
	    }
		
	}

	@Override
	public ArrayList<MemberVO> getAllMember(Criteria cri) {
		
		return memberDao.getAllMember(cri);
	}

	@Override
	public int getTotalCount() {
		
		return memberDao.getTotalCount();
	}

	@Override
	public void updateAuthority(MemberVO mVo) {
		memberDao.updateAuthority(mVo);
		
	}

	
	

	
	
}
