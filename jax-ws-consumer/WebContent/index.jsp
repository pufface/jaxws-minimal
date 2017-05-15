<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>

<%@ page import="sk.fillo.ws.consumer.def.Service" %>
<%@ page import="sk.fillo.ws.consumer.WsClientFactory" %>

<%
	String submit = request.getParameter("submit");
	String endpoint = request.getParameter("endpoint");
	if (endpoint != null) {
		Service service = WsClientFactory.build(endpoint);
		String result = String.valueOf(service.addNumbers(19, 10));
		request.setAttribute("result", result);
	}
%>

<!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8">
<title>JAX-WS Consumer</title>
</head>
<body>
	<h1>JAX-WS Consumer</h1>
	<form action="index.jsp" method="GET">
		<input type="text" name="endpoint" value="http://localhost:8080/jax-ws-provider/ws" />
		<input type="submit" name="submit" />
	</form>
	<hr />
	<pre>${result}</pre>
</body>
</html>
