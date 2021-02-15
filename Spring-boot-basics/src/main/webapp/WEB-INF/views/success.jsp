<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c"
  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
person added successfully
<c:forEach items="${listOfPersons }" var="person">
${person.id }
${person.name }
${person.city }
${person.phone }
</c:forEach>
</body>
</html>