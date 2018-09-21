<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Manage Reservation</title>
</head>
<body>
	<h1>Gérer ses réservations</h1>
	<p>Normalement accessible que par le client loggé</p>
	
	<c:forEach var="s" items="${customer.reservations }">
		<h3>${s.id} : ${s.date } : ${s.globalAmount }</h3>
	</c:forEach>
	
</body>
</html>