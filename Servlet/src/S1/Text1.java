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
 * Servlet implementation class Text1
 */
@WebServlet("/Text1")
public class Text1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Text1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		request.setCharacterEncoding("Windows-31J");

		String name = request.getParameter("empName");

		String kName = request.getParameter("ksName");


		response.setContentType("text/html;charset=Windows-31J");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>åãâ </title>");
		out.println("</head>");
		out.println("<body>");

		out.print("<h1>åãâ ï\é¶</h1>");
		out.print("<hr");
		out.print("<ul>");
		out.print("<li> é–ñº :" + kName +"</li>");
		out.print("<li> éÅñº :" + name +"</li>");
		out.print("</ul>");
		out.print("<hr>");
		out.print("<form method =\"get\" action =\"Text2\">" +
				"<input type=\"text\" name = \"bsName\">" +
				"<input type =\"submit\" value =\"ëóêM\">");
		out.println("</body>");
		out.println("</html>");
		HttpSession session = request.getSession(true);
		if(session.isNew()){
			session.setAttribute("emp_name", name);
			session.setAttribute("comp_name", kName);
		}
	}

}
