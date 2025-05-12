<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>board.jsp로 요청 완료</h1>

	<div class="jumbotron text-center">
		<h1>데이터분석 SW엔지니어 양성과정</h1>
		<p>Spring을 이용해서 간단한 게시판을 만들어보자</p>
	</div>
	<div class="container">
		<div class="panel panel-default">

			<div class="panel-heading">게시판</div>

			<div class="panel-body">
				<table class="table table-boredered" border="1">
					<tr>
						<td>게시글 번호</td>
						<td>제목</td>
						<td>작성자</td>
						<td>작성일</td>
					</tr>
					<!-- JSTL(Jsp Tag Livbrary) : JSP 표준 라이브러리
						JSP에서 for문, if문을 구현하는 태그 라이브러리
					 -->
					<%
					for (int i = 0; i < 5; i++) {
					%>
					<a href="login.jsp"> <%
 					}
 					%> <c:forEach items="${list}" var="bvo">
							<!-- 여기부터 반복할 코드 작성
					model에 담긴 list에서 차례대로 하나씩 꺼내주는데 bvo라는 이름으로 꺼내준다. -->
							<tr>
								<td>${bvo.IDX}</td>
								<td>${bvo.TITLE}</td>
								<td>${bvo.WIRTER}</td>
								<td>${bvo.INDATE}</td>

							</tr>

						</c:forEach>
				</table>
			</div>

		</div>

	</div>

</body>
</html>