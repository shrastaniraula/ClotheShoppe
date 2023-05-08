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
   

    <div class="container" style="display: flex; align-items: center; position: fixed;">
        <div class="image-container">
            <img src="images/clothe.png" alt="" height="500 px" width="600px">
        </div>
        <div class="form" style="margin-left: 100px; width: 500px">
            <form action="../hello" method="post" enctype="multipart/form-data">
               
                
                
                <label for="username">User Name</label>
                <input type="text" name="username" required>
                
                <label for="email">email:</label>
                <input type="email" name="email" required>
                
                
                <label for="address">address:</label>
                <input type="text"  name="address" required>

                <label for="phone">phone_number</label>
                <input type="text"  name="phone_number" required>
                
                
                <label for="password">Password:</label>
                <input type="password" name="password" required>

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