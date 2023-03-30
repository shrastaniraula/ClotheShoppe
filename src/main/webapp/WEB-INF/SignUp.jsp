<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp</title>
<link rel="stylesheet" type="text/css" href="E.css">
</head>
<body>
<body>

      <form style="width: 30%;">
        <h1>Signup Form</h1>
        <label for="username">Username:</label>
        <input type="text" name="username" required><br><br>
       	<label for="email">Email:</label>
        <input type="email" name="email" required><br><br>
        <label for="password">Password:</label>
        <input type="password" name="password" required><br><br>
        <label for="confirm-password">Confirm Password:</label>
        <input type="password" name="confirm-password" required><br><br>
        <label>Profie Photo</label>
		<input type="file" name="image">
        <input type="submit" value="Signup">
      </form>
</body>
</html>