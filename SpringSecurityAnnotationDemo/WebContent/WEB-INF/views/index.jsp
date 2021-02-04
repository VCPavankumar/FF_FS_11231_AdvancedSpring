<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>Welcome to Studytonight!</h1>
	<h2>
		<a href="java-course">Study Java Courses</a>
	</h2>
	<h2>
		<a href="premium-courses">Study Premium Courses</a>
	</h2>
	<h2>
		<a href="dba-courses">Study DBA Courses</a>

	</h2>
	<h2>
		<a href="net-courses">Study DotNet Courses</a>

	</h2>
	<br>
	<br>
	<form:form action="${pageContext.request.contextPath}/logout"
		method="post">
		<input type="submit" value="logout">
	</form:form>
</body>
</html>