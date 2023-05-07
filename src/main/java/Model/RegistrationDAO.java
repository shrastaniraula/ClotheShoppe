package Model;
import java.sql.*;
import java.util.ArrayList;

import Model.AESEncryption;


public class RegistrationDAO {
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/clotheshoppe";
		String username = "root";
		String password = "";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		return con;
	}
	
	
	public String registerUser(User user) {
		String message = "";
	    try {
	    	String query = "insert into user(password, username, address, phone_number, image, email) values(?,?,?,?,?,?)";
	    	Connection con =  getConnection();
	        PreparedStatement pt = con.prepareStatement(query);
	        pt.setString(1, user.getPassword());
	        pt.setString(2, user.getUsername());
	        pt.setString(3, user.getAddress());
	        pt.setString(4, user.getPhone_number());
	        pt.setString(5, user.getImage());
	        pt.setString(6, user.getEmail());
	       
	        int rows = pt.executeUpdate();
	        if (rows >= 1) {
	            return "Successfully Added";
	        } 
	        con.close();
	    } 
	    catch (SQLException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
			message = e.getMessage();
		}
		return message;		
	}
	
	public ArrayList<User> fetchUserRecord(){
		ArrayList<User> userList = new ArrayList<>();
		Connection con = null;
		try {
			con = getConnection();
			String query = "select * from user";
			PreparedStatement st = con.prepareStatement(query);
			ResultSet table = st.executeQuery();
			while(table.next()) {
				String user_id = table.getString(1);
				String password2 = table.getString(2);
				String decryptedPassword = AESEncryption.decrypt(password2);
				String username = table.getString(3);
				String address = table.getString(4);
				String phone_number2 = table.getString(5);
				String image = table.getString(6);
				String email = table.getString(7);
				
				User user = new User(username, email, address, phone_number2, password2, image);
				
				userList.add(user);		
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
		System.out.println(userList);
		return userList;	
	}
	
	public boolean checkLogin(String phone_number, String password) {
		boolean isValid = false;
		try {
			Connection con = getConnection();
			String EncryptedPassword = AESEncryption.encrypt(password);
			String query = "select * from user where phone_number=? and password=?";
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, phone_number);
			st.setString(2, EncryptedPassword);
			
			
			ResultSet table = st.executeQuery();
			
			if(table.next()) {
				isValid = true;
					
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isValid;
		
	}
	public User getUserRecordByPhNo(String user_id) {
		Connection con = null;
		User user = null;
		try {
			con = getConnection();
			String query = "select * from user where phone_number=?";
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1,user_id);
			ResultSet table = st.executeQuery();
			while(table.next()) {
				String user_id1 = table.getString(1);
				String password2 = table.getString(2);
				String decryptedPassword = AESEncryption.decrypt(password2);
				String username = table.getString(3);
				String address = table.getString(4);
				String phone_number2 = table.getString(5);
				String image = table.getString(6);
				String email = table.getString(7);
				user = new User(username, email, address, phone_number2, decryptedPassword, image);
				
			
				
						
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
		return user;
		
	}
	
	public String updateUser(User user) {
		String message = "";
		try {
			
			Connection con =  getConnection();
			String query = "UPDATE user SET password=?, username=?, address=?, image=?, email=? where phone_number=?";
			PreparedStatement pst = con.prepareStatement(query);
			
			  	pst.setString(1, user.getPassword());
		        pst.setString(2, user.getUsername());
		        pst.setString(3, user.getAddress());
		        pst.setString(4, user.getImage());
		        pst.setString(5, user.getEmail());
		       
		        pst.setString(6, user.getPhone_number());
		        
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
	
	public String deleteUser(String phone) {
		String message = "";
		try {
			
			Connection con =  getConnection();
			String query = "delete from user where phone_number=?";
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setString(1,phone);

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