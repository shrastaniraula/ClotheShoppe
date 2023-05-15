package Model;

public class Cart {
	
	private String productId;
	private String customerPhone;
	private String imagePath;
	private int price;
	private int orderNo;
	private String productName;
	
	public Cart(String productId, String productName, String customerPhone, String imagePath, int price, int orderNo) {
		this.productId = productId;
		this.productName = productName;
		this.customerPhone = customerPhone;
		this.imagePath = imagePath;
		this.price = price;
		this.orderNo = orderNo;
	}
	
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	
}
