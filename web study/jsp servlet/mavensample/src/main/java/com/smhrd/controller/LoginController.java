package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.MavenMember;
import com.smhrd.model.MemberDAO;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	MavenMember member = new MavenMember(id,pw);
	
	MemberDAO dao = new MemberDAO();
	
	MavenMember result = dao.login(member);
	System.out.println(result);
	
	if(result==null) {
		//로그인 실패 > 다시 login.html로 이동
		response.sendRedirect("login.html");
	} else {
		// 로그인 성공
		// 사용자 정보를 담은 세션 생성
		HttpSession session = request.getSession();
		session.setAttribute("member", result);
		response.sendRedirect("index.jsp");		
	}
	
	
	
	}

}
