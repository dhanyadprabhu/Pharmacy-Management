<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style14.css">

</head>
<body
	background="${pageContext.request.contextPath}/resources/images/pharma1.jpg">
	<header
		style="background-image: url('${pageContext.request.contextPath}/resources/images/header.jpg');">
		<center>
			<h1>Alvaida Pharamceuticals</h1>
		</center>
	</header>

	<br>
	<br>
	<jsp:include page="login1.jsp"></jsp:include>

</body>
</html>