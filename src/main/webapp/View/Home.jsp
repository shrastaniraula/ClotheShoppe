<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="View/home.css">
<title>Clothe Shoppee</title>
</head>
<body>

<div class="search-container">
<div>

<form action= "SearchProduct" method="post">
<input type="text" name="searchObject" placeholder="Search Products...">
<input type="submit" value="SEARCH">
</form>
</div>




<div class="edit">
    <a href="EditProfileUser">Edit Profile</a>
    <a href="AddCart" >Cart</a>
    <a href="HistoryUser">View History</a></div>
</div>


<div class="products-lists">
		<c:forEach var="pd" items="${pdList}">
		<div class= "product-card">
		
		<img src="Images/${pd.productImagePath}" height="200px" width="200px" ><br>
        <h3 class="product-name">${pd.productName}</h3>
        <h2 class = "price" >${pd.price}</h2>
        <a href="${pageContext.request.contextPath}/singleProduct?id=${pd.productId}">Know More</a>
        
        
		</div>
        </c:forEach>
        

    </div>
</body>
</html>