package kr.green.spring.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, 
			HttpServletResponse response, 
			Object handler)
			throws Exception {
		HttpSession session = request.getSession();//현재세션정보를가져오고
		Object user = session.getAttribute("user");//세션에유저가있는지가져오고 없으면널 있으면 가져옴
		//Object 멤버변수를 사용할수 없다는 차이가 있음 널인지아닌지만확인하니까 멤버브이오는 형변환이필요하니까 
		//MemberVO user = (MemberVO)session.getAttribute("user");
		if(user == null) {
			response.sendRedirect(request.getContextPath()+"/");// 절대경로로다시보내줌 비회원이면 메인페이지로가라 
		}
		return true;
	}
}
