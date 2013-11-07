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

<body bgcolor="white">
<center>
    <h1>Register</h1>
    <html:form action="myprofile">
        <table border="1" cellspacing="4" cellpadding="4" bgcolor="">
        
        <tr>
        <td align="left">Enter Password</td>
        <td><html:password property="password" title="Password"></html:password></td>
        <td><html:errors property="password"/></td>
        </tr>
        
        <tr><td colspan="2" align="center"><html:submit value="MyProfile"></html:submit></td></tr>
        
        </table>
        </html:form>
        </center>
</body>
</html>