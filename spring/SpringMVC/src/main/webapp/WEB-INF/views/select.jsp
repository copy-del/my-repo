<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="cpath" value="${pageContext.request.contextPath}"></c:set>

<!-- 1.request영역에 저장된 정보를 가져오시오. -->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Forty by HTML5 UP</title>
		<meta charset="UTF-8" />
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="resources/assets/css/main.css" />
		<!-- jQuery library -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

		<!-- Latest compiled JavaScript -->
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	</head>
	<style>
	
	</style>
	<body style="text-align: center;">
		<!-- Wrapper -->
			<div id="wrapper">
				<!-- Menu -->
					<nav id="Update">	
					<h2>회원관리페이지</h2>
					<form class="form-inline" onsubmit="return false">
								<!-- onsubmit="return false" : js 로 처리하기 위해
								엔터 또는 새로고침 이후 서버로 전송 X -->
						<div class="dropdown">
							<table>
								<tr>
									<td><label for="search">검색</label></td>
									<td><input type="text" id="search" class="form-control" placeholder="검색어 입력">
										<ul class="dropdown-menu">
											<li><a href=""></a></li>
										</ul>
									</td>
								</tr>
							</table>
						</div>
					</form>
						<table>
							<caption><h2>회원관리페이지</h2></caption>
							<!-- foreach문을 사용해서 전체회원 Email,tel,address 출력하기 -->	
							<c:forEach items="${mvo}" var="mvo" varStatus="status">
							<tr>
								<td>Email:"${mvo.EMAIL}"</td>
								<td>Tel:"${mvo.TEL}"</td>
								<td>Address:"${mvo.ADDRESS}"</td>
							</tr>
							</c:forEach>
							<!-- 2.모든 회원의 이메일(email),전화번호(tel),주소(address)를 출력하시오. -->
						</table>
					</nav>		
					<a href="./" class="button next scrolly">되돌아가기</a>	
			</div>
		<!-- Scripts -->
			<script src="resources/assets/js/jquery.min.js"></script>
			<script src="resources/assets/js/jquery.scrolly.min.js"></script>
			<script src="resources/assets/js/jquery.scrollex.min.js"></script>
			<script src="resources/assets/js/skel.min.js"></script>
			<script src="resources/assets/js/util.js"></script>
			<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
			<script src="resources/assets/js/main.js"></script>
			<script>
				// 1. input태그를 DOM으로 가져오기
				// 		DOM : 문서 객체 Document Object Model : html문서 구조를 객체로 표현한 것
				$("#search").on("keyup",()=>{
				// 2. input태그에 keyup이벤트 등록
				// 3. 이벤트가 발생할때마다 input태그 안쪽에 있는 글자 가져오기
					let search = $("#search").val();
				// 4. console에 출력
					console.log("가져온 데이터 : ",search);
				
				let data = {
						search : search
				};
			
			$.ajax({
				url:"${cpath}/searchMember",
				data : data,
				success:(res)=>{
					//res : response
					console.log("성공",res);
					//class 명이 dropdown-menu인 태그를 가져와서 기존에 있던 li항목의 데이터를 지워준다.
					$(".dropdown-menu").empty();
					$(".dropdown-menu").css("display","block");
					$.each(res,(i,mvo)=>{
						$(".dropdown-menu").append(`<li>\${mvo.EMAIL}\</li>`)
					});
					//응답 받아온 데이터의 개수만큼 반복문을 통해 li태그 붙혀주기
				},
				error:()=>{
					
				}
			});
			});
			
			</script>
	</body>
</html>

