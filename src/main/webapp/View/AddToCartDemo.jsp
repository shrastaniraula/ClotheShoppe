<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" href="cart.css">
	
</head>
<body>
<div class="back-btn">
				 <button style="font-size:24px">Back</button>
			</div>
	<header>
		 <div class="search">
        <input type="text" placeholder="Search..." />
        <button type="submit"><i class="fa fa-search"></i></button>
      	</div>
			
			<div class="back-btn">
				 <button style="font-size:24px">Back</button>
			</div>

	</header>
	<main>
		<section class="cart-items">
			<div class="cart-item">
				<div class="product-image">
					<img src="${pageContext.request.contextPath}/Images/p3.png" alt="placeholder image">
				</div>
				<div class="product-info-options">
					<div>
						<h3>Sweater</h3>
					</div>
					<div class="p">
						<p>It is a Sweater</p>
					</div>
					<div class="pr">
						<p>Price: Rs. 890</p>
					</div>
				</div>
			</div>
			<div class="cart-item">
				<div class="product-image">
					<img src="${pageContext.request.contextPath}/Images/p6.png" alt="placeholder image">
				</div>
				<div class="product-info-options">
					<div >
						<h3>T-shirt</h3>
					</div>
					<div class="p">
						<p>It is a T-shirt</p>
					</div>
					<div class="pr">
						<p>Price: Rs. 490</p>
					</div>
				</div>
			</div>
		</section>
		<section class="checkout">
			<button type="button" id="checkout-btn">Proceed to Checkout</button>
		</section>
	</main>
</body>
</html>