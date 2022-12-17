<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sq"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
ul {
	list-style-type: none;
/*  	background-color: #808080;
 */ 	border-style: hidden;
	border-radius: 5px;
}

.li{
	display: inline-flex;
/* 	color: black;
 */	padding: 90px 110px;
	text-decoration: none;
}

.li a:hover {
	color: white;
}
img {
	width: 250px;
	height: 300px;
}
</style>
</head>
<body>
<ul>
	<c:forEach items="${cartData}" var="img">
		
			<li class="li"><button><a href='MobilePdp?id=${img.id}'><img src="${img.image}"></a><br><br><br><br><c:out value="${img.description}"></c:out><br><br><b>Price:</b><c:out value="${img.price}"></c:out><a href="deleteFromCart?id=${img.id}">
			</a></button></li>
	
	</c:forEach>
	</ul>
</body>
</html>