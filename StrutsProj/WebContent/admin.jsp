<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
    <h1>Admin Register</h1>
    <html:form action="action">
        <table border="1" cellspacing="4" cellpadding="4" bgcolor="">
        
        <tr>
        <td align="left">UserId</td>
        <td><html:text property="userid" title="Customer ID"></html:text></td>
        <td><html:errors property="userid"/></td>
        </tr>
        
        <tr>
        <td align="left">UserName</td>
        <td><html:text property="username" title="User Name"></html:text></td>
        <td><html:errors property="username"/></td>
        </tr>
        
        <tr>
        <td align="left">Account No</td>
        <td><html:text property="accntno" title="Account Number"></html:text></td>
        <td><html:errors property="accntno"/></td>
        </tr>
        
        <tr>
        <td align="left">Balance</td>
        <td><html:text property="balance" title="Balance"></html:text></td>
        <td><html:errors property="balance"/></td>
        </tr>
        
        <tr><td colspan="2" align="center"><html:submit value="Submit"></html:submit></td></tr>
        </table>
        
        <br>
        <html:link action="record">	Record Details</html:link>
		<br>
		<html:link href="fileupload.jsp">FileUpload</html:link>
		        
        </html:form>
        </center>
</body>
</html>