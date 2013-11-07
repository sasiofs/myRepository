
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"&gt;
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body bgcolor="">
<center>


<table border="1" cellspacing="4" cellpadding="4" bgcolor="">

<tr>
<td>Name</td>
<td><%=request.getParameter("name") %></td>
</tr>

<tr>
<td>User Name</td>
<td><%=request.getParameter("username") %></td>
</tr>

<tr>
<td>Password</td>
<td><%=request.getParameter("password") %></td>
</tr>

<tr>
<td>Conform Password</td>
<td><%=request.getParameter("cpassword") %></td>
</tr>

<tr>
<td>Email</td>
<td><%=request.getParameter("email") %></td>
</tr>

<tr>
<td>DOB</td>
<td><%=request.getParameter("dob") %></td>
</tr>

<tr>
<td>Mobile</td>
<td><%=request.getParameter("mobile") %></td>
</tr>

<tr>
<td>Address</td>
<td><%=request.getParameter("address") %></td>
</tr>

<tr>
<td>Gender</td>
<td><%=request.getParameter("gender") %></td>
</tr>

</table>
</center>
</body>
</html>

