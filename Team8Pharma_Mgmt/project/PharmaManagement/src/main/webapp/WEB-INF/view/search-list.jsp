<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- tag lib discriptor -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Medicines</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style9.css">
</head>
<body
	background="${pageContext.request.contextPath}/resources/images/pharma1.jpg">
	<h2>Search Result</h2>
	<br>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Type</th>
			<th>Price</th>
			<th>Manufacturer</th>
			<th>Expiry Date</th>
			<th>Action</th>

			<!-- create a link for updating record -->
			<c:url var="updateLink" value="/showFormForUpdate">
				<c:param name="medicineId" value="${tempMedicine.id}" />
			</c:url>

			<!-- create a link for deleting record -->
			<c:url var="deleteLink" value="/delete">
				<c:param name="medicineId" value="c" />
			</c:url>
		<tr>
			<td>${medicines.id}</td>
			<td>${medicines.name}</td>
			<td>${medicines.type}</td>
			<td>${medicines.price}</td>
			<td>${medicines.manufacturer}</td>
			<td>${medicines.dateOfExpiry}</td>
			<td><a href="${updateLink}">Update</a>|<a href="${deleteLink}"
				onclick="if(!(confirm('Areyou sure to delete'))) return false">Delete</a></td>
		</tr>

		</tr>

	</table>
</body>
</html>