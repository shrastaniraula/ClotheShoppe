package Model;

public class Products {


	private String productId;
	private String productName;
	private String price;
	private String category;
	private String brand;
	private String description;
	private String stock;
	private String productImagePath;
	
	public String getProductImagePath() {
		return productImagePath;
	}

	public void setProductImagePath(String productImagePath) {
		this.productImagePath = productImagePath;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public Products(String productId, String productName, String price, String category, String brand, String description, String stock, String productImagePath ) {
	this.productId = productId;
	this.productName = productName;
	this.price = price;
	this.category = category;
	this.brand = brand;
	this.description = description;
	this.stock = stock;
	this.productImagePath = productImagePath;
}








}
