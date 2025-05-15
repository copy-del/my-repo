<%@page import="com.smhrd.model.MavenMember"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<body>
	<h2>호성의 홈페이지</h2>

	<%
	MavenMember member = (MavenMember) session.getAttribute("member");
	%>

	<% if (member == null) { %>
	<a href="Join.html"><button>회원가입</button></a>
	<a href="Login.html"><button>로그인</button></a>
	<% } else { %>
		<h3>
		<%= member.getName() %> 님 환영합니다
		</h3>
		<a href="LogoutController"><button>로그아웃</button></a>
		<a href="Mypage.jsp"><button>마이페이지</button></a>
	<% } %>


</body>
</html>
