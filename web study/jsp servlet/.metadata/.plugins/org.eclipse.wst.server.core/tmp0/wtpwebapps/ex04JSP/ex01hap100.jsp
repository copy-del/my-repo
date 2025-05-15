<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<!-- 
		스크립트릿 :  / JSP내부에서 JAVA코드를 사용할 수 있는 공간.
		표현식 :  / HTML과 같이 출력될 수 있는 공간.
		
		1~ 100까지의 합
		 -->
		 <% // 1부터 100 까지 
		 int sum = 0;
		 for(int i =1; i<=100; i++){
		 sum+=i;}%>
		 
		 <p>1부터 100까지의 합은 :
		 <%= sum %>
		 </p>
		 
</body>
</html>