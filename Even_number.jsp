<html>
<body>
    <h2>Even or Odd</h2>

    <form method="post">
        Enter Number:
        <input type="text" name="num">
        <input type="submit" value="Check">
    </form>

    <%
        String value = request.getParameter("num");

        if (value != null) {
            int n = Integer.parseInt(value);

            if (n % 2 == 0)
                out.println("<h3>" + n + " is Even</h3>");
            else
                out.println("<h3>" + n + " is Odd</h3>");
        }
    %>
</body>
</html>
