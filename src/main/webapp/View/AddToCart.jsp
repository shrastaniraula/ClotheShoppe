<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
    <%@ page import="Model.CartDAO" %>
     
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="homeEntry">Back</a>
	 <c:forEach var="ct" items="${cart}">
	 <img src="Images/${ct.imagePath}" height="100px" width="100px">
	 <p>${ct.productName}</p>
	 <p>${ct.price}</p>
	 <p>${ct.orderNo}</p>
	 </c:forEach>
	 
	 
	 <%
    // create an instance of the Cartdao class
    CartDAO cartDao = new CartDAO();
    
    // call the fetchPrice() method and store the result in a variable
    String price = cartDao.fetchTotalPrice();
    
    // display the price on the page
    out.println("The price is: " + price);
%>
<br>
	 
	 <a href="checkOut">Check Out</a>
</body>
</html>