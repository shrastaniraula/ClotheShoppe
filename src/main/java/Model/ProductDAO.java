package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAO {
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/clotheshoppe";
		String username = "root";
		String password = "";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		return con;
	}
	
	public String addProduct(Products product) {
		String message = "";
		try {
			
			Connection con =  getConnection();
			String query = "insert into product values(?,?,?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1,product.getProductId());
			pst.setString(2,product.getProductName());
			pst.setString(3,product.getDescription());
			pst.setString(4,product.getPrice());
			pst.setString(5,product.getBrand());
			pst.setString(6,product.getCategory());
			pst.setString(7,product.getStock());
			pst.setString(8,product.getProductImagePath());
			int rows = pst.executeUpdate();
			if(rows >= 1) {
				message = "Successfully Added";
			}
			con.close();	
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
			message = e.getMessage();
		}
		return message;	
		
	}
	
	public ArrayList<Products> fetchProductList(){
		ArrayList<Products> productList = new ArrayList<>();
		Connection con = null;
		try {
			con = getConnection();
			String query = "select * from product";
			PreparedStatement st = con.prepareStatement(query);
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
				
				Products product = new Products(productId, productName, price, category, brand, description, stock, productImagePath); 
				productList.add(product);		
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
		System.out.print(productList);
		return productList;
		
					
	}
	
	
	public ArrayList<Products> fetchProductListbySearch(String searching){
		ArrayList<Products> productList = new ArrayList<>();
		Connection con = null;
		try {
			con = getConnection();
			String query = "select * from product where product_name like ?";
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, "%" + searching + "%");
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
				
				Products product = new Products(productId, productName, price, category, brand, description, stock, productImagePath); 
				productList.add(product);
				
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
		System.out.print(productList);
		return productList;
		
					
	}
	
	public Products getProductById(String productId) {
		Connection con = null;
		Products product = null;
		try {
			con = getConnection();
			String query = "select * from product where product_id=?";
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1,productId);
			ResultSet table = st.executeQuery();
			while(table.next()) {
				String productId2 = table.getString(1);
				String productName = table.getString(2);
				String description = table.getString(3);
				String price = table.getString(4);
				String brand = table.getString(5);
				String category = table.getString(6);
				String stock = table.getString(7);
				String productImagePath = table.getString(8);
				
				product = new Products(productId2, productName, price, category, brand, description, stock, productImagePath);
						
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
		return product;
		
	}
	
//	updateProduct
	public String updateProduct(Products product) {
		String message = "";
		try {
			
			Connection con =  getConnection();
			String query = "UPDATE product SET product_name=?, description=?, price=?, brand=?, category=?, stock=?, product_imagepath=? where product_id=?";
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setString(1,product.getProductName());
			pst.setString(2,product.getDescription());
			pst.setString(3,product.getPrice());
			pst.setString(4,product.getBrand());
			pst.setString(5,product.getCategory());
			pst.setString(6,product.getStock());
			pst.setString(7,product.getProductImagePath());
			
			pst.setString(8,product.getProductId());

			int rows = pst.executeUpdate();
			if(rows >= 1) {
				message = "Successfully Registered";
			}
			con.close();	
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
			message = e.getMessage();
		}
		return message;	
	}
	
	public String deleteProduct(String productId) {
		String message = "";
		try {
			
			Connection con =  getConnection();
			String query = "delete from product where product_id=?";
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setString(1,productId);

			int rows = pst.executeUpdate();
			
			
				message = "Successfully Deleted";
			
			con.close();	
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
			message = e.getMessage();
		}
		return message;	
	}
	
	
	
	
	
}
