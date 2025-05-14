<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<c:set var="cpath" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>보유 도서 현황</h1>

<table class="table" border="1">
<tr>
	<td>번호</td>
	<td>제목</td>
	<td>작가</td>
	<td>출판사</td>
	<td>ISBN</td>
	<td>보유도서수</td>
</tr>
	<c:forEach items="${list}" var="list" varStatus="status">						
		<tr>
			<td>${list.num}</td>
			<td>${list.title}</td>
			<td>${list.author}</td>
			<td>${list.company}</td>
			<td>${list.isbn}</td>
			<td>${list.count}</td>
		</tr>
	</c:forEach>
</table>
<form action="bookInsert.do" method="post">
<li><input id="inputtitle" type="text" name="title" placeholder="제목 :"></li>
<li><input id="inputauthor" type="text" name="author" placeholder="작가 :"></li>
<li><input id="inputcompany" type="text" name="company" placeholder="출판사 :"></li>
<li><input id="inputisbn" type="text" name="isbn" placeholder="ISBN :"></li>
<li><input id="inputcount" type="text" name="count" placeholder="보유도서 수 :"></li>
<li><input type="submit" value="등록" class="button fit"></li>
</form>


</body>
</html>