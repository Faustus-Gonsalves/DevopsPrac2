<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String message=request.getParameter("message");
%>

<center>
<form method="post" action="http://localhost:9090/UserMVC/LoginController">
<h1>Login Here</h1>
<br><br>
<%
if(message==null)
{

}
else
{
%>	
<b><font color="red">Invalid Credentials</font></b>
<br><br>
<% 
}
%>

Enter Email:<input type="text" name="email"  width="100px"><br><br>
Enter Password:<input type="password" name="password"  width="100px"><br><br>
<input type="submit" value="Login">

</form>
</center>

</body>
</html>