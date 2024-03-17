<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<link href="<c:url value="/resources/css/style.css"></c:url>">
<script src="<c:url value="/resources/js/script.js"/>"></script>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>my name is ${name }</h1>
<c:forEach var="set" items="${fruit }">
<h1>${set}
</h1>
</c:forEach>
<img alt="img" src='<c:url value="/resources/images/img.jpeg"></c:url>'>;
</body>
</html>