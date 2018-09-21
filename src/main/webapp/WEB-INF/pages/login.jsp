<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>

</head>
<body>

<h1>Se logger</h1>



<form action="loginvalidate" modelAttribute="customer" method="post" >
		<p>
			<form:label path="username">Entrer votre nom de login</form:label>
			<form:input path="username" />
			<form:errors path="username"></form:errors>
		</p>
		<p>
			<form:label path="password">Entrer votre mot de passe</form:label>
			<form:input path="password" />
			<form:errors path="password"></form:errors>
		</p>
		
		<p>
			<input type="submit" value="valider"/>
		</p>
	</form>

</body>
</html>