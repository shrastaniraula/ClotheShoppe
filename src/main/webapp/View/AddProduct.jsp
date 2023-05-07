<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product</title>
<link rel="stylesheet" href="Style.css">
</head>
<body>
<nav>
<!-- add a nav here -->
</nav>

<div class="container-fluid px-4">
    <div class="d-flex justify-content-between">
        <h1 class="mt-4">Add Product</h1>
        <div class="mt-4">
            <a href="Dashboard.jsp" class="btn btn-primary">Back</a>
        </div>
    </div>
    <hr>

    <div class="mb-4 row justify-content-center">
        <div class="col-lg-6">
            <form action="../AddProduct" method="post" enctype="multipart/form-data">
               
               <div class="form-group my-3">
                    <label for="">Product Id</label>
                    <input type="text" name="productId" id="" class="form-control" required>
                </div>
                
                <div class="form-group my-3">
                    <label for="">Product Name</label>
                    <input type="text" name="productName" id="" class="form-control" required>
                </div>
                <div class="form-group my-3">
                    <label for="">Product Price</label>
                    <input type="text" name="price" id="" class="form-control" required>
                </div>
               
                <div class="form-group my-3">
                    <label for="">Category</label>
                    <input type="text" name="category" id="" class="form-control" required>
                </div>
                <div class="form-group my-3">
                    <label for="">Brand</label>
                    <input type="text" name="brand" id="" class="form-control" required>
                </div>
                <div class="form-group my-3">
                    <label for="">Description</label>
                    <input type="text" name="description" id="" class="form-control" required>
                </div>
                <div class="form-group my-3">
                    <label for="">Stock</label>
                    <input type="text" name="stock" id="" class="form-control" required>
                </div>
                <div class="form-group my-3">
                    <label for="">Choose Image</label>
                    <input type= "file" name="image" id="" class="form-control" required>
                </div>
                <input type="submit" value="Submit" class="btn btn-primary form-control">
            </form>
        </div>

    </div>
</div>


</body>
</html>