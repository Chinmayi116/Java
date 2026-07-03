<%@ page language="java"
 import="java.util.Date,java.util.Random"
 session="true"
 buffer="8kb"
 autoFlush="true"
 errorPage="error.jsp"
 isELIgnored="false"
 pageEncoding="UTF-8"
 isThreadSafe="true"
 info="Library Management JSP Page"
 contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
 <meta charset="UTF-8">
 <title>Library Management System</title>
</head> 
<body>
<h1>Online Library Management System</h1>
<%
 session.setAttribute("student", "");
 Date d = new Date();
 Random r = new Random();
 int token = r.nextInt(1000);
%>
<h3>Student Name: <%= session.getAttribute("student") %></h3>
<h3>College Name: KLS Gogte Institute of Technology</h3>
<h3>Current Date: <%= d %></h3>
<h3>Generated Token: <%= token %></h3>
<h3>Page Info: <%= getServletInfo() %></h3>
<hr>
<h2>Book Fine Calculation</h2>
<form action="Calculate.jsp" method="get">
 Enter Number of Delayed Days:
 <input type="text" name="days" required>
 <br><br>
 Enter Fine Per Day:
 <input type="text" name="fine" required>
 <br><br>
 <input type="submit" value="Calculate Fine">
</form>
<hr>
<h2>Expression Language Demo</h2>
<h3>${10+20}</h3>
</body>
</html>
Calculate.jsp
<%@ page language="java"
 errorPage="error.jsp"
 contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
 <meta charset="UTF-8">
 <title>Fine Calculation</title>
</head>
<body>
<%
 int days = Integer.parseInt(request.getParameter("days"));
 int fine = Integer.parseInt(request.getParameter("fine"));
 int total = days * fine;
%>
<h2>Total Library Fine = <%= total %></h2>
<a href="index.jsp">Back</a>
</body>
</html>
