<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Product</title>
<link rel="stylesheet" href="Style.css">
</head>
<body>
<div class="container-fluid px-4">
    <div class="d-flex justify-content-between">
        <h1 class="mt-4">Edit Product</h1>
        <div class="mt-4">
            <a href="/dashboard" class="btn btn-primary">Back</a>
        </div>
    </div>
    <hr>

    <div class="mb-4 row justify-content-center">
        <div class="col-lg-6">
            <form action="${pageContext.request.contextPath}/updateProduct" method="post" enctype="multipart/form-data">
             
                <div class="form-group my-3">
                    <label for="">Product Id</label>
                    <input type="text" value="${product.productId}" name="productId" id="" class="form-control" required>
                </div>
                 <div class="form-group my-3">
                    <label for="">Product Name</label>
                    <input type="text" value="${product.productName}" name="productName" id="" class="form-control" required>
                </div>
                <div class="form-group my-3">
                    <label for="">Product Price</label>
                    <input type="text" value="${product.price}" name="price" id="" class="form-control" required>
                </div>
                
                <div class="form-group my-3">
                    <label for="">Category</label>
                    <input type="text" value="${product.category}" name="category" id="" class="form-control" required>
                </div>
                
                <div class="form-group my-3">
                    <label for="">Brand</label>
                    <input type="text" value="${product.brand}" name="brand" id="" class="form-control" required>
                </div>
                <div class="form-group my-3">
                    <label for="">Description</label>
                    <input type="text" value="${product.description}" name="description" id="" class="form-control" required>
                </div>
                <div class="form-group my-3">
                    <label for="">Stock</label>
                    <input type="number" value="${product.stock}" step='any' name="stock" id="" class="form-control" required>
                </div>
                <div class="form-group my-3">
                    <label for="">Change Image</label>
                    <input type="file" value="images/${product.productImagePath}" name="image" onchange="onImageChange()" id="imageChooser" class="form-control" required>
                    <img id="image" src="images/${product.productImagePath}" height="100px" width="100px">
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