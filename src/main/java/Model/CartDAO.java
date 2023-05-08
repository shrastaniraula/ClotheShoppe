package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class CartDAO {
	
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/clotheshoppe";
		String username = "root";
		String password = "";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		return con;
	}

	public ArrayList<Cart> getCartById(String id, String phoneno){
		ArrayList<Cart> cartList = new ArrayList<>();
		ArrayList<Cart> finalCartList = new ArrayList<>();
		Connection con = null;
		String message = "";
		
		OrderId ocount = new OrderId();
		int orderNo = ocount.getCount();
		System.out.println("indao order no");
		System.out.println(orderNo);
		
		
		try {
			con = getConnection();
			String query = "select * from product where product_id = ?";
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1,id);
			ResultSet table = st.executeQuery();
			while(table.next()) {
				String productId = table.getString(1);
				String productName = table.getString(2);
				String description = table.getString(3);
				String price = table.getString(4);
				String brand = table.getString(5);
				String category = table.getString(6);
				String stock = table.getString(7);
				String productImagePath = table.getString(8);
				

				int prices = Integer.parseInt(price);
				
				Cart cart = new Cart(productId,  productName, phoneno, productImagePath,  prices, orderNo); 
				cartList.add(cart);
				
				String secondquery = "insert into cart values(?,?,?,?,?,?)";
				PreparedStatement pst = con.prepareStatement(secondquery);
				pst.setString(1,cart.getProductId());
				pst.setString(2,cart.getProductName());
				pst.setString(3,cart.getCustomerPhone());
				pst.setString(4,cart.getImagePath());
				pst.setLong(5,cart.getPrice());
				pst.setLong(6,cart.getOrderNo());
				
				int rows = pst.executeUpdate();
				if(rows >= 1) {
					message = "Successfully Added";
				}
				
			}
			String finalquery = "select * from cart where order_id = ?";
			PreparedStatement pdst = con.prepareStatement(finalquery);
			
			pdst.setLong(1, orderNo);
			
			ResultSet table2 = pdst.executeQuery();
			while(table2.next()) {
				String productIdd = table2.getString(1);
				String productNamee = table2.getString(2);
				String phoneNumberr = table2.getString(3);
				String imagee = table2.getString(4);
				String pricee = table2.getString(5);
				String orderNoo = table2.getString(6);
				
				int num = Integer.parseInt(orderNoo);
				int totalPrice = Integer.parseInt(pricee);
				
				Cart cartt = new Cart(productIdd, productNamee, phoneNumberr, imagee, totalPrice, num);
				
				finalCartList.add(cartt);		
			}
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.print(cartList);
		System.out.print(finalCartList);
		return finalCartList;
		
		
	}
	
	public String fetchTotalPrice(){
		
		Connection con = null;
		String totalPrice = "";
		
		OrderId ocount = new OrderId();
		int orderNo = ocount.getCount();
		
		try {
			con = getConnection();
			String query = "SELECT SUM(price) FROM cart where order_id= ?";
			PreparedStatement st = con.prepareStatement(query);
			
			st.setLong(1, orderNo);
			ResultSet table = st.executeQuery();
			while(table.next()) {
				 totalPrice = table.getString(1);
						
			}
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return totalPrice;
		
					
	}
	
	public String checkOut() {
		
		OrderId ocount = new OrderId();
		int orderNo = ocount.getCount();
		Connection con = null;
		String message = "";
		
		
		
		try {
			con = getConnection();
			String finalquery = "select * from cart where order_id = ?";
			PreparedStatement pdst = con.prepareStatement(finalquery);
			
			pdst.setLong(1, orderNo);
		ResultSet table2 = pdst.executeQuery();
		while(table2.next()) {
			String productIdd = table2.getString(1);
			String productNamee = table2.getString(2);
			String phoneNumberr = table2.getString(3);
			String imagee = table2.getString(4);
			String pricee = table2.getString(5);
			String orderNoo = table2.getString(6);
			
			int num = Integer.parseInt(orderNoo);
			int totalPrice = Integer.parseInt(pricee);
			
			String secondquery = "insert into history values(?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(secondquery);
			pst.setString(1,productIdd);
			pst.setString(2,productNamee);
			pst.setString(3,phoneNumberr);
			pst.setString(4,imagee);
			pst.setLong(5,totalPrice);
			pst.setLong(6,num);
			
			int rows = pst.executeUpdate();
			if(rows >= 1) {
				message = "Successfully CheckOut";
//				ocount.increment();
			}
					
		}} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return message;
		
		
	}
	
	public ArrayList<Cart> fetchHistoryList(String phone){
		ArrayList<Cart> cartList = new ArrayList<>();
		Connection con = null;
		try {
			con = getConnection();
			String query = "select * from history where customer_phone = ?";
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, phone);
			ResultSet table = st.executeQuery();
			while(table.next()) {
				String productId = table.getString(1);
				String productName = table.getString(2);
				String customerPhone = table.getString(3);
				String image = table.getString(4);
				String price = table.getString(5);
				String orderId = table.getString(6);
				
				int num = Integer.parseInt(orderId);
				int totalPrice = Integer.parseInt(price);
				
				Cart cart = new Cart(productId, productName, customerPhone, image, totalPrice, num); 
				cartList.add(cart);		
			}
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.print(cartList);
		return cartList;
		
					
	}
	
	public ArrayList<Cart> fetchOrderList(){
		ArrayList<Cart> cartList = new ArrayList<>();
		Connection con = null;
		try {
			con = getConnection();
			String query = "select * from history";
			PreparedStatement st = con.prepareStatement(query);
			ResultSet table = st.executeQuery();
			while(table.next()) {
				String productId = table.getString(1);
				String productName = table.getString(2);
				String customerPhone = table.getString(3);
				String image = table.getString(4);
				String price = table.getString(5);
				String orderId = table.getString(6);
				
				int num = Integer.parseInt(orderId);
				int totalPrice = Integer.parseInt(price);
				
				Cart cart = new Cart(productId, productName, customerPhone, image, totalPrice, num); 
				cartList.add(cart);		
			}
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.print(cartList);
		return cartList;
		
					
	}
	
	
	
}
