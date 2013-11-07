<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<html>
<head>
<title>Register Here</title>
</head>
<body bgcolor="white">
<center>
    <h1>Register</h1>
    <html:form action="/RegSubmit">
        <table border="1" cellspacing="4" cellpadding="4" bgcolor="">
        
        <tr>
        <td align="left">Name</td>
        <td><html:text property="name"></html:text></td>
        <td><html:errors property="name"/></td>
        </tr>
        
        <tr>
        <td align="left">UserName</td>
        <td><html:text property="username"></html:text></td>
        <td><html:errors property="username"/></td>
        </tr>
        
        <tr>
        <td align="left">Password</td>
        <td><html:password property="password"></html:password></td>
        <td><html:errors property="password"/></td>
        </tr>
        
        <tr>
        <td align="left">Conform Password</td>
        <td><html:password property="cpassword"></html:password></td>
        <td><html:errors property="cpassword"/></td>
        </tr>
        
        <tr>
        <td align="left">Email</td>
        <td><html:text property="email"></html:text></td>
        <td><html:errors property="email"/></td>
        </tr>
        
        <tr>
        <td align="left">DOB</td>
        <td><html:text property="dob"></html:text></td>
        <td><html:errors property="dob"/></td>
        </tr>
        
        <tr>
        <td align="left">Mobile</td>
        <td><html:text property="mobile"></html:text></td>
        <td><html:errors property="mobile"/></td>
        </tr>
        
        <tr>
        <td align="left">Address</td>
        <td><html:text property="address"></html:text></td>
        <td><html:errors property="address"/></td>
        </tr>
        
        <tr>
        <td align="left">Gender</td>
        <td><html:radio property="gender" value="MALE">Male</html:radio>
        <html:radio property="gender" value="FEMALE">Female</html:radio></td>
        <td><html:errors property="gender"/></td>
        </tr>
        
        
        <tr><td colspan="2" align="center"><html:submit value="Register"></html:submit></td></tr>
        </table>
        </html:form>
        </center>
        </body>
        </html>
        
        