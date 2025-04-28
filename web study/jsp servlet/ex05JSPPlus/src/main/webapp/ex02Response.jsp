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
		String name = request.getParameter("name");
		int Java = Integer.parseInt(request.getParameter("Java"));
		int Web = Integer.parseInt(request.getParameter("Web"));
		int loT = Integer.parseInt(request.getParameter("loT"));
		int Android = Integer.parseInt(request.getParameter("Android"));
		
		int sum = (Java+Web+loT+Android)/4;
		if(sum >=60){
			out.print(name+"pass");
		}
		else{
			out.print(name+"재시험");
		}
%>



</body>
</html>