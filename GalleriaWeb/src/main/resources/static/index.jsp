<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HomePage</title>
</head>
<body background=>
	<h1>Home</h1>
	<%if(session.getAttribute("autenticato")==null) {%>
	<a href="login.jsp">Login</a><br>
	<%}else{ %>
	<a href="inserisciOpera.jsp">Inserisci opera</a><br>
	<a href="login">Logout</a><br>
	<%} %>
	<a href="ricercaAutore.jsp">Ricerca per autore</a><br>
	<a href="controllerOpere">Opere</a>

</body>
</html>