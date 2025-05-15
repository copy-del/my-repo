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



	<form action="ex03RandomOutput.jsp" method="get">
		주제 :<input type="text" name="title"><br>
		<%
		int num = Integer.parseInt(request.getParameter("num"));
		for (int i = 1; i <= num; i++) {
			out.print("<a>아이템</a>");
			out.print("<input type = 'text' name = 'item'><br>");
		}
		%>
		<input type="submit" value="랜덤뽑기">

	</form>



</body>
</html>