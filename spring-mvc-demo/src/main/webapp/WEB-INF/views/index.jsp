<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String name=(String)request.getAttribute("name");
  List<String> fruit=(List<String>)request.getAttribute("fruit");
%>
<h1>hi I am <%=name %></h1>
<%for(String f : fruit){ %>
<h1><%=f %></h1>
<%} %>
</body>
</html>