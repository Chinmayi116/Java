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
}<form action="MyServlet" method="post">
    <input type="checkbox" name="course" value="Java"> Java
    <input type="checkbox" name="course" value="Python"> Python
    <input type="checkbox" name="course" value="PHP"> PHP
    <br>
    <input type="submit" value="Submit">
</form>
