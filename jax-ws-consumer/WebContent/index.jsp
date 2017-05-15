<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ page import="java.io.StringWriter" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="sk.fillo.ws.consumer.def.TimeService" %>
<%@ page import="sk.fillo.ws.consumer.WsClientFactory" %>

<%
	String endpoint = request.getParameter("endpoint");
	if (endpoint == null) {
		endpoint = "http://localhost:" + request.getServerPort() + "/jax-ws-provider/TimeServiceService";
	} else {
		String result;
		try {
			TimeService service = WsClientFactory.build(endpoint);
			result = String.valueOf(service.providerTimeMillis());
		} catch (Exception e) {
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			result = sw.toString();
		}
		request.setAttribute("result", result);
	}
	request.setAttribute("endpoint", endpoint);
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
		<input type="text" style="width: 400px;"name="endpoint" value="${endpoint}" />
		<button type="submit">Call WS</button>
	</form>
	<hr />
	<pre>${result}</pre>
</body>
</html>
