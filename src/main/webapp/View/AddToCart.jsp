<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Add to Cart</title>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha512-pP5QPx+lKcqH1vDGyK/MEzG2QhwyHXP+1bZgeYnU6NjK6en4+4mrTYy6Dhj7VgUwzZs7sYs3qX9mJfSyTgIlcQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha512-***" crossorigin="anonymous" referrerpolicy="no-referrer" />
	<link rel="stylesheet" href="cart.css">
	
</head>
<body>
	<header>
		<div class="search-bar">
			<form action="" method="get">
				<input type="text" name="search" placeholder="Search...">
				<button type="submit"><i class="fas fa-search"></i></button>
			</form>
			<div class="cart-icon">
				<i class="fas fa-shopping-cart"></i>
			</div>
		</div>
	</header>
	<main>
		<section class="cart-items">
			<h2>My Cart</h2>
			<div class="cart-buttons">
				<label for="select-all">Select All</label>
				<input type="checkbox" id="select-all">
				<button type="button" id="delete-selected">Delete</button>
			</div>
			<div class="cart-item">
				<div class="product-image">
					<img src="${pageContext.request.contextPath}/Images/Clothee Shoppe.png" alt="placeholder image">
				</div>
				<div class="product-info">
					<h3>Product Name</h3>
					<p>Product Description goes here.</p>
					<p>Price: $XX.XX</p>
					<div class="quantity">
						<button type="button" class="quantity-btn minus">-</button>
						<input type="number" name="quantity" value="1" min="1">
						<button type="button" class="quantity-btn plus">+</button>
					</div>
					<div class="options">
						<label for="size">Size:</label>
						<select name="size" id="size">
							<option value="S">S</option>
							<option value="M">M</option>
							<option value="L">L</option>
							<option value="XL">XL</option>
						</select>
					</div>
					<button type="button" class="delete">Delete</button>
				</div>
			</div>
		</section>
		<section class="checkout">
			<h2>Proceed to Checkout</h2>
			<div class="subtotal">
				<p>Subtotal: $XX.XX</p>
			</div>
			<button type="button" id="checkout-btn">Checkout</button>
		</section>
	</main>
	<footer>
		<p>&copy; 2023 My Ecommerce Store</p>
	</footer>
</body>
</html>
