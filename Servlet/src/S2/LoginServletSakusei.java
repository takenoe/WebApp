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
			name = "未入力";
		} //Integer.parseInt
		String number = request.getParameter("postCode");
		if(number == ""){
			number = "未入力";
		}
		String city = request.getParameter("city");
		if(city == ""){
			city = "未入力";
		}
		String address = request.getParameter("address");
		if(address == ""){
			address = "未入力";
		}
		String phone = request.getParameter("phone");
		if(phone == ""){
			phone = "未入力";
		}
		String email = request.getParameter("email");
		if(email == ""){
			email = "未入力";
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
					"<head><title>登録情報</title></head>" +
					"<body>" +
					"<h1>ログイン情報確認</h1>" +
					"<hr>" +
					"<h4>以下の内容を登録します。よろしければ確認ボタンを押してください</h4>" +
					"<a>氏　　　名 : " + name + "</a><br><br>" +
					"<a>郵便番号 : " + number + "</a><br><br>" +
					"<a>都道府県 : " + city + "</a><br><br>" +
					"<a>住　　　所 : " + address + "</a><br><br>" +
					"<a>電話番号 : " + phone + "</a><br><br>" +
					"<a>メールアドレス : " + email + "</a><br><br>" +
					"<form method=\"get\" action=\"LoginServletHyoji\">" +
						"<input type=\"submit\" value=\"登録\">" +
						"<input type=\"button\" onclick=\"location.href='http://localhost:8080/Servlet/LoginLv1.html'\" value=\"戻る\">" +
					"</form>" +
					"<a href=\"http://localhost:8080/Servlet/LoginLv1.html\">入力画面に戻る</a>" +
					"</body>" +
					"</html>");

	}

}
