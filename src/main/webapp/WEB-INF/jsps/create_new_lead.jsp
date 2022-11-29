<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file ="menu.jsp" %>
   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Leads</title>
</head>
<body>
<h2>Create New Leads</h2>
<form action="saveLeads" method="post">
<table>
<tr>
<td>FirstName</td>
<td><input type="text" name="firstName"/></td>
</tr>
<tr>
<td>LastName</td>
<td><input type="text" name="lastName"/></td>
</tr>
<tr>
<td>Email</td>
<td><input type="text" name="email"/></td>
</tr>
<tr>
<td>Mobile</td>
<td><input type="text" name=mobile /></td>
</tr>
</table>
<table>
<tr>
<td>Source :<td/>
<td>
<select name="source" >
  <option value="radio">Radio</option>
  <option value="news paper">News paper</option>
  <option value="trade show">Trade show</option>
  <option value="website">Website</option>
</select>
</td>
</tr>

</table>

<input type="submit" value="save"/>
</form>
${msg}
</body>
</html>