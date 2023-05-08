<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="View/Style.css">
<title>Edit Product</title>
</head>
<body>

<div class="container-fluid px-4">
    <div class="d-flex justify-content-between">
        <h1 class="mt-4">Product</h1>
        
        <div class="mt-4">
            <a href="View/Dashboard.jsp" class="btn btn-primary">Back</a>
        </div>
    </div>
    
    <div class="card mb-4 mt-4">
        <div class="card-header">
            <i class="fas fa-table me-1"></i>
            Product List
        </div>
        <div class="card-body">
            <table id="datatablesSimple">
                <thead>
                    <tr>
                    <th>Product Id</th>
                        <th>Name</th>
                        <th>Price</th>
                        <th>Category</th>
                        <th>Brand</th>
                        <th>Description</th>
                        
                        <th>Stock</th>
                        <th>Image</th>
                        
                        <th>Action</th>
                    </tr>
                </thead>
             <tbody>
                
                   <c:forEach var="pd" items="${pdList}">
                    <tr>
                        
				<td><c:out value="${pd.productId}"/></td>
				<td>${pd.productName}</td>
				<td>${pd.price}</td>
				<td>${pd.category}</td>
				<td>${pd.brand}</td>
				<td>${pd.description}</td>
				<td>${pd.stock}</td>
				<td><img src="Images/${pd.productImagePath}" height="100px" width="100px"></td>
				<td><a href="${pageContext.request.contextPath}/editProduct?id=${pd.productId}" class="btn btn-primary btn-sm">Edit</a><a href="${pageContext.request.contextPath}/deleteProduct?id=${pd.productId}" class="btn btn-danger btn-sm ms-2">Delete</a></td>
			</tr>	
		</c:forEach>
                   
                   
                </tbody>
            </table>
        </div>
    </div>
    
    <div class="mt-4">
            <a href="View/AddProduct.jsp" class="btn btn-primary">Add Product</a>
        </div>
</div>


</body>
</html>