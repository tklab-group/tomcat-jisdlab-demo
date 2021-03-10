package tomcatdemo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/home")
public class App extends HttpServlet {
  static int noOfViews = 0;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
    /* start */
    /* section 1 */
    sleep(0.3);
    /* section 2 */
    sleep(0.1);
    /* section 3 */
    sleep(5.0);
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

  void sleep(double seconds) {
    try {
      Thread.sleep((int) (seconds * 1000));
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
