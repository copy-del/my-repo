<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String id = (String)session.getAttribute("id");
if (id==null){
	//로그인을 안했으면 로그인 폼으로 보내기
	response.sendRedirect("ex03LoginForm");
}
%>
<h2><%= id %>님의 마이페이지 입니다.</h2>

<a href="ex03Main.jsp">메인페이지</a>
<a href="ex03Logout">로그아웃</a>
</body>
</html>