package S3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.QuestionnaireBean;
/**
 * Servlet implementation class ControlServlet2
 */
@WebServlet("/ControlServlet2")
public class ControlServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("Windows-31J");

		String action = request.getParameter("actionParam");
		String forwardUrl = null;
		String name = request.getParameter("userName");
		String cos = request.getParameter("cos");
		String lv = request.getParameter("cos");
		if(action.equals("questionnaire")){
			QuestionnaireBean userData = new QuestionnaireBean();

			HttpSession session = request.getSession(true);
			//session.setAttribute("message", con);
			RequestDispatcher re =request.getRequestDispatcher("JSP/insert.jsp");
			re.forward(request, response);
		}else{
			forwardUrl = "/JSP/menu1.jsp";
		}

	}

}
