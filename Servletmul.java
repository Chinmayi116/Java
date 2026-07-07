<!DOCTYPE html>
<html>
<head>
    <title>Multiplication</title>
</head>
<body>
    <h2>Multiply Two Numbers</h2>

    <form action="MulServlet" method="post">
        Number 1: <input type="text" name="num1"><br><br>
        Number 2: <input type="text" name="num2"><br><br>

        <input type="submit" value="Multiply">
    </form>
</body>
</html>
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MulServlet extends HttpServlet {

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
                       throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        int a = Integer.parseInt(request.getParameter("num1"));
        int b = Integer.parseInt(request.getParameter("num2"));

        int result = a * b;

        out.println("<html><body>");
        out.println("<h2>Product = " + result + "</h2>");
        out.println("</body></html>");
    }
}
