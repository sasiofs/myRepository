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
<html:form action="Withdrawl">
<table>

<tr>
<td>Enter The Amount</td>
<td>to Deposit</td>
</tr>

<tr>
<td>Amount In Rs</td>
</tr>

<tr>
<td align="left">Account Number</td>
<td><html:text property="accnt_no"></html:text></td>
<td><html:errors property="accnt_no" /></td>
</tr>

<tr>
<td align="left">Enter Amount</td>
<td><html:text property="withdrawl"></html:text></td>
<td><html:errors property="withdrawl" /></td>
</tr>

<tr><td colspan="2"><html:submit/> </td></tr>

</table>
 </html:form>
</center>
</body>
</html>