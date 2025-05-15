<%@page import="com.smhrd.model.MavenMember"%>
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
로그인 되어있는 상태면 ~~님의 마이페이지 입니다. 노출
로그인 되어있지 않으면 로그인 이후 이용 가능합니다. 노출
 -->

	<%
	MavenMember member = (MavenMember)session.getAttribute("member");
	%>

	<%
	if (member == null) {
	%><h2>
		로그인 이후 이용 가능합니다.
	</h2>
	<a href="Join.html"><button>회원가입</button></a>
	<a href="Login.html"><button>로그인</button></a>	
	<%
	} else {
	%><h2>
		<%=member.getName()%>님의 마이페이지 입니다.
	</h2>
	<a href="Update.html"><button>이름 변경하기</button></a>
	<%
	}
	%>






</body>
</html>