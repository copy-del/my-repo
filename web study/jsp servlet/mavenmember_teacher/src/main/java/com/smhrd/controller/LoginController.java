package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.MemberDAO;
import com.smhrd.model.MemberVO;

public class LoginController implements Controller {
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		MemberVO member = new MemberVO(id, pw);
		MemberDAO dao = new MemberDAO();
		MemberVO result = dao.login(member);
		if (result == null) { // 실패
			//response.sendRedirect("main.jsp");
			return "/main.jsp";
		} else { // 성공
			HttpSession session = request.getSession();
			session.setAttribute("member", result);
			//response.sendRedirect("main.jsp");
			return "/main.jsp";
		}
	}
}
