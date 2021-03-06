package S2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServletHyoji
 */
@WebServlet("/LoginServletHyoji")
public class LoginServletHyoji extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServletHyoji() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=Windows-31J");
		HttpSession session = request.getSession();
		String empName = (String)session.getAttribute("empName");
		PrintWriter out = response.getWriter();

		out.println("<html>" +
					"<head><title>登録情報</title></head>" +
					"<body>" +
					"<h1>" + empName + "さんのログイン情報登録しました</h1>" +
					"<hr>" +
					"<h3>ご登録ありがとうございました。</h3>" +
					"<h3>登録されたメールアドレスに送信しています。</h3>" +

					"</body>" +
					"</html>");
		session.invalidate();
	}


}
