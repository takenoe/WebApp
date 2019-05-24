package S1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();


        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<hr><h2>é©å»è–âÓ</h2><table><tr>" +
					"<th>ñºëO</th><td>ê`åπÅiÇµÇÒÇ∞ÇÒÅj</td></tr>" +
					"<tr><th>ååâtå^</th><td>Oå^</td></tr>" +
					"<tr><th>éÔñ°</th>" +
					"<td><ul><li>ÉQÅ[ÉÄ</li>" +
					"<li>ÉAÉjÉÅ</li><li>âfâÊ</li><li>ÉXÉmÅ[É{Å[Éh</li></ul></td></tr>");
		// TODO Auto-generated method stub
	}

}
