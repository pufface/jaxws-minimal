<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>

<!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8">
<title>JAX-WS-MINIMAL</title>
</head>
<body>
	<h1>JAX-WS Consumer</h1>
	<form action="/index.jsp" method="get">
		<input type="text" name="endpoint" />
		<input type="submit" name="abc" />
		<button type="button" >Call WS</button>
	</form> 
</body>
</html>
