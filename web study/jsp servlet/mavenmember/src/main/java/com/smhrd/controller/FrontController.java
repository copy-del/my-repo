package com.smhrd.controller;

import java.io.IOException;
import java.lang.ModuleLayer.Controller;
import java.util.ResourceBundle.Control;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do") // ~ do 로 끝나는 요청 처리.
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String uri = request.getRequestURI(); // mavenMember/join.do까지 가져오는 string uri
		String ctx = request.getContextPath(); // mavenMember 만 가져오는 string ctx
		
		String command = uri.substring(ctx.length()); // join.do 만 빼왔음.
		
		Controller controller = null;
		
		switch(command) {
		case "/join.do" : 
			// 가입처리를 하는 컨트롤러 생성.
			controller = new JoinController();
			break;
		
		case "/login.do" :
			controller = new LoginController();
			break;
			
		case "/update.do" :
			controller = new UpdateController();
		}
		// 각 컨트롤러가 가지고 있는 execute 메소드 실행.
		String nextPage = controller.execute(request,response);
		
		// 결과 페이지로 forward
		RequestDispatcher rd = request.getRequestDispatcher(nextPage);
		rd.forward(request, response);
		
//		case "/.do" :
		
		
		
	}

}
