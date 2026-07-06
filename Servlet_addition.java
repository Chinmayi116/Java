<!DOCTYPE html>
<html>
<body>

<form action="AddServlet" method="post">
    Number 1:
    <input type="text" name="num1"><br><br>

    Number 2:
    <input type="text" name="num2"><br><br>

    <input type="submit" value="Add">
</form>

</body>
</html>

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AddServlet extends HttpServlet {

    public void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        int a = Integer.parseInt(request.getParameter("num1"));
        int b = Integer.parseInt(request.getParameter("num2"));

        int sum = a + b;

        out.println("<h2>Sum = " + sum + "</h2>");
    }
}
