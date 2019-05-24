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
 * Servlet implementation class SessionTest
 */
@WebServlet("/SessionTest")
public class SessionTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=Windows-31J");

		HttpSession session = request.getSession(true);
		String empName = (String)session.getAttribute("empName");
		if(session.isNew()){
			empName = "新規";
		}
		PrintWriter out = response.getWriter();

		out.println("<html>" +
					"<head><title>セッションテスト</title></head>" +
					"<body>" +
					"<h1>" + empName + "さんです。</h1>" +
					"</body>" +
					"</html>");

	}

}
