<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page Liste</title>

</head>
<body>
	<h1>Liste des Spectacles</h1>

	<h1>Liste</h1>

	<c:forEach var="s" items="${spectacles }">
		<h3>${s.prenom }: ${s.age } : ${s.adresse }</h3>
	</c:forEach>
</body>
</html>