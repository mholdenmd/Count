<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Hello from Counter Page!!!!</h1>

<h1><a href="/counter">localhost:8080/counter</a><c:out value="${count}"/>Times</h1>

<p><a href="/">Test another visit?</a></p>

</body>
</html>