<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

	<form action="log" method="POST" >
	
	<label for = "uid">UserName :</label>
	<input type = "text" name ="uid" ><br/>
	<label for="pass" >Password :</label>
	<input type="password" name="pwd" ><br/>
	
	<br/>
	<input type="submit" name="submit" value="LogIn">
	</form>
	
</body>
</html>