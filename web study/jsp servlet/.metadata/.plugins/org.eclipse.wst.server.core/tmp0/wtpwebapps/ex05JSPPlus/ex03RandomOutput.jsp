<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>랜덤 당첨 게임</h1>

<%
String[] items = request.getParameterValues("item");
int randomIndex = (int)(Math.random() * items.length);
String title = request.getParameter("title");
out.print(title);
String randomItem = items[randomIndex];


%>
<p><%= randomItem%> </p>

</body>
</html>