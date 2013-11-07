<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Welcome Page </title>
    </head>
    <body>
    <%
        String message = (String)session.getAttribute("message");
        
        
    %>
        <h1>Welcome <%= message %>
                    
        </h1>            
    			
    	 <html:link href="myprofile.jsp">MyProfile</html:link>
    			
	     <html:link href="Deposit.jsp">Deposit</html:link>

		 <html:link href="withdrawl.jsp">Withdraw</html:link>
		 
	     <html:link href="transfer.jsp">Transfer</html:link>	 
			
	
     
    </body>
</html>