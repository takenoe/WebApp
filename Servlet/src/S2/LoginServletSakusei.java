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
 * Servlet implementation class LoginServletSakusei
 */
@WebServlet("/LoginServletSakusei")
public class LoginServletSakusei extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServletSakusei() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("Windows-31J");

		String name = request.getParameter("userName");
		if(name == ""){
			name = "������";
		} //Integer.parseInt
		String number = request.getParameter("postCode");
		if(number == ""){
			number = "������";
		}
		String city = request.getParameter("city");
		if(city == ""){
			city = "������";
		}
		String address = request.getParameter("address");
		if(address == ""){
			address = "������";
		}
		String phone = request.getParameter("phone");
		if(phone == ""){
			phone = "������";
		}
		String email = request.getParameter("email");
		if(email == ""){
			email = "������";
		}
		Integer counter = null;

		HttpSession session = request.getSession(true);

		if(session.isNew()){
			counter = 0;
			session.setAttribute("empName", name);
		}else if(session.getAttribute("sessionCounter") == null){
			counter = 0;
		}else{
			counter = (Integer)session.getAttribute("sessionCounter");
		}
		counter = counter + 1;
		session.setAttribute("sessionCounter", counter);
		response.setContentType("text/html;charset=Windows-31J");

		PrintWriter out = response.getWriter();

		out.println("<html>" +
					"<head><title>�o�^���</title></head>" +
					"<body>" +
					"<h1>���O�C�����m�F</h1>" +
					"<hr>" +
					"<h4>�ȉ��̓��e��o�^���܂��B��낵����Ίm�F�{�^���������Ă�������</h4>" +
					"<a>���@�@�@�� : " + name + "</a><br><br>" +
					"<a>�X�֔ԍ� : " + number + "</a><br><br>" +
					"<a>�s���{�� : " + city + "</a><br><br>" +
					"<a>�Z�@�@�@�� : " + address + "</a><br><br>" +
					"<a>�d�b�ԍ� : " + phone + "</a><br><br>" +
					"<a>���[���A�h���X : " + email + "</a><br><br>" +
					"<form method=\"get\" action=\"LoginServletHyoji\">" +
						"<input type=\"submit\" value=\"�o�^\">" +
						"<input type=\"button\" onclick=\"location.href='http://localhost:8080/Servlet/LoginLv1.html'\" value=\"�߂�\">" +
					"</form>" +
					"<a href=\"http://localhost:8080/Servlet/LoginLv1.html\">���͉�ʂɖ߂�</a>" +
					"</body>" +
					"</html>");

	}

}
