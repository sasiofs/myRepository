<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<div style="color: red">
			<html:errors />
		</div>
		<div style="color: blue">
		<h1>Login</h1>
        </div>
        
		<html:form action="login">
		
		<div> If u don't have an account,  <html:link href="register.jsp">Register here</html:link></div>
		<br>
			<table border="1" cellspacing="4" cellpadding="4" bgcolor="">

				<tr>
					<td align="left">User Name</td>
					<td><html:text property="userName" title="User Name"></html:text></td>
					<td><html:errors property="userName" /></td>
				</tr>



				<tr>
					<td align="left">Password</td>
					<td><html:password property="password" title="Password"></html:password></td>
					<td><html:errors property="password" /></td>
				</tr>

                <tr>
                <td></td>
                <td><html:link href="adminlogin.jsp">Admin</html:link></td>
				</tr>

              </table>
              <br>
				<html:submit />
				<html:reset />
			
		</html:form>
	</center>
</body>
</html>