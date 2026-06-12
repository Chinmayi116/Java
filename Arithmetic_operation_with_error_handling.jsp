<%@ page errorPage="error.jsp" %>

<html>
<body>

<%
int num1 = Integer.parseInt(request.getParameter("n1"));
int num2 = Integer.parseInt(request.getParameter("n2"));

int add = num1 + num2;
int sub = num1 - num2;
int mul = num1 * num2;
int div = num1 / num2;   // May cause exception
%>

<h2>Arithmetic Operations</h2>

Addition = <%= add %><br>
Subtraction = <%= sub %><br>
Multiplication = <%= mul %><br>
Division = <%= div %><br>

</body>
</html>
