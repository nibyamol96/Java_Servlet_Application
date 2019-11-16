<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
     <form action="/WebApplication/LoginServlet" method="post">
			 <table width="50%" >
				    <br><br>
				    <h1>LOGIN FORM</h1>
				    <tr>
					<td>UserName</td>
					<td><input type="text" name="username" /></td>
					</tr>
					<tr>
						<td>Password</td>
						<td><input type="password" name="password" /></td>
					</tr>
			</table>
					<br><br>
					<input type="submit" value="submit">
		     
		</form>
</body>
</html>