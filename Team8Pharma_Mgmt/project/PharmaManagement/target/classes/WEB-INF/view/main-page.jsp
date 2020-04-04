<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main Page</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style15.css">
</head>
<body
	background="${pageContext.request.contextPath}/resources/images/pharma1.jpg">
	<div class="header">
	
	<input type="button" value="Log out"
				onclick="window.location.href='logout';return false;" class="buttons" />
		<h1>Choose Action</h1>
	</div>

	<div class="topnav">	
		<div class="search-container">
			<form action="findbyid" method="post">
				<input type="text" placeholder="search by id" name="search">
				<button type="submit">
					<i class="fa fa-search">Search</i>
				</button>
			</form>
			
		</div>
	</div>
	
	
	<div class="main">
		<div class="sub-main">
			<input type="button" value="Add Medicine"
				onclick="window.location.href='showFormForAdd';return false;"
				class="button" />
		</div>





		<div class="sub-main">
			<input type="button" value="View Stock"
				onclick="window.location.href='list';return false;" class="button" />
		</div>

	</div>

</body>
</html>