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

if (id == null){
	
}
%>


<h2><%= id %>님 환영합니다.</h2>

<a href="ex03MyPage.jsp">마이페이지</a>
<a href="ex03Logout">로그아웃</a>
</body>
</html>