<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Login Form</title>
	<link rel="stylesheet" type="text/css" href="E.css">
</head>
<body>
	<div class="container">
		<div class="image-container">
			<img src="${pageContext.request.contextPath}/Images/Clothee Shoppe.png" alt="placeholder image">
		</div>
		<div class="form-container">
			<h2>Login</h2>
			<form>
				<label for="username">Username</label>
				<input type="text" id="username" name="username" required>

				<label for="password">Password</label>
				<input type="password" id="password" name="password" required>
				
				<div>
					<input type="submit" value="Login">
					<p>Not Registered? <a href="Signup.jsp">Sign Up</a></p>
				</div>
			</form>
		</div>
	</div>
</body>
</html>
