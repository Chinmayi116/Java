CREATE DATABASE companydb;
USE companydb;

CREATE TABLE employee (
    empid INT PRIMARY KEY,
    empname VARCHAR(50),
    department VARCHAR(50)
);
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {

    private static final String URL =
            "jdbc:mysql://localhost:3306/companydb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String action = request.getParameter("action");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    URL, USER, PASSWORD);

            if ("Insert".equals(action)) {

                int empid = Integer.parseInt(
                        request.getParameter("empid"));

                String empname =
                        request.getParameter("empname");

                String department =
                        request.getParameter("department");

                String query =
                        "INSERT INTO employee(empid, empname, department) VALUES (?, ?, ?)";

                PreparedStatement ps =
                        con.prepareStatement(query);

                ps.setInt(1, empid);
                ps.setString(2, empname);
                ps.setString(3, department);

                int result = ps.executeUpdate();

                if (result > 0) {
                    out.println("<h3>Employee Record Inserted Successfully!</h3>");
                }

                ps.close();
            }

            else if ("View".equals(action)) {

                String query = "SELECT * FROM employee";

                PreparedStatement ps =
                        con.prepareStatement(query);

                ResultSet rs = ps.executeQuery();

                out.println("<h2>Employee Records</h2>");
                out.println("<table border='1'>");
                out.println("<tr>");
                out.println("<th>ID</th>");
                out.println("<th>Name</th>");
                out.println("<th>Department</th>");
                out.println("</tr>");

                while (rs.next()) {
                    out.println("<tr>");
                    out.println("<td>" + rs.getInt("empid") + "</td>");
                    out.println("<td>" + rs.getString("empname") + "</td>");
                    out.println("<td>" + rs.getString("department") + "</td>");
                    out.println("</tr>");
                }

                out.println("</table>");

                rs.close();
                ps.close();
            }

            con.close();

        } catch (Exception e) {
            out.println("<h3>Error: " + e.getMessage() + "</h3>");
        }
    }
}
