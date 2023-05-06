<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>




<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>My Ecommerce Store</title>
  <link rel="stylesheet" href="Home.css">
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

  <main>
    <section class="hero">
      <img src="${pageContext.request.contextPath}/Images/homepage.png" alt="placeholder image">
      <h2>Welcome to My Ecommerce Store</h2>
      <p>Discover our wide selection of products</p>
      <button>Shop Now</button>
    </section>

    <section class="featured-products">
      <h2>Featured Products</h2>
      <div class="product-grid">
        <div class="product">
          <img src="product1.jpg" alt="Product 1">
          <h3>Product 1</h3>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
          <button>Add to Cart</button>
        </div>
        <div class="product">
          <img src="product2.jpg" alt="Product 2">
          <h3>Product 2</h3>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
          <button>Add to Cart</button>
        </div>
        <div class="product">
          <img src="product3.jpg" alt="Product 3">
          <h3>Product 3</h3>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
          <button>Add to Cart</button>
        </div>
      </div>
    </section>

    <section class="about-us">
      <h2>About Us</h2>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ut dapibus nunc. Nullam ut velit vel augue euismod vulputate. Sed venenatis, mauris ac hendrerit efficitur, nisl elit varius elit, et consequat quam sapien in libero. In ac nulla est. Duis euismod, arcu vel eleifend convallis, enim turpis rutrum velit, in fermentum sapien lorem euismod enim. Praesent vitae ipsum at nulla cursus congue nec id leo.</p>
    </section>
  </main>

  <footer>
    <p>&copy; 2023 My Ecommerce Store</p>
  </footer>
</body>
</html>