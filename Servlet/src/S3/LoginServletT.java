package S3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServletT
 */
@WebServlet(
		urlPatterns = { "/LoginServletT" },
		initParams = {
				@WebInitParam(name = "userId", value = "1001"),
				@WebInitParam(name = "userName", value = "���@�Ԏq"),
				@WebInitParam(name = "userPassword", value = "Hanako*1")
		})
public class LoginServletT extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String id = null;
	String pass = null;
	String userName = null;
	public void init() {
        //(1)GenericServlet�N���X��getServletConfig���\�b�h���g�p���A
        //   ServletConfig�I�u�W�F�N�g���擾���܂��B
        ServletConfig sc = getServletConfig();
        //(2)�p�����[�^��"id"�̃p�����[�^�l���擾���Ă��܂��B
        id = sc.getInitParameter("userId");
        //(3)�p�����[�^��"pass"�̃p�����[�^�l���擾���Ă��܂��B
        pass = sc.getInitParameter("userPassword");
        userName = sc.getInitParameter("userName");
    }
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServletT() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("Windows-31J");

		String userID = request.getParameter("userId");
		//String userPAS = request.getParameter("userPas");

		response.setContentType("text/html;charset=Windows-31J");

		PrintWriter out = response.getWriter();
		if(userID.equals(id) ){
			out.println("<html>" +
						"<head><title>Login</title></head>" +
						"<body>" +
						"<h1>���O�C������</h1>" +
						"<hr>" +
						"<a>�悤����" + userName + "����</a>" +
						"</body>" +
						"</html>");
		}else{
			out.println("<html>" +
						"<head><title>Login</title></head>" +
						"<body>" +
						"<h1>���O�C������</h1>" +
						"<hr>" +
						"<a>���O�C���ł��܂���</a>" +
						"</body>" +
						"</html>");
		}
	}

}
