<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product</title>

<link rel="stylesheet" type="text/css" href="View/product.css">
</head>
<body>

<a href="homeEntry"><button>Go Back</button></a>
<div class="container">
    <div class="product-image">
        <img src="Images/${product.productImagePath}" alt="Product Image">
    </div>
    <div class="product-details">

        <h1>${product.productName}</h1>
        <p>Category:  ${product.category}</p>
        <h3>${product.brand}</h3><br>
        <p class="price">Price: ${product.price}</p>
        <p class="stock">Stock Available: ${product.stock}</p>
   
    
    <div class="rating">
            <input type="radio" name="rating" id="rating-5" value="5">
            <label for="rating-5"></label>
            <input type="radio" name="rating" id="rating-4" value="4">
            <label for="rating-4"></label>
            <input type="radio" name="rating" id="rating-3" value="3">
            <label for="rating-3"></label>
            <input type="radio" name="rating" id="rating-2" value="2">
            <label for="rating-2"></label>
            <input type="radio" name="rating" id="rating-1" value="1">
            <label for="rating-1"></label>
       
           <a href= "${pageContext.request.contextPath}/AddCart?id=${product.productId}"> <button>Add to Cart</button></a>
           
    </div>
</div>




</div>
<br>

</body>
</html>