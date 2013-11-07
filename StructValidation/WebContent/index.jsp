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
   <div style="color:red">
    <html:errors />
	</div>
	<h1>Login</h1>
	
	<html:form action="login">
		
		User Name:  <html:text property="userName"/>
		
		<br/><br/>
		
		Password:   <html:password property="password"/>
	     <br /><br/>
	     <html:link href="register.jsp">Register here</html:link>

		<html:submit />
		<html:reset/>		
	</html:form>
</body>
</html>