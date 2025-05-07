package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do") // ~~.do로 끝나는 모든 요청 처리
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI(); //  mavenMember/join.do
		String ctx = request.getContextPath(); // mavenMember
		String command = uri.substring(ctx.length()); // /join.do
		
		Controller controller = null;
		
		switch(command) {
		case "/join.do" :
			// 가입 처리할 수 있는 컨트롤러 생성
			controller = new JoinController();
			break;
		case "/login.do" :
			controller = new LoginController();
			break;
		case "/update.do" :
			controller = new UpdateController();
			break;
		}
		
		// 각 컨트롤러가 가지고 있는 execute 메소드 실행
		String nextPage = controller.execute(request, response);
		
		// 결과 페이지로 forward
		RequestDispatcher rd = request.getRequestDispatcher(nextPage);
		rd.forward(request, response);
	
	}

}
