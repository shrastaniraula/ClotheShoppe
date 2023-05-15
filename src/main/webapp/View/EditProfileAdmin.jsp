<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="View/Style.css">
<title>Profile</title>
</head>
<body>

<div class="container-fluid px-4">
    <div class="d-flex justify-content-between">
        <h1 class="mt-4">User</h1>
        <div class="mt-4">
            <a href="View/Dashboard.jsp" class="btn btn-primary">Back</a>
        </div>
    </div>
    
    <div class="card mb-4 mt-4">
        <div class="card-header">
            <i class="fas fa-table me-1"></i>
            User List
        </div>
        <div class="card-body">
            <table id="datatablesSimple">
                <thead>
                    <tr>
                    <th>Phone Number</th>
                        <th>Name</th>
                        <th>Password</th>
                        <th>Address</th>
                        <th>Email</th>
                        
                        <th>Image</th>
                        
                       
                        
                        <th>Action</th>
                    </tr>
                </thead>
             <tbody>
                
                   <c:forEach var="userl" items="${userList}">
                    <tr>
                        
				<td><c:out value="${userl.phone_number}"/></td>
				<td>${userl.username}</td>
				<td>${userl.password}</td>
				<td>${userl.address}</td>
				<td>${userl.email}</td>
				<td><img src="Images/${userl.image}" height="100px" width="100px"></td>
				<td><a href="${pageContext.request.contextPath}/editUser?phNo=${userl.phone_number}" class="btn btn-primary btn-sm">Edit</a><a href="${pageContext.request.contextPath}/deleteUser?phNo=${userl.phone_number}" class="btn btn-danger btn-sm ms-2">Delete</a></td>
			</tr>	
		</c:forEach>
                   
                   
                </tbody>
            </table>
        </div>
    </div>
</div>



</body>
</html>