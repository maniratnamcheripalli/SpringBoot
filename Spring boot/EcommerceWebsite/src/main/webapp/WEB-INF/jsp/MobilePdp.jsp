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
.page1 {
	width: 600px;
	geight: 600px;
	padding-left: 20px;
	padding-right: 20px;
	padding-top: 20px;
	padding-bottom: 20px;
	float: left;
}

img {
	width: 550px;
	height: 550px;
}


</style>
</head>
<body>	<ul>
		<c:forEach items="${mobilepdp}" var="img">
			<div class="page1">
				<img src="${img.image}"><br><br><p></p>
				<b>Quantity:</b><input type="number" placeholder="1">
			</div>
			<div class="page1">
				<p style="font-size: 34px">
					<b>${img.description}</b>
				</p>
				
				<br>
				<p style="font-size: 30px">
					<b>Cost :</b> ${img.price}
				</p>
				<br>
				<p style="">
					
					<a href="buy?id=${img.id}&price=${img.price}&description=${img.description}&image=${img.image}"><button style="width: 20%;border-radius: 10px">BuyNow</button></a>
					<a href="addCart?id=${img.id} &description=${img.description}"><button style="width: 20%; border-radius: 10px">AddCart</button></a>
				</p>
				
			</div>
		</c:forEach>
		</ul>
		
		
</body>
</html>