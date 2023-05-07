<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>

<div>
<form action= "SearchProduct" method="post">
<input type="text" name="searchObject" placeholder="Search Products...">
<input type="submit" value="Login">
</form>

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
        
       <a href="EditProfileUser">Edit Profile</a>
    </div>
</body>
</html>