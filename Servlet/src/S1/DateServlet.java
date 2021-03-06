package S1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class DateServlet
 */
@WebServlet("/DateServlet")
public class DateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    String[] days = { "", "日", "月", "火", "水", "木", "金", "土" };
    Calendar dayData = Calendar.getInstance();
		int year = dayData.get(Calendar.YEAR);
		int month = dayData.get(Calendar.MONTH)+1;
		int day = dayData.get(Calendar.DATE);
		int week = dayData.get(Calendar.DAY_OF_WEEK);
		int hour = dayData.get(Calendar.HOUR_OF_DAY);
		int minute = dayData.get(Calendar.MINUTE);
		int second = dayData.get(Calendar.SECOND);
		//Date time = dayData.getTime();
	/**@see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html;charset=Windows-31J");
		PrintWriter out = response.getWriter();

		out.println("<h1>本日の日付表示</h1><br><hr>");
		out.println("<table border><tr><th>日付</th>"
					+ "<td>" + year + "/" + month + "/" + day + "</td>"
					+ "</tr></table>");

		out.println("<table border><tr><th>時刻</th>"
					+ "<td>" + hour + ":" + minute + ":" + second + "</td>"
					+ "</tr></table>");

		out.println("<table border><tr><th>曜日</th>"
					+ "<td>" + days[week] + "曜日" + "</td>"
					+ "</tr></table>");
		//out.println(year + "/" + month + "/" + day);


	}

}
