package S1;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TaxServlet
 */
@WebServlet("/TaxServlet")
public class TaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public TaxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("Windows-31J");

		int money = Integer.parseInt(request.getParameter("money"));
		double tax = money * 0.1;
		BigDecimal tax1 = new BigDecimal(tax);
		BigDecimal tax2 = tax1.setScale(0,BigDecimal.ROUND_HALF_UP);
		double total = money + tax;

		response.setContentType("text/html;charset=Windows-31J");

		PrintWriter out = response.getWriter();
		out.println("<html>" +
				"<head>" + "<title>questionnaire</title>" + "</head>" +
				"<body>" + "<h1>消費税計算結果</h1>" + "<hr>" +
				"<table border cellspacing=\"10\">" +
				"<tr>" +
				"<th>金額</th>" +
				"<td>" + money + "</td></tr>" +
				"<tr>" +
				"<th>消費税</th>" +
				"<td>" + tax2 + "</td></tr>" +
				"<tr>" +
				"<th>合計</th>" + "<td>" + total + "</td></tr>" +
				"</table>" +
				"<a href=\"http://localhost:8080/Servlet/tax.html\">アンケート入力に戻る</a>" +
				"</body>" +
				"</html>");

	}

}
