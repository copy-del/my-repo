package pack01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	
	// 클라이언트가 POST 방식으로 요청햇을 때 실행될 메소드
	// Post 방식은 패킷의 body 영역에 데이터를 담아서 전송해주는 형식
	// > 가져온 데이터를 다시 인코딩 해줘야함.
	// URL이 기본적으로 UTF-8로 되어있기 때문에 인코딩 해주지 안해도됨.
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		
		out.print(id);
		out.print("님 환영합니다");
	}

}
