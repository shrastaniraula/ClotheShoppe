<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Sign Up Form</title>
	<link rel="stylesheet" type="text/css" href="E.css">
</head>
<body>
	<div class="container">
		<div class="image-container">
			<img src="${pageContext.request.contextPath}/Images/Clothee Shoppe.png" alt="placeholder image">
		</div>
		<div class="form-container">
			<h2>Sign Up</h2>
			<form>
				<label for="username">Username</label>
				<input type="text" id="username" name="username" required>

				<label for="email">Email</label>
				<input type="email" id="email" name="email" required>

				<label for="address">Address</label>
				<input type="address" id="address" name="address" required>

				<label for="phone">Phone Number</label>
				<input type="tel" id="phone" name="phone" required>

				<label for="password">Password</label>
				<input type="password" id="password" name="password" required>

				<label for="confirm-password">Confirm Password</label>
				<input type="password" id="confirm-password" name="confirm-password" required>
				
				<label>Image</label>
				<input type="file" name="image">
				<div>
				<input type="submit" value="Register">
				<p>Already Registered? <a href="Login.jsp">Login</a></p>
				</div>
			</form>
		</div>
	</div>
</body>
</html>
