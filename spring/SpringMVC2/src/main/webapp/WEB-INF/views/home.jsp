<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<!-- Spring MVC 흐름
    1) 요청
    2) Dispatcher Servlet (Front Controller패턴)
       : 모든 요청을 받는다.
    3) Handler Mapping : 해당 요청을 받아줄 수 있는
         controller를 찾아준다.
    4) Handler Adapter : controller를 실행 시킨다.
    5) controller : 실제로 기능을 수행한다.
    6) service - Repository - DB
    7) 핵심 기능 실행 후, viewname을 반환
       * viewname : 이동하고 싶은 페이지의 파일명(확장자x)
      main.jsp -> main, Login.jsp -> Login
    8) viewname을 풀네임으로 작업해주는 "viewResolver"
      접두사 + viewname + 접미사는 붙히지 않는다.
      * 접두사 : 해당 파일이 저장된 디렉토리 주소
         ex) src/main/..
      * 접미사 : 파일의 확장자 (.jsp)
    9) view로 이동
  
 Spring에서는  jsp파일 단독 실행 불가
	  -> Spring Framework view를 구성하는 
	     파일을 WEB-INF 보안 폴더에 숨겨둔다.
	    * 해당하는 폴더에 접근하기 위해서는 
	      servlet파일을 사용해서 접근해야한다!
	-> servlet파일
	(=Front Controller역할을 하는 Dispatcher Servlet)
	  * 개발자 생성X, Spring 자동 생성
	-> Pojo(일반 자바 클래스, 컨트롤러)
	   * 개발자 생성 O
	      

 -->
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
