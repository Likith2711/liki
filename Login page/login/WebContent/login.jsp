<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>login Here</title>
</head>
<link rel="Stylesheet" type="text/css" href="./css/login.css">
<body style="background-image:url('images/img1.jpg');">
<div login box >
<form action="login" method="post">
<center>
<fieldset>
<legend>User Login</legend>
<table style="with: 100%">
<tr>
<td><label for = "UserName">UserName:</label></td>
<td><input type ="text" name="Username" required name =" UserName"></td>
<br>
</tr>

<tr>
<td><label for ="password">password:</label></td>
<td><input type="password" id = "password" required name ="password"><td>
</tr></table>

</fieldset>
<button>Submit </button>
</center>
</div>
</form>

</body>
</html>