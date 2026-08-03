import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet {
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {

        String[] courses = request.getParameterValues("course");

        PrintWriter out = response.getWriter();
        out.println("Selected Courses:<br>");

        if (courses != null) {
            for (String c : courses) {
                out.println(c + "<br>");
            }
        }
    }
}
