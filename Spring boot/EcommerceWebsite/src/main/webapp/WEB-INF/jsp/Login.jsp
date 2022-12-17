<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
label {
	width: 200px;
	height: 120px;
	border-style: none;
}

input {
	width: 200px;
	height: 40px;
}

.division {
	background-color: white;
	text-align: center;
	height: 800px;
	width: 1200px;
	align-items: center;
	margin-left: 300px;
	border: 15px solid green
}

a {
	text-decoration: none;
	color: black;
}
</style>
<body>
	<form action="validate">
		<div class="division">
			<br>
			<h1 style="color: black">Login Page</h1>
			<br>
			<br> <label for="name"><b
				style="color: black; font-size: 30px">EmailId: </b></label> <input type="text"
				name="name"><br>
			<br>
			<br> <label for="password"><b
				style="color: black; font-size: 30px">Password:</b></label> <input
				type="password" name="password"><br>
			<br>
			<br> <input
				style="background-color: hotpink; color: white; font-size: 25px" type="submit" value="submit"><br>
			<br> <a href="register"><h3>New to Flipkart ?create an
					account</h3></a>
		</div>

	</form>
</body>
</html>