<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JaxB</title>
<style>
	#Yellow { background-color: yellow;}
</style>
</head>
<body>
<table>
	<tr>
	<td>
		<jsp:include page="/WEB-INF/jsp/navigation.jsp" />	
	</td>
	<td>
		<c:out value="Marshall and unmarshall successful?"/> <c:out value="${jax.done}"/>	
	</td>	
	</tr>
</table>
</body>
</html>