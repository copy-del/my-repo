<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

			<% 
			String num1 = request.getParameter("num1"); 
			String num2 = request.getParameter("num2");
			String cal = request.getParameter("cal");
			int result =0;
			
			int inum1 = Integer.parseInt(num1);
			int inum2 = Integer.parseInt(num2);
			
			
			String a = "";
			
			switch(cal){
			case "plus" : result=inum1+inum2; a="+"; break;
			case "min" : result=inum1-inum2; a="-"; break;
			case "gob" : result=inum1*inum2; a="*"; break;
			case "nan" : result=inum1/inum2; a="/"; break;
			}
			
			%>
			<%=
			inum1+a+inum2%>=<%=result
			%>



</body>
</html>