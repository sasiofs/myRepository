<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
   <%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %> 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Banking</title>
</head>


<frameset>
<frameset rows="182,*" FRAMEBORDER=NO FRAMESPACING=0 BORDER=0></frameset>
<frame src="A.jsp" name="top"  scrolling="no">

<frameset cols="300,*" FRAMEBORDER=NO FRAMESPACING=0 BORDER=0></frameset>
<frame src="B.jsp" name="left" scrolling="no">

<frameset rows="517,*" FRAMEBORDER=NO FRAMESPACING=0 BORDER=0></frameset>
<frame src="C.jsp" name="center" scrolling="no">

<frameset rows="200,*" FRAMEBORDER=NO FRAMESPACING=0 BORDER=0></frameset>
<frame src="Fourth.html" name="bottom" scrolling="no">
</frameset>
<body>
</body>

</html>