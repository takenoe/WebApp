package S1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Text2
 */
@WebServlet("/Text2")
public class Text2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Text2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("Windows-31J");

		String name = request.getParameter("bsName");
		HttpSession session = request.getSession();

		String compName = (String) session.getAttribute("comp_name");
		String empName = (String) session.getAttribute("emp_name");

		response.setContentType("text/html;charset=Windows-31J");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>222</title>");
		out.println("</head>");
		out.println("<body>");

		out.print("<h1>åãâ ï\é¶</h1>");
		out.print("<hr>");
		out.print("<a>" + compName + "é–ÅB" + "ïîèêñºÇÕ" + name + "ÇÃ" + empName + "Ç≥ÇÒÇ≈Ç∑</a>");
		out.print("<hr>");

		out.println("</body>");
		out.println("</html>");


	}

}
