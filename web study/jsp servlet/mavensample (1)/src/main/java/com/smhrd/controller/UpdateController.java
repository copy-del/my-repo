package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.javassist.compiler.ast.Member;

import com.smhrd.model.MavenMember;
import com.smhrd.model.MemberDAO;

@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	/*
	 * 1. 파라미터로 받은 값을 가져오기
	 * 2. 1번 값들을 객체로 묶기
	 * 3. dao 객체 생성
	 * 4. dao의 update 메소드 실행 (2번 객체를 인자값으로)
	 * 5. 4번 메소드의 리턴값에 따라서 마무리 로직 수행
	 * */
		
	HttpSession session = request.getSession();
	MavenMember sessionMember = (MavenMember) session.getAttribute("member");
	String id = sessionMember.getId();
		
	String name = request.getParameter("name");
	
	MavenMember member = new MavenMember(id, null, name);
	
	MemberDAO dao = new MemberDAO();
	
	int result = dao.update(member);
	System.out.println(result);
	
	// 세션에 member를 등록 (로그인 한 순간)
	// 세션 내 정보도 갱신
	if(result>0) {
		session.setAttribute("member", member);
		response.sendRedirect("Mypage.jsp");
	}
	
	
		
		
	
	
	}

}
