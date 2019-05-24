package S3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class Healthcheck
 */
@WebServlet("/Healthcheck")
public class Healthcheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Healthcheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("Windows-31J");
		String height = (String)request.getParameter("height");
		String weight = (String)request.getParameter("weight");

		CalcBeans calc = new CalcBeans();
		int calc1 = calc.bWeight(height,weight);




		HttpSession session = request.getSession(true);
		session.setAttribute("message", calc1);
		RequestDispatcher re =request.getRequestDispatcher("JSP/result.jsp");
		re.forward(request, response);
	}

}
