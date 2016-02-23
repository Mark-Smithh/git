<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Mark JSP 4</title>
	<jsp:include page="/WEB-INF/jsp/header.jsp" />
</head>
<body>
	<table border="0" width="100%">
	<tbody>		
		<tr>
			<td width="15%">
				<jsp:include page="/WEB-INF/jsp/navigation.jsp" />	
			</td>
			<td width="85%">
				<center>
				<div id="StrongStuff">
					<strong>Hello: </strong><c:out value="${gN.names[0]}" /><br />
				</div>	
				<div id="ListStuff">	
					<ul>
						<c:forEach var="listValue" items="${lists}">
							<li>${listValue}</li>
						</c:forEach>
					</ul>
				</div>
				<div id="EachStuff">	
					<c:forEach var="listValue" items="${lists}">
						<c:out value="${listValue}" />
					</c:forEach>
					<br />
					<c:forEach var="listValue" items="${gN.nameList}">
						<c:out value="${listValue}" />
					</c:forEach>
				</div>
				<br />
				<div id="MapStuff">
					<c:forEach items="${nameMap}" var="entry">
			    		<c:out value="${entry.value}" />
					</c:forEach>
					<br />
					<c:forEach items="${gN.nameMap}" var="entry">
			    		<c:out value="${entry.value}" />
					</c:forEach>
				</div>
				</center>
			</td>
		</tr>
		<jsp:include page="/WEB-INF/jsp/jQueryFooter.jsp" />
	</tbody>
	</table>
</body>
</html>