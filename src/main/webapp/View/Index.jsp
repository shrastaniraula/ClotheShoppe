<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="Discover.css">
  <title>Discover</title>
  <style>
    /* Set the background image for the entire page */
    body {
      background-image: url('images/discover.png');
      background-size: cover;
    }
    
    /* Style the button */
    button {
      display: block;
      margin: auto; /* Center the button horizontally */
      margin-top: 50vh; /* Center the button vertically */
    }
  </style>
</head>
<body>
<a href="${pageContext.request.contextPath}/homeEntry"><button>Discover</button></a>
</body>
</html>