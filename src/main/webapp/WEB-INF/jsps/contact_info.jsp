<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file ="menu.jsp" %>
  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Contact Details</h2>
First Name :${contact.firstName }<br>
Last Name :${contact.lastName }<br>
Email : ${contact.email }<Br>
Mobile : ${contact.mobile }<Br>
Source : ${contact.source }<br>

<form action="sendEmail" method="post">
<input type="hidden" name="email" value="${contact.email }" />
<input type="submit" value="send Email"/>
</form>


</body>
</html>