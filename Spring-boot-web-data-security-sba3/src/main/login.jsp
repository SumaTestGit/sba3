<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Portfolio Management System-Login</title>
	</head>
	<body>
		<jsp:include page="header.jsp"></jsp:include>
		<div class="form" class="container">
			<form action="/validateLogin" method="post" class="was-validated">
		<div>
			<div><h3>Login</h3></div>
			
			<c:if test="${param.error != null}">
					<p class= "error" id="center">Invalid Credentials! Access Denied!
			</c:if>
		
			<div class="form-group">
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
				<label>UserName</label><input name="userName" type="text" class="form-control" placeholder="Enter username" autocomplete="off" pattern=".{5,}" required>
			</div>
		
 			<div class="form-group">
				<label>Password</label>
				<input name="password" type="password" class="form-control" placeholder="Enter password" required>
			</div>
		
			<div id="center"><input type="submit" class="btn btn-primary" class="btn"></div>
		
		</div>
	
		<div id="center"><label>Not an existing Investor? &nbsp;</label><a href="/home">Register!</a></div>
		</form>

	</div>
<	/body>
</html>