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
			String query = "select * from products";
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
		return productList;
		
					
	}
	
	
	
	
}
