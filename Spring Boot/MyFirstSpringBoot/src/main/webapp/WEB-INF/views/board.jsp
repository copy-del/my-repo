<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="jumbotron text-center">
  <h1>데이터분석 SW엔지니어 양성과정</h1>
  <p>스프링부트를 사용하여, 간단한 게시판을 만들어보자</p>
</div>

<div class="container">
	<div class="panel panel-default">
		<div class="panel-heading">데이터분석과정 게시판</div>
		<div class="panel-body">
			<table class="table table-hover table-striped">
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>조회수</th>
				</tr>
				<!-- request 영역에 저장되어있는 데이터들을 꺼내서 출력하라 -->
				<c:forEach items="${boardList}" var="b">
				<tr>
					<td>${b.	bnum}</td>
					<td>${b.	title}</td>
					<td>${b.	writer}</td>
					<td>${b.	bcnt}</td>
				</tr>
				</c:forEach>
				<tr>
					<td colspan="4">
						<button onclick="location.href='insert'" class="btn btn-primary btn-sm">글쓰기</button>
					</td>
				</tr>
			</table>
		</div>
	</div>
</div>





</body>
</html>