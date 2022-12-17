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
	<form:form action="save" modelAttribute="customer">
		<div class="register1">
			<div class="div1">
				<h2>Registration page</h2>
				<br> <br> <b>Name(*):</b>
				<form:input path="name" />
				<br> <br> <br> <b>MailId(*):</b>
				<form:input path="mailId" />
				<br> <br> <br> <b>Password(*):</b>
				<form:password path="password" />
				<br>
				<form:errors path="password" cssClass="error" />
				<br> <br> <b>MobileNumber(*):</b>
				<form:input path="mobileNumber" />
				<br>
				<form:errors path="mobileNumber" cssClass="error" />
				<br> <br> <input type="submit" value="Register"
					style="background-color: hotpink; color: black; font-size: 24px">

				<br> <br> <a href="/"><h3>Already a
						Customer?Login</h3></a>
			</div>
		</div>
	</form:form>
</body>
</html>