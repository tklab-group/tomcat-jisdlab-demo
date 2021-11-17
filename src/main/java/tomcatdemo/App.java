package tomcatdemo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static tomcatdemo.Utility.sleep;

@WebServlet("/home")
public class App extends HttpServlet {
  static int noOfViews = 1;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
    /* start */
    /* section 1 */
    sleep(0.3);
    /* section 2 */
    sleep(0.1);
    /* section 3 */
    sleep(0.3, 5.0, 10);
    /* section 4 */
    sleep(0.2);
    /* end */
    res.setContentType("text/html; charset=utf-8");
    String message = "Hello World!";
    try (PrintWriter out = res.getWriter()) {
      out.println("<html><body>");
      out.println(message + "<br>");
      out.println("views: " + noOfViews++);
      out.println("</body></html>");
    }
  }
}
