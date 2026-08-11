<html>
<body>
    <h2>Factorial Program</h2>

    <form method="post">
        Enter Number:
        <input type="text" name="num">
        <input type="submit" value="Calculate">
    </form>

    <%
        String value = request.getParameter("num");

        if (value != null) {
            int n = Integer.parseInt(value);
            int fact = 1;

            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }

            out.println("<h3>Factorial = " + fact + "</h3>");
        }
    %>
</body>
</html>
