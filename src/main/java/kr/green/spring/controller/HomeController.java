package kr.green.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
//컨트롤러 어노테이션으로 @Controller가 붙으면 컨트롤러로 인식
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	//@RequestMapping :클라이언트에서 요청하는 URL을 MVC패턴의 컨트롤러 내의 클래스 혹은 메소드에 매핑시킴으로서 
	//				      해당 URL에 해당하는 경로를 지정하고 처리를 가능케 해주는 어노테이션
	//					=>요청url을 어떤 매서드가 처리할지 매핑해주는 어노테이션이라고 생각하면됨
	//@RequestMapping : 서버부분을 제외한 URL이 /이고 방식이 get이면 home메소드를 실행
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model,String id,Integer num1,Integer num2,Integer number) {
		logger.info("메인페이지 실행");
		
		//model은 화면과 관련된 정보를 저장하는 객체
		//model.addAttribute는 화면에 serverTime이라는 변수를 추가하는 기능을 가진 메소드
		model.addAttribute("serverTime", "안녕하세요." );
		model.addAttribute("name",id);
		
		//${속성명}
		
		if(num1 != null && num2 != null) {
			model.addAttribute("c",num1+num2);
		}
		model.addAttribute("a",num1);
		model.addAttribute("b",num2);
		
		
		if(number == null) 
			number=0;
		else 
			number++;
			
		model.addAttribute("cnt",number);	
			
		
		//사용자에게 home.jsp를 보내준다.
		return "home";
	}
	
	
	
}
