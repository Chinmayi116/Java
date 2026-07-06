<!DOCTYPE html>
<html>
<body>

<form action="LoginServlet" method="post">

Username:
<input type="text" name="username"><br><br>

Password:
<input type="password" name="password"><br><br>

<input type="submit" value="Login">

</form>

</body>
</html>
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    public void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        if(user.equals("admin") && pass.equals("1234"))
        {
            out.println("<h2>Login Successful</h2>");
        }
        else
        {
            out.println("<h2>Invalid Username or Password</h2>");
        }
    }
}
