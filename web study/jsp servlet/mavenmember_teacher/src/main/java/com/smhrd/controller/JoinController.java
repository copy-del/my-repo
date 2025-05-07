package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.MemberDAO;
import com.smhrd.model.MemberVO;

public class JoinController implements Controller {
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
	
		// join에서 "요청"하면서 보내준 데이터를 뽑아야 함
		// - id, pw, tel, address
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");
		
		MemberVO member = new MemberVO(id, pw, tel, address);
		
		MemberDAO dao = new MemberDAO();
		
		int result = dao.join(member);
		System.out.println(result);
		
		if(result > 0) {
			HttpSession session = request.getSession();
			session.setAttribute("member", member);
			// RequestDispatcher rd = request.getRequestDispatcher("join_success.jsp");
			// rd.forward(request, response);
			return "/join_success.jsp";
		} else {
			// response.sendRedirect("main.jsp");
			return "/main.jsp";
		}
		
		
		}
		
		
	}

	


