<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.register1 {
	background-color: white;
	text-align: center;
	height: 700px;
	width: 1000px;
	align-items: center;
	margin-left: 300px;
	border: 15px solid green
}

b {
	font-size: 20px;
}

.error {
	color: red
}
</style>
</head>
<body>
	<form:form action="mobile" modelAttribute="mobile">
		<div class="register1">
			<div class="div1">
				<h2>Registration page</h2>
				<br>
				<br> <b>image(*):</b>
				<form:input path="image"/><br><br><br>
				<b>price(*):</b>
				<form:input path="price" /><br><br><br>
				<b>Description(*):</b>
				<form:input path="description" /><br><br><br>
				<input type="submit" value="Register"
					style="background-color: hotpink; color: black; font-size: 24px">
			</div>
		</div>
	</form:form>
</body>
</html>