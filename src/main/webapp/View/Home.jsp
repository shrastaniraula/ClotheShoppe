<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
  <header>
    <h1>My Ecommerce Store</h1>
    <nav>
      <ul>
        <li><a href="#">Home</a></li>
        <li><a href="#">Shop</a></li>
        <li><a href="#">About Us</a></li>
        <li><a href="#">Contact Us</a></li>
      </ul>
    </nav>
  </header>

<div class="products-lists">
		<c:forEach var="pd" items="${pdList}">
		<div class= "product-card">
		
		<img src="images/${pd.productImagePath}" height="200px" width="200px" ><br>
        <h3 class="product-name">${pd.productName}</h3>
        <h2 class = "price" >${pd.price}</h2>
        <a href="${pageContext.request.contextPath}/singleProduct?id=${pd.productId}">Know More</a>
        
        
		</div>
        </c:forEach>
    </div>
</body>
</html>