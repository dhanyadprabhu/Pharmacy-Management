<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<script>
	function validate() {
		var username = document.form.userName.value;
		var password = document.form.password.value;

		if (username == null || username == "") {
			alert("Username cannot be blank");
			return false;
		} else if (password == null || password == "") {
			alert("Password cannot be blank");
			return false;
		}
	}
</script>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style10.css">
</head>
<body
	background="${pageContext.request.contextPath}/resources/images/pharma1.jpg">



	<div class="wrapper">
		<div class="container">
			<form name="form" action="userLogin" method="post" 
				onsubmit="return validate()">


				<legend>
					<font size="5"><u>Login</u></font>
				</legend>
				<br>
				<div class="row">
					<div class="labels">
						<label for="userName">Username</label>
					</div>
					<div class="inputs">
						<input class="inputdata" name="userName" type="text" />
					</div>
				</div>



				<div class="row">
					<div class="labels">
						<label for="password">Password</label>
					</div>
					<div class="inputs">
						<input class="inputdata" name="password" type="password"/>
					</div>
				</div>


				<br>

				<div class="row">
					<input type="submit" value="Login">&nbsp;&nbsp;

				</div>

			</form>
		</div>
	</div>
</body>
</html>
