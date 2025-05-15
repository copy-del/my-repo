package jkj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// 서블릿을 요청할 때 소괄호 안에 있는 url값을 사용.
@WebServlet("/Servlet00")
// 서블릿 파일을 요청할 때 HttpServlet에 있는 웹 기본 동작(요청-응답)을 사용하기 위해서 상속받음.
// 
public class mlkj extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	// 주석 : JavaDoc 주석
	// - 클래스, 메소드, 필드에 대한 설명을 적을 때 사용 (지워도 상관X)
    public Servlet00() {
    	// 부모 클래스(HttpServlet)의 기본 생성자 호출
        super();
    }
    // 서블릿이 처음 메모리에 올라올 때 딱 1번만 실행되는 메소드
    // 주로 초기화 작업(설정파일 읽기, DB연결)들을 할 때 사용
	public void init(ServletConfig config) throws ServletException {
	}
	
	// 서블릿이 메모리에서 내려가기 직전에 실행되는 메소드
	// 주로 자원 해제(DB연결끊기, 파일정리 등)
	public void destroy() {
	}

	// 클라이언트가 GET방식(기본값)으로 요청했을 때 실행되는 메소드
	// 브라우저 주소창에 URL을 입력해서 엔터! 하는건
	// 기본적으로 GET요청을 보내는 행위.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 자바 기반이기 때문에 자바 문법을 사용할 수 있다.
		int a = 2;
		int b = 5;
		int sum = a+b;
		
		// 클라이언트가 Servlet00 "요청"
		// > servlet00의 doGet() 실행
		// > 로직 실행
		// > 결과값을 "응답"
		
		// response 한글 깨짐 현상 해결 - 인코딩 변경
		// setContentType은 윗쪽에 정의하기.
		response.setContentType("text/html; charset=UTF-8");
		
		// 클라이언트에게 응답(출력)해줄 통로(스트림)
		// 웹페이지에 내용을 띄워주고 싶을 때
		PrintWriter out = response.getWriter();
		
		// out.print() : 웹페이지에 응답해줄(보여줄) 데이터
		// html 골조는 생략이 가능하나 설정을 해야할 시 작성해야 함.
		out.print("<html>");				// 골조
		out.print("<head></head>");			// 골조
		out.print("<body>");				// 골조
		out.print("김호성");
		out.print(sum);
		out.print("</body>");				// 골조
		out.print("</html>");				// 골조
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
