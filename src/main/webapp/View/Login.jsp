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
   
     <% if(session.getAttribute("loginError") != null){ %>
		
			<h2><%= session.getAttribute("loginError") %></h2>
			<%session.removeAttribute("loginError");%>	
			
		<%} %>
    <div class="container" style="display: flex; align-items: center; margin-top: 100px">
        <div class="image-container">
            <img src="images/clothe.png" alt="" height="500 px" width="600px">
        </div>
        <div>
            <form action="../Server2" method="post" style="margin-left: 100px; width: 500px">
                <h1>LOGIN FORM</h1>

                <label for="username">Phone number:</label>
                <input type="text" id="name" name="phone_number" required>
                
            	

                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required>


                <div>
                    <input type="submit" value="Login">
                </div>
                <p>Not Logged in? <a href="Signup.jsp">SignUp</a></p>
            </form>
             
        </div>

    </div>



</body>

</html>