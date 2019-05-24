package S1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckServlet
 */
@WebServlet("/CheckServlet")
public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("Windows-31J");

		String name = request.getParameter("userName");
		if(name.equals("")){
			name = "������";
		}
		String cosName = request.getParameter("coss");

		String rkd = request.getParameter("rikai");
		if(rkd == null){
			rkd = "������";
		}else if(Integer.parseInt(request.getParameter("rikai")) == 3){
			rkd = "�悭�����ł���";
		}else if(Integer.parseInt(request.getParameter("rikai")) == 2){
			rkd = "�����ł���";
		}else if(Integer.parseInt(request.getParameter("rikai")) == 1){
			rkd = "�����ł��Ȃ�����";
		}
		response.setContentType("text/html;charset=Windows-31J");

		PrintWriter out = response.getWriter();
		out.println("<html>" +
					"<head>" + "<title>questionnaire</title>" + "</head>" +
					"<body>" + "<h1>�A���P�[�g�̕\��</h1>" + "<hr>" +
					"<table border cellspacing=\"10\">" +
					"<tr>" +
					"<th>����</th>" +
					"<td>" + name + "</td></tr>" +
					"<tr>" +
					"<th>�R�[�X</th>" +
					"<td>" + cosName + "</td></tr>" +
					"<tr>" +
					"<th>����x</th>" + "<td>" + rkd + "</td></tr>" +
					"</table>" +
					"<a href=\"http://localhost:8080/Servlet/cheack.html\">�A���P�[�g���͂ɖ߂�</a>" +
					"</body>" +
					"</html>");
	}

}
