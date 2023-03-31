<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="E.css">
    <title>Sign In</title>
</head>

<body>
    <h1 style="text-align: center;">Welcome to <span style="color: lightskyblue;">Register</span> Page</h1>

    <div class="container" style="display: flex; align-items: center; position: fixed;">
        <div class="img">
            <img src="images/photo.png" alt="">
        </div>
        <div class="form" style="height: fit-content; width:500px;">
            <form action="registration" method="post">
                <h1 style="text-align: center;"><span style="color: lightseagreen;">SignUp Form</span></h1>

                <label for="username">Username:</label>
                <input type="text" id="name" name="username" required>

                <label for="email">Email:</label>
                <input type="email" id="email" name="emailb" required><br>

                <div style="display: flex;">

                    <label>Gender:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>

                    <input type="radio" name="gender" value="Male" id="maleRadio" />

                    <label for="maleRadio">Male&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>

                    <input type="radio" name="gender" value="Female" id="femaleRadio" />

                    <label for="femaleRadio">Female</label>

                </div><br>

                <label for="password">Password:</label>
                <input type="password" id="password" name="passwordb" required>

                <label for="confirm_password">Confirm Password:</label>
                <input type="password" id="confirm_password" name="passwordbc" required>

                <div style="text-align: center;">
                    <input type="submit" value="Register">
                </div>
            </form>
        </div>

    </div>



</body>

</html>