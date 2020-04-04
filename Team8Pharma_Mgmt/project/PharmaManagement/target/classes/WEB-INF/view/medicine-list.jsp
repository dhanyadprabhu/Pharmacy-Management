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
	<h2>Available Stock</h2>
	<br>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Type</th>
			<th>Price</th>
			<th>Manufacturer</th>
			<th>Expiry Date</th>
			<th>Batch No.</th>
			<th>Units Available</th>
			<th>Action</th>
			<c:forEach var="tempMedicine" items="${medicines}">
				<!-- create a link for updating record -->
				<c:url var="updateLink" value="/showFormForUpdate">
					<c:param name="medicineId" value="${tempMedicine.id}" />
				</c:url>

				<!-- create a link for deleting record -->
				<c:url var="deleteLink" value="/delete">
					<c:param name="medicineId" value="${tempMedicine.id}" />
				</c:url>
				<tr>
					<td>${tempMedicine.id}</td>
					<td>${tempMedicine.name}</td>
					<td>${tempMedicine.type}</td>
					<td>${tempMedicine.price}</td>
					<td>${tempMedicine.manufacturer}</td>
					<td>${tempMedicine.dateOfExpiry}</td>
					<td>${tempMedicine.batchNo}</td>
					<td>${tempMedicine.unitsAvailable}</td>
					<td><a href="${updateLink}">Update</a>|<a href="${deleteLink}"
						onclick="if(!(confirm('Areyou sure to delete'))) return false">Delete</a></td>
				</tr>
			</c:forEach>
		</tr>

	</table>
</body>
</html>