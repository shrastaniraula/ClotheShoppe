<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>

<img src="Images/${product.productImagePath}" height="200px" width="200px">
<h1>Product Name: ${product.productName}</h1>
<h1>Product Price: ${product.price}</h1>
<p>Product Description: ${product.description}</p>
<p>Product Brand: ${product.brand}</p>
<p>Product Category: ${product.category}</p>
<p>Total in stock: ${product.stock}</p>

<a>Rating</a>

<a href= "${pageContext.request.contextPath}/AddCart?id=${product.productId}">Add to Cart</a>
<a href="homeEntry">Go Back</a>





</div>
</body>
</html>