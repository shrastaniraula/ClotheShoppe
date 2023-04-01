<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="E.css">
    <title>Log In</title>
</head>

<body>
   

    <div class="container" style="display: flex; align-items: center;">
        <div class="img">
            <img src="images/photo.png" alt="">
        </div>
        <div class="form" style="height: fit-content; width:500px;">
            <form action="Server2" method="post">
                <h1 style="text-align: center;"><span style="color: lightseagreen;">LOGIN FORM</span></h1>

                <label for="username">Username:</label>
                <input type="text" id="name" name="username" required>

                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required>


                <div style="text-align: center;">
                    <input type="submit" value="Register">
                </div>
            </form>
        </div>

    </div>



</body>

</html>