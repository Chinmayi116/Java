<html>
<body>
    <h2>Add Two Numbers</h2>

    <form method="post">
        Enter First Number:
        <input type="text" name="num1"><br><br>

        Enter Second Number:
        <input type="text" name="num2"><br><br>

        <input type="submit" value="Add">
    </form>

    <%
        String n1 = request.getParameter("num1");
        String n2 = request.getParameter("num2");

        if (n1 != null && n2 != null) {
            int a = Integer.parseInt(n1);
            int b = Integer.parseInt(n2);

            out.println("<h3>Sum = " + (a + b) + "</h3>");
        }
    %>
</body>
</html>
