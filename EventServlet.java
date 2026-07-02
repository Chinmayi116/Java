import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EventServlet")
public class EventServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            String Name = request.getParameter("Name");
            String College = request.getParameter("College");
            String Event = request.getParameter("Event");
            String Contact = request.getParameter("Contact");

            Enumeration<String> params = request.getParameterNames();

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Event Registration Result</title>");
            out.println("</head>");
            out.println("<body bgcolor='#e6ffe6'>");

            out.println("<h2 align='center'>Registration Successful</h2>");

            out.println("<h3>Submitted Parameters</h3>");
            while (params.hasMoreElements()) {
                String paramName = params.nextElement();
                String paramValue = request.getParameter(paramName);
                out.println(paramName + " : " + paramValue + "<br>");
            }

            out.println("<br><table border='1' align='center' cellpadding='10'>");
            out.println("<tr><th>Name</th><td>" + Name + "</td></tr>");
            out.println("<tr><th>College</th><td>" + College + "</td></tr>");
            out.println("<tr><th>Event</th><td>" + Event + "</td></tr>");
            out.println("<tr><th>Contact</th><td>" + Contact + "</td></tr>");
            out.println("</table>");

            out.println("<h3 align='center'>Hello " + Name
                    + ", you are successfully registered for "
                    + Event + ". See you at the event!</h3>");

            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Event Registration Servlet";
    }
}