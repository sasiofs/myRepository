<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@page import="java.util.ListIterator"%>    

<%@taglib uri="http://displaytag.sf.net" prefix="display"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account Details</title>
</head>
<body>
<center>


        
        <display:table name="sessionScope.AccntDetails" pagesize="2" export="true">
		
		
		<display:column property="userid" title="User ID"></display:column>
		<display:column property="username" title="User Name"></display:column>
		<display:column property="accntno" title="Accnt No"></display:column>
		<display:column property="balance" title="Balance"></display:column> 
		<display:column property="name" title="Name"></display:column>
		
</display:table>


</center>
</body>
</html>