<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <form action="/WebApplication/RegisterServlet" method="post">
		  <table width="50%" align="center">
		    <br><br>
		   <h1><center>REGISTRATION FORM</center></h1>
			<tr>
			    <td> Name</td>
				<td><input type="text" name="name"  id="name"  /></td>
			</tr>
			<tr>
			    <td><td><div id="nam"></div></td></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="textarea" name="address"  id="add" /></td>
			</tr>
			<tr>
			    <td><td><div id="address"></div></td></td>
			<tr>
			<tr>
				<td>Mobile</td>
				<td><input type="text" name="contact" id="mobile" /></td>
			</tr>
			<tr>
			    <td><td><div id="number"></div></td></td>
			<tr>
			<tr>
				<td>Email ID</td>
				<td><input type="text" name="email" id="em"/></td>
			</tr>
			<tr>
			    <td><td><div id="mail"></div></td></td>
			<tr>
			<tr>
				<td>UserName</td>
				<td><input type="text" name="username" id="uname"/></td>
			</tr>
			<tr>
			    <td><td><div id="user"></div></td></td>
			<tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" id="pass"/></td>
			</tr>
			<tr>
			    <td><td><div id="password"></div></td></td>
			<tr>
		 </table>
			<br><br>
			
			  <center><input type="submit" name="signin" id="signin" value="REGISTER"></center>
		
			
		
		</form>

</body>
</html>