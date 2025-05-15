<%@page import="com.smhrd.model.MavenMember"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<html>
<body>
<h2>호성의 홈페이지</h2>

	<%
	MavenMember member = (MavenMember)session.getAttribute("member");
	%>
	<%
	// member == 회원가입해서 가져온 사용자 정보가 없으면~ 회원가입,로그인 표시
	if(member==null){%>
	<a href="Join.html"><button>회원가입</button></a>
	<a href="Login.html"><button>로그인</button></a>	
	<% } else{%>
		<h2>
		<%= member.getName() %>님 환영합니다
		</h2>
		<a href="LogoutController2"><button>로그아웃</button></a>
		<a href="Mypage.jsp"><button>마이페이지</button></a>
	<% } %>




</body>
</html>
