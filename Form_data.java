import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet {
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("username");
        String age = request.getParameter("age");

        PrintWriter out = response.getWriter();
        out.println("Name: " + name);
        out.println("<br>Age: " + age);
    }
}
