package S1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FlowerServlet
 */
@WebServlet("/FlowerServlet")
public class FlowerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlowerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=Windows-31J");
		PrintWriter out = response.getWriter();

		out.println("<h1>西洋石楠花</h1>");
		out.println("<hr>");
		out.println("<h3>花の名前は、「サフォー」です。</h3>");
		out.println("<img src=\"flower.jpg\">");
	}

}
