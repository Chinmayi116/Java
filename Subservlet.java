<!DOCTYPE html>
<html>
<head>
    <title>Subtraction</title>
</head>
<body>
    <h2>Subtract Two Numbers</h2>

    <form action="SubServlet" method="post">
        Number 1: <input type="text" name="num1"><br><br>
        Number 2: <input type="text" name="num2"><br><br>

        <input type="submit" value="Subtract">
    </form>
</body>
</html>
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SubServlet extends HttpServlet {

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
                       throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        int a = Integer.parseInt(request.getParameter("num1"));
        int b = Integer.parseInt(request.getParameter("num2"));

        int result = a - b;

        out.println("<html><body>");
        out.println("<h2>Difference = " + result + "</h2>");
        out.println("</body></html>");
    }
}
