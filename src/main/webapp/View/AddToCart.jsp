<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
    <%@ page import="Model.CartDAO" %>
     
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- <link rel="stylesheet" href="addtocart.css"> -->
<style>
    .row {
        display: flex;
        flex-direction: row;
        justify-content: space-between;
        align-items: center;
        background-color: white;
        box-shadow: 2px 2px 10px rgba(0, 0, 0, 0.1);
        padding: 10px;
        margin-bottom: 10px;
      }
      
      .child-class-image {
        flex: 1;
        margin-right: 10px;
        margin-left: 10px;
      }
      
      .child-class-middle {
        flex: 2;
       
      }
      
      .child-class-price {
        flex: 1;
        text-align: right;
        margin-right: 50px;
      }

        a {
            display: inline-block;
            background-color: #007bff;
            color: white;
            padding: 10px 20px;
            border-radius: 5px;
            text-decoration: none;
            font-size: 16px;
          }
          
          a:hover {
            background-color: #0069d9;
          }
      
</style>
</head>
<body>
<a href="homeEntry">Back</a>
<H1>ADD TO CART</H1>

<c:forEach var="ct" items="${cart}">
<div class="row">

        <div class="child-class-image">
            <img src="Images/${ct.imagePath}" height="100px" width="100px">
        </div>
        <div class="child-class-middle">
            <p>${ct.productName}</p>
            <p>${ct.orderNo}</p>
        </div>
        <div class="child-class-price">
            <p>${ct.price}</p>
        </div>


    </div>
</c:forEach>
     
 
     <%
    // create an instance of the Cartdao class
    CartDAO cartDao = new CartDAO();
     
    
    // call the fetchPrice() method and store the result in a variable
    
    String price = cartDao.fetchTotalPrice();
    
    // display the price on the page
    out.println("The price is: " + price);
%>

     
     <a href="checkOut">Check Out</a>
</body>
</html>