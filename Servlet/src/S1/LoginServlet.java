package S1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("Windows-31J");

		String name = request.getParameter("userName");
		if(name.equals("")){
			name = "������";
		}
		String pass = request.getParameter("userPass");
		if(pass.equals("")){
			pass = "������";
		}
		response.setContentType("text/html;charset=Windows-31J");

		PrintWriter out = response.getWriter();
		out.println("<html>" +
					"<head><title>���\��</title></head>" +
					"<body>" +
					"<h1>�o�^���\��</h1>" +
					"<hr>" +
					"<h5>���[�U�[�� :" + name +
					"</h5><br>" +
					"<h5>���͂����p�X���[�h :" + pass + "</h5>" +
					"</body>" +
					"</html>");
	}

}
