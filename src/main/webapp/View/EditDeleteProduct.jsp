<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="Style.css">
<title>Edit Product</title>
</head>
<body>

<div class="container-fluid px-4">
    <div class="d-flex justify-content-between">
        <h1 class="mt-4">Product</h1>
        <div class="mt-4">
            <a href="AddProduct.jsp" class="btn btn-primary">Add Product</a>
        </div>
    </div>
    
    <div class="card mb-4 mt-4">
        <div class="card-header">
            <i class="fas fa-table me-1"></i>
            Product List
        </div>
        <div class="card-body">
            <table id="datatablesSimple">
                
                    <tr>
                        <th>Name</th>
                        <th>Category</th>
                        <th>Description</th>
                        <th>Brand</th>
                        <th>Price</th>
                        <th>Image</th>
                        <th>Stock</th>
                        <th>Action</th>
                    </tr>
                
             
                
                   <c:forEach var="pd" items="${pdList}">
                    <tr>
                        
				<td><c:out value="${pd.productId}"/></td>
				<td>${pd.productName}</td>
				<td>${pd.price}</td>
				<td>${pd.category}</td>
				<td>${pd.brand}</td>
				<td>${pd.description}</td>
				<td>${pd.stock}</td>
				<td><img src="images/${st.productImagePath}" height="100px" width="100px"></td>
				<td><a href="${pageContext.request.contextPath}/editProduct?id=${pd.productId}">Edit</a><a href="${pageContext.request.contextPath}/deleteProduct?id=${pd.productId}">Delete</a></td>
			</tr>	
		</c:forEach>
                   
                   
                </tbody>
            </table>
        </div>
    </div>
</div>


</body>
</html>