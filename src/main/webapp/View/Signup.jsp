<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- <link rel="stylesheet" href="E.css">-->
    <title>Sign In</title>
</head>

<body>
   

    <div class="container" style="display: flex; align-items: center; position: fixed;">
        <div class="img">
            <img src="images/photo.png" alt="">
        </div>
        <div class="form" style="height: fit-content; width:500px;">
            <form action="Server1" method="get">
                <h1>SignUp Form</h1>

                <label for="username">Username:</label>
                <input type="text" id="name" name="username" required>

                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>
                
                <label for="address">Address:</label>
                <input type="text" id="address" name="address" required>

                <label for="phone">Phone no:</label>
                <input type="text" id="phone" name="phone" required>

                <label for="password">Password:</label>
                <input type="password" id="password" name="passwordb" required>

                <label for="confirm_password">Confirm Password:</label>
                <input type="password" id="confirm_password" name="passwordbc" required>
                
                <div>
                <label>Image</label>
				<input type="file" name="image">
                </div>

                <div style="text-align: center;">
                    <input type="submit" value="Register">
                </div>
            </form>
            <p>Already Registered? <a href="Login.jsp">Login</a></p>
        </div>

    </div>



</body>

</html>