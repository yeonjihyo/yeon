package kr.green.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.green.spring.dao.MemberDAO;
import kr.green.spring.service.MemberService;
import kr.green.spring.vo.MemberVO;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	private JavaMailSender mailSender;
	
	//서버부분을 제외한 URL이 /이고, 방식이 GET이면 home메소드를 실행
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		logger.info("메인페이지 실행");
		
		
		
		//사용자에게 home.jsp를 보내준다.
		return "home";
	}
	//회원가입
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signupGet(Model model) {
		logger.info("회원가입페이지 실행");
		
		return "signup";
	}
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signupPost(MemberVO mVo) {
		logger.info("회원가입 진행중");
	
		
		//성공하면 메인 아니면 signup페이지에 
		if(memberService.singup(mVo))
			return "redirect:/";
		else
		//redirect:/ POST에서 작업을 하고 signup이라는 URI를 GET방식으로 가라 
		return "redirect:/signup";
	}
	//로그인
	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public String signinGet(Model model) {
		logger.info("로그인 페이지 실행");
		
		return "signin";
	}
	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public String signinPost(Model model, MemberVO mVo) {
		logger.info("로그인 페이지 진행중");
		System.out.println(mVo);
		MemberVO user=memberService.signin(mVo);//
		//서비스에게 회원여부를 확인해서 회원이맞으면 메인페이지로 아니면 singin페이지로 
		if(user != null) {
			model.addAttribute("user",user);
			return "redirect:/";
		}
		return "redirect:/signin";
	}
	//회원정보수정
	@RequestMapping(value = "/member/modify", method = RequestMethod.GET)
	public String MemberModifyGet() {
		logger.info("회원정보수정 페이지 실행");
		
		return "/member/modify";
	}
	@RequestMapping(value = "/member/modify", method = RequestMethod.POST)
	public String MemberModifyPost(MemberVO mVo,String oldPw) {
		logger.info("회원정보수정 진행중");
//		System.out.println(mVo);
//		System.out.println(oldPw);//콘솔에 찍어서 확인 
		if(memberService.modify(mVo,oldPw)) {
			return "redirect:/";
		}
		return "redirect:/member/modify";
	}
	@RequestMapping(value="/signout")//메소드안쓰면 get,post 둘다 적용됨
	public String signout(HttpServletRequest request) {
		HttpSession session =request.getSession();
		session.removeAttribute("user");
		return "redirect:/";
	}
	//아이디 중복체크
	@RequestMapping(value ="/dup")
	@ResponseBody
	public Map<Object, Object> idcheck(@RequestBody String id){

	    Map<Object, Object> map = new HashMap<Object, Object>();
	    //변수 id에 저장된 아이디가 회원아이디인지 아닌지 확인하여 isMember변수에 담아 보낸다
	    
	    boolean isMember= memberService.isMember(id); 
	    map.put("isMember",isMember);
	    return map;
	}
	
	@RequestMapping(value = "/mail/mailForm")
	public String mailForm() {

	    return "mail";
	}  

	// mailSending 코드
	@RequestMapping(value = "/mail/mailSending")
	public String mailSending(HttpServletRequest request) {

	    String setfrom = "stajun@naver.com";         
	    String tomail  = request.getParameter("tomail");     // 받는 사람 이메일
	    String title   = request.getParameter("title");      // 제목
	    String content = request.getParameter("content");    // 내용

	    try {
	        MimeMessage message = mailSender.createMimeMessage();
	        MimeMessageHelper messageHelper 
	            = new MimeMessageHelper(message, true, "UTF-8");

	        messageHelper.setFrom(setfrom);  // 보내는사람 생략하거나 하면 정상작동을 안함
	        messageHelper.setTo(tomail);     // 받는사람 이메일
	        messageHelper.setSubject(title); // 메일제목은 생략이 가능하다
	        messageHelper.setText(content);  // 메일 내용

	        mailSender.send(message);
	    } catch(Exception e){
	        System.out.println(e);
	    }

	    return "redirect:/mail/mailForm";
	}
	
}
