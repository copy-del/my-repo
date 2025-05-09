<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<p>저장된 스코프 값 확인해보기</p>
 <p>page scope : <%= pageContext.getAttribute("test") %></p>
 <p>request scope : <%= request.getAttribute("test") %></p>
 <p>session scope : <%= session.getAttribute("test") %></p>
 <p>application scope : <%= application.getAttribute("test") %></p>








</body>
</html>