<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register page</title>
</head>
<body>
	
	<form action="insert" method="post">
	
	<label for="Name">CustomerName :</label>
	<input type="text" name="name" ><br/><br/>
	
	<label for="mail">CustomerEmail :</label>
	<input type="email" name="mail" ><br/><br/>
	
	<label for="Name">CustomerNumber :</label>
	<input type="text" name="pNumber" ><br/><br/>
	
	<label for="Name">CustomerUsername :</label>
	<input type="text" name="uName" ><br/><br/>
	
	<label for="Name">CustomerPassword :</label>
	<input type="password" name="pwd" ><br/><br/>
	
	<br/>
	<input type="submit" name="submit" value="submit">
	
	</form>
	
</body>
</html>