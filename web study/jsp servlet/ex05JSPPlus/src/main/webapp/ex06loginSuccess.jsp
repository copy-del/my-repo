<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>로그인 성공</h1>

<%
String user = request.getParameter("id");
%>

<h1><%=user %> 환영합니다. </h1>

</body>
</html>