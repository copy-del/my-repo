

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ex03Logout")
public class ex03Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ex03Logout() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 로그아웃을 위해 세션 무효화
		
		HttpSession session = request.getSession();
		if (session != null) {
		session.invalidate();
		}	
		// 로그인 폼으로 이동
		response.sendRedirect("ex03LoginForm.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
