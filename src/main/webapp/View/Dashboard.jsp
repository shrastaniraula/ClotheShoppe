<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="admin.css">
<title>Admin DashBoard</title>
</head>
<body>

<header class="admin-header">
        <h1>Welcome to Admin Dashboard!</h1>
    </header>
    <aside class="admin-sidebar">
        <nav>
            <ul>
                <li><a href="AddProduct.jsp">Add Product</a></li>
                <li><a href = "../viewProduct" >View product</a></li>
                <li><a href= "../viewUser">View User</a></li>
                <li><a href="../OrderViewAdmin">View Order</a></li>
            </ul>
        </nav>
    </aside>
    <main class="admin-content">
        <!-- <h2>Welcome to the Admin Dashboard</h2> -->
        <h2>Here you can change and  manage your website content.</h2>
    </main>
    <footer class="admin-footer">
        <p>© 2023 Admin Dashboard. All rights reserved.</p>
    </footer>
    


</body>
</html>