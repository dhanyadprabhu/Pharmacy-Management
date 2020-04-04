<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- tag lib discriptor -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Medicines</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style8.css">
</head>
<body
	background="${pageContext.request.contextPath}/resources/images/pharma1.jpg">
	<form action="saveMedicine" method="post">
		<h2>Add Medicine</h2>
		<div class="wrapper">
			<div class="container">
				<form action="saveMedicine" method="post">
					<form:hidden path="id" />
					<div class="row">
						<div class="labels">
							<label for="Name">Name</label>
						</div>
						<div class="inputs">
							<input id="name" name="Name" type="text">
						</div>
					</div>



					<div class="row">
						<div class="labels">Type</div>
						<div class="input">
							<input id="Injection" name="Type" type="radio" value="Injection">
							<label for="Injection" class="floatLabel">Injection</label>&nbsp;&nbsp;
							<input id="Tablet" name="Type" type="radio" value="Tablet">
							<label for="Tablet" class="floatLabel">Tablet</label>&nbsp;&nbsp;
							<input id="Syrup" name="Type" type="radio" value="Syrup">
							<label for="Syrup" class="floatLabel">Syrup</label>&nbsp;

						</div>
					</div>
					<div class="row">
						<div class="labels">
							<label for="Price">Price</label>
						</div>
						<div class="inputs">
							<input id="price" name="Price" type="text">
						</div>
					</div>



					<div class="row">
						<div class="labels">
							<label for="Manufacturer">Manufacturer</label>
						</div>
						<div class="inputs">
							<input class="info" name="Manufacturer" type="text">
						</div>
					</div>


					<div class="row">
						<div class="labels">
							<label for="DateOfExpiry" class="floatLabel">Expiry Date</label>
						</div>
						<div class="inputs">
							<input class="info" name="DateOfExpiry" type="text">
						</div>
					</div>

					<div class="row">
						<input type="submit" value="Submit">
					</div>
				</form>
			</div>
		</div>
</body>
</html>
