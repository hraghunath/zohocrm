<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Billing Details</h2>
First Name :${billing.firstName }<br>
Last Name :${billing.lastName }<br>
Email : ${billing.email }<Br>
Mobile : ${billing.mobile }<Br>
Product :${billing.product }<br>
Amount :${billing.amount }<br>
</body>
</html>