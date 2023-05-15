<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="View/Style.css">
<title>User History</title>
</head>
<body>
<div class="container-fluid px-4">
    <div class="d-flex justify-content-between">
        <h1 class="mt-4">Order</h1>
        
        <div class="mt-4">
            <a href="View/Dashboard.jsp" class="btn btn-primary">Back</a>
        </div>
    </div>
    
    <div class="card mb-4 mt-4">
        <div class="card-header">
            <i class="fas fa-table me-1"></i>
            Order List
        </div>
        <div class="card-body">
            <table id="datatablesSimple">
                <thead>
                    <tr>
                        <th>Product Name</th>
                        <th>Price</th>
                        <th>Order Id</th>
                        <th>Image</th> 
                    </tr>
                </thead>
             <tbody>
                
                   <c:forEach var="hist" items="${histList}">
                    <tr>
                        
				<td><c:out value="${hist.productName}"/></td>
				<td>${hist.price}</td>
				<td>${hist.orderNo}</td>
				<td><img src="Images/${hist.imagePath}" height="100px" width="100px"></td>
				
			</tr>	
		</c:forEach>
                   
                   
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>