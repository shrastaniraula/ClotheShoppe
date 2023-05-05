<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
            <form action="/edit-patient/{{$p->id}}" method="post">
             
                <div class="form-group my-3">
                    <label for="">Product Name</label>
                    <input type="text" value="{{$product->name}}" name="name" id="" class="form-control" required>
                </div>
                <div class="form-group my-3">
                    <label for="">Product Price</label>
                    <input type="number" value="{{$product->price}}" name="price" id="" class="form-control" required>
                </div>
                
                <div class="form-group my-3">
                    <label for="">Category</label>
                    <input type="text" value="{{$$product->category}}" name="category" id="" class="form-control" required>
                </div>
                
                <div class="form-group my-3">
                    <label for="">Brand</label>
                    <input type="text" value="{{$$product->brand}}" name="brand" id="" class="form-control" required>
                </div>
                <div class="form-group my-3">
                    <label for="">Description</label>
                    <input type="text" value="{{$$product->description}}" name="description" id="" class="form-control" required>
                </div>
                <div class="form-group my-3">
                    <label for="">Stock</label>
                    <input type="number" value="{{$$product->stock}}" step='any' name="stock" id="" class="form-control" required>
                </div>
                <div class="form-group my-3">
                    <label for="">Change Image</label>
                    <input type="file" value="{{$product->image}}" name="image" id="" class="form-control" required>
                </div>
                <input type="submit" value="Submit" class="btn btn-primary form-control">
            </form>
        </div>

    </div>
</div>

</body>
</html>