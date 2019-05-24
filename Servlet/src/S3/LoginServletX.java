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
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServletX
 */
@WebServlet(
		urlPatterns = { "/LoginServletX" },
		initParams = {
				@WebInitParam(name = "userId", value = "1001"),
				@WebInitParam(name = "userName", value = "大阪　花子"),
				@WebInitParam(name = "userPassword", value = "Hanako*1")
		})
public class LoginServletX extends HttpServlet {
	private static final long serialVersionUID = 1L;
		String id = null;
		String pass = null;
		String userName = null;
		public void init() {
        //(1)GenericServletクラスのgetServletConfigメソッドを使用し、
        //   ServletConfigオブジェクトを取得します。
        ServletConfig sc = getServletConfig();
        //(2)パラメータ名"id"のパラメータ値を取得しています。
        id = sc.getInitParameter("userId");
        //(3)パラメータ名"pass"のパラメータ値を取得しています。
        pass = sc.getInitParameter("userPassword");
        userName = sc.getInitParameter("userName");
    }
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServletX() {
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

		String userID = request.getParameter("userId");
		String userPAS = request.getParameter("userPas");

		response.setContentType("text/html;charset=Windows-31J");

		PrintWriter out = response.getWriter();
		if(userID.equals(id) && userPAS.equals(pass)){
			HttpSession session = request.getSession(true);
			if(session.isNew()){
				session.setAttribute("name", userName);
				session.setAttribute("ID", userID);
				out.println("<html>" +
							"<head><title>Login</title></head>" +
							"<body>" +
							"<h1>ログイン結果</h1>" +
							"<hr>" +
							"<a>ようこそ" + userName + "さん</a>" +
							"</body>" +
							"</html>");
			}else{
				session.invalidate();
			}

		}else{
			out.println("<html>" +
						"<head><title>Login</title></head>" +
						"<body>" +
						"<h1>ログイン結果</h1>" +
						"<hr>" +
						"<a>ログインできません</a>" +
						"</body>" +
						"</html>");
		}
	}

}
