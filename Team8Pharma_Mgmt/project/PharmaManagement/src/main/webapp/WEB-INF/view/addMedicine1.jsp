<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- tag lib discriptor -->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Medicines</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style11.css">
</head>
<body
	background="${pageContext.request.contextPath}/resources/images/pharma1.jpg">

	<h2>Add Medicine</h2>
	<div class="wrapper">
		<div class="container">
			<form:form action="saveMedicine" modelAttribute="medicine"
				method="post">
				<form:hidden path="id" />
				<div class="row">
					<div class="labels">
						<label for="Name">Name</label>
					</div>
					<div class="inputs">
						<form:input path="name" cssClass="text" />
						<form:errors path="name" cssClass="error" />
						<br>
					</div>
				</div>

				<br>

				<div class="row">
					<div class="labels">Type</div>
					<div class="input">
						<form:radiobutton path="type" value="Injection" />
						Injection&nbsp;&nbsp;
						<form:radiobutton path="type" value="Tablet" />
						Tablet&nbsp;&nbsp;
						<form:radiobutton path="type" value="Syrup" />
						Syrup&nbsp;&nbsp;
						<form:errors path="type" cssClass="error" />
						<br>

					</div>
				</div>
				<div class="row">
					<div class="labels">
						<label for="Price">Price</label>
					</div>
					<div class="inputs">
						<form:input path="price" cssClass="text" />
						<form:errors path="price" cssClass="error" />
						<br>
					</div>
				</div>



				<div class="row">
					<div class="labels">
						<label for="Manufacturer">Manufacturer</label>
					</div>
					<div class="inputs">
						<form:input path="manufacturer" cssClass="text" />
						<form:errors path="manufacturer" cssClass="error" />
						<br>
					</div>
				</div>


				<div class="row">
					<div class="labels">
						<label for="DateOfExpiry" class="floatLabel">Expiry Date</label>
					</div>
					<div class="inputs">
						<form:input path="dateOfExpiry" cssClass="text" />
						<form:errors path="dateOfExpiry" cssClass="error" />
						<br>

					</div>
				</div>

				<div class="row">
					<div class="labels">
						<label for="batchNo" class="floatLabel">Batch Number</label>
					</div>
					<div class="inputs">
						<form:input path="batchNo" cssClass="text" />
						<form:errors path="batchNo" cssClass="error" />
						<br>
					</div>
				</div>
				<div class="row">
					<div class="labels">
						<label for="unitsAvailable" class="floatLabel">Units
							Available</label>
					</div>
					<div class="inputs">
						<form:input path="unitsAvailable" cssClass="text" />
						<form:errors path="unitsAvailable" cssClass="error" />
						<br>

					</div>
				</div>

				<div class="row">
					<input type="submit" value="Submit">
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>
