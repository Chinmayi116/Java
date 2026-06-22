//welcome.jsp
<html> 
<body> 
 <%= "Welcome "+request.getParameter("uname") %> 
 </body> 
 </html>

<html>
<body> 
<form action="welcome.jsp"> 
 <input type="text" name="uname"><br/> 
<input type="submit" value="go"> 
</form> 
</body> 
</html>
