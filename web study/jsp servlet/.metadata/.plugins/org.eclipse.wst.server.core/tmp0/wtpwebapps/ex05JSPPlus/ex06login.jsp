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
받아온 아이디 비번 값을 변수에 저장하고
id pw 둘다 일치하면
ex06loginSuccess

다르면
ex06loginFail
 -->

			<%
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			String url = "";
			
			if ("smart".equals(id) && "123".equals(pw)){
				
				url = "ex06loginSuccess.jsp?id=smart";
				
			}
			else{
				url = "ex06LoginFail.jsp";
			}
			
			response.sendRedirect(url);
			
			
			
			%>







</body>
</html>