<%@page import="com.smhrd.model.MavenMember"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 로그인 되어있는 상태면 p태그 - ~~님의 마이페이지입니다 노출 -->
	<!-- 로그인 되어있지 않으면 로그인 후 이용가능합니다 -->
	<% MavenMember member = (MavenMember)session.getAttribute("member"); %>
	
	<% if(member==null) { %>
	<p>로그인 후 이용가능합니다</p>
	<%} else { %>
	<p> <%= member.getName() %>님의 마이페이지입니다 </p>
	<a href="Update.html"><button>이름 변경하기</button></a>
	<% } %>
	
	
</body>
</html>