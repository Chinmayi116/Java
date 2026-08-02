import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HeaderServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        String browser = request.getHeader("User-Agent");
        out.println("Browser: " + browser);
    }
}
