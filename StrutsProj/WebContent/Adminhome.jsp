
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"&gt;>

<%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home</title>
</head>
<body bgcolor="white">
	<center>


		<table border="1" cellspacing="4" cellpadding="4" bgcolor="">

			<tr>
				<td>User ID</td>
				<td><%=request.getParameter("userid")%></td>
			</tr>

			<tr>
				<td>User Name</td>
				<td><%=request.getParameter("username")%></td>
			</tr>

			<tr>
				<td>Account Number</td>
				<td><%=request.getParameter("accntno")%></td>
			</tr>

			<tr>
				<td>Balance</td>
				<td><%=request.getParameter("balance")%></td>
			</tr>

			
		</table>
	</center>
</body>
</html>

