<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>ex07ForwardStart</h1>

<!-- 
Redirect와 Forward의 차이

Redirect
- 클라이언트에게 다시 페이지를 '요청'하는 방식으로 동작
- URL주소에 변화O
- 새로운 request, response 객체 생성
- 데이터를 전달하기 힘들다. (전달하고 싶으면 url파라미터 추가하는 방식)

Forward
- 서버끼리 요청을 '전달'하는 방식으로 동작
- URL주소에 변화 X
- 같은 request, response 객체 사용 가능
- 데이터 전달 쉬움.
- request.setAttribute()

 -->
 
<%
// 데이터 전달
request.setAttribute("name", "o");

// 페이지 재요청 (url 세팅)
RequestDispatcher dp = request.getRequestDispatcher("ex07ForwardEnd.jsp");

// 페이지 이동 (요청, 응답 객체를 같이 보냄)
dp.forward(request, response);
%>



</body>
</html>