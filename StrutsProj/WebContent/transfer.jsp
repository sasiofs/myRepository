<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
   <%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %> 
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Deposit</title>
</head>
<body>
<center>
<html:form action="transfer1">
<table>

<tr>
<td>Enter The Amount</td>

</tr>

<tr>
<td>Amount In Rs</td>
</tr>

<tr>
<td align="left">Enter Account Number Form</td>
<td><html:text property="accntnofrom"></html:text></td>
<td><html:errors property="accntnofrom" /></td>
</tr>

<tr>
<td align="left">Enter Account Number To</td>
<td><html:text property="accntnoto"></html:text></td>
<td><html:errors property="accntnoto" /></td>
</tr>


<tr>
<td align="left">Enter Amount</td>
<td><html:text property="transfer"></html:text></td>
<td><html:errors property="transfer" /></td>
</tr>

<tr><td colspan="2"><html:submit/> </td></tr>

</table>
 </html:form>
</center>
</body>
</html>