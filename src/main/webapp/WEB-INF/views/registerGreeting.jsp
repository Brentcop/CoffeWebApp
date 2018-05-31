<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: DodgerBlue;">
	<h1 style="color: White;">Welcome to the Coffee Shop
		${p.firstName}</h1>
	<table>
		<c:forEach items="${items}" var="items">
			<tr>
				<td><a href="/items/${items.itemName}">${items.itemName}</a>
				${items.itemName}
				${items.description}
				${items.quantity}
				${items.price}

				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>