<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


		
		<%! // 선언문 @ 인스턴스가 살아있는 동안 변수도 같이 살아있음.
		int count = 0;
		%>
		<% // 스크립트릿 @ 요청이 들어올 때마다 재선언됨. 
		int localcount = 0;
		%>
		
		<%
		count++;
		localcount++;
		%>
		
		<p>누적 접속자 수( 선언문 ) : <%= count %><p>
		<p>누적 접속자 수( 스크립트릿 ) : <%= localcount %><p>









</body>
</html>