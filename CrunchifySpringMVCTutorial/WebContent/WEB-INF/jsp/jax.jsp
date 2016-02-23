<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JaxB</title>
<jsp:include page="/WEB-INF/jsp/header.jsp" />	
</head>
<body>
<table border="0" width="100%">
	<tr>
	<td width="15%">
		<jsp:include page="/WEB-INF/jsp/navigation.jsp" />	
	</td>
	<td width="85%" class="center">		
		<c:out value="Marshall and unmarshall successful?"/> <c:out value="${jax.done}"/>			
	</td>	
	</tr>
	<jsp:include page="/WEB-INF/jsp/jQueryFooter.jsp" />
</table>
</body>
</html>