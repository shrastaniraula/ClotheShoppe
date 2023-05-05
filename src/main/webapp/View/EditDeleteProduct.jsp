<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
            <a href="/add-patient" class="btn btn-primary">Add Product</a>
        </div>
    </div>
    
    <div class="card mb-4 mt-4">
        <div class="card-header">
            <i class="fas fa-table me-1"></i>
            Patient List
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
                
             
                <tbody>
                   <!-- @foreach($patient as $p) --> 
                    <tr>
                        <td>{{$p->name}}</td>
                        <td>{{$p->gender}}</td>
                        <td>{{$p->phone_number}}</td>
                        <td>{{$p->age}}</td>
                        <td>{{$p->service}}</td>
                        <td>{{$p->total}}</td>

                        <td>{{$p->arrival}}</td>
                        <td><a href="/edit-patient/{{$p->id}}" class="btn btn-primary btn-sm">Edit</a><a href="/delete-patient/{{$p->id}}" class="btn btn-danger btn-sm ms-2">Delete</a></td>
                    </tr>
                   
                   
                </tbody>
            </table>
        </div>
    </div>
</div>


</body>
</html>