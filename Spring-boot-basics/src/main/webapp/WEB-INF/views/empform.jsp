<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add New Person</h1> 
<form modelAttribute="person" action="save">

<table>
<tr>
<td>Name: </td>
<td><input  type="text"  name="name"/></td>
</tr>
<tr>
<td>City: </td>
<td><input type="text"  name="city"/></td>
</tr>
<tr>
<td>Phone: </td>
<td><input  type="text" name="phone"/></td>
</tr></table>
<input type="submit" value="save" />

</form>
</body>
</html>