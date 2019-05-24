package S1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Formsample
 */
@WebServlet("/Formsample")
public class Formsample extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Formsample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		request.setCharacterEncoding("Windows-31J");

		String name = request.getParameter("empName");

		String kName = request.getParameter("ksName");


		response.setContentType("text/html;charset=Windows-31J");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Investigation</title>");
		out.println("</head>");
		out.println("<body>");
		/**out.println("<h1>dddddsss</h1>");
		out.println("<h1>åãâ ï\é¶</h1>");
		out.println("<hr");
		out.println("<ul>");
		out.println("<li>é–ñº :" + kName +"</li>");
		out.println("<li>éÅñº :" + name +"</li>");
		out.println("</ul>");
		out.println("<hr>");
		out.println("</body>");*/
		out.println("</html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
