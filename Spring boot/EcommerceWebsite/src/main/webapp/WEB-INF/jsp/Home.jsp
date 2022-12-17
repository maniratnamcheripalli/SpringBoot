<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sq"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

ul {
	list-style-type: none;
/*  	background-color: #808080;
 */ 	border-style: hidden;
	border-radius: 5px;
}

.li {
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
.div {
	float: left;
	padding-left: 5px;
	padding-bottom: 5px;
	padding-top: 5px;
}

.div2 {
	float: left;
	padding-left: 20px;
	padding-bottom: 10px;
	padding-top: 5px;
	padding-right: 20px;
}

.h2 {
	display: none;
}


button{
display:inline-flex;
width:60%;
height:100%;

}
</style>
</head>

<body>

	<div Style="width: 100%; height: auto">
		<div>
			<span class="div"><img style="height: 700px; width: 1600Px"
				src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSZXtCFhRaw7tzkw0Ump6swP9N-sg-PuvnVlA&usqp=CAU"></span>
			
			<c:forEach items="${home}" var="img">

				<li class="li"><div><a href="mobile?property=${img.product}">
							<img src="${img.image}"></a><br> <br> <br> <br>
							<c:out value="${img.description}"></c:out>
							<br> <br> <b>Price:</b>
							<c:out value="${img.price}"></c:out>
						</div></li>

			</c:forEach>
					<hr>

				</div>
		</div>
</body>
</html>