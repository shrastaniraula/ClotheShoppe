<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="View/Style.css">
<title>Update User</title>
</head>
<body>

<div class="container-fluid px-4">
    <div class="d-flex justify-content-between">
        <h1 class="mt-4">Edit User</h1>
        <div class="mt-4">
            <a href="View/Dashboard.jsp" class="btn btn-primary">Back</a>
        </div>
    </div>
    <hr>

    <div class="mb-4 row justify-content-center">
        <div class="col-lg-6">
            <form action="${pageContext.request.contextPath}/updateUser" method="post" enctype="multipart/form-data">
             
               
                 <div class="form-group my-3">
                    <label for="">User Name</label>
                    <input type="text" value="${userl.username}" name="username" id="" class="form-control" required>
                </div>
                <div class="form-group my-3">
                    <label for="">Password</label>
                    <input type="text" value="${userl.password}" name="password" id="" class="form-control" required>
                </div>
                
                <div class="form-group my-3">
                    <label for="">Phone No</label>
                    <input type="text" value="${userl.phone_number}" name="phone" id="" class="form-control" readonly>
                </div>
                
                <div class="form-group my-3">
                    <label for="">Address</label>
                    <input type="text" value="${userl.address}" name="address" id="" class="form-control" required>
                </div>
                <div class="form-group my-3">
                    <label for="">Email</label>
                    <input type="text" value="${userl.email}" name="email" id="" class="form-control" required>
                </div>
               
                <div class="form-group my-3">
                    <label for="">Change Image</label>
                    <input type="file" value="images/${userl.image}" name="image" onchange="onImageChange()" id="imageChooser" class="form-control" required>
                    <img id="image" src="Images/${userl.image}" height="100px" width="100px">
                </div>
                <input type="submit" value="Submit" class="btn btn-primary form-control">
            </form>
        </div>

    </div>
</div>

	<script>
		function onImageChange(){
			var imageChooser = document.getElementById("imageChooser");
			var image = document.getElementById("image");
			image.src = URL.createObjectURL(imageChooser.files[0]);
		}
	</script>

</body>
</html>