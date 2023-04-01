package Model;
import java.sql.*;

public class RegistrationDAO {
	
	public String register(String username, String email, String gender, String Pass, String cpass, String image) {
	    try {
	        String url = "jdbc:mysql://localhost:3306/clotheeshopee";
	        String userName = "root";
	        String password = "";
	        String query = "insert into registration values(?,?,?,?,?,?)";

	        Class.forName("com.mysql.jdbc.Driver");
	        Connection con = DriverManager.getConnection(url, userName, password);
	        PreparedStatement pt = con.prepareStatement(query);
	        pt.setString(1, username);
	        pt.setString(2, email);
	        pt.setString(3, gender);
	        pt.setString(4, Pass);
	        pt.setString(5, cpass);
	        pt.setString(6, image);
	        int rows = pt.executeUpdate();
	        if (rows >= 1) {
	            return "Successfully Added";
	        } else {
	            return "something is missing";
	        }
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	        return e.getMessage();
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	        return e.getMessage();
	    }		
	}
	
	public boolean login(String Id, String pass) {
		
		try {
	        String url = "jdbc:mysql://localhost:3306/clotheeshopee";
	        String userName = "root";
	        String password = "";
	        String query = "select * from registration where UserName = '"+ Id +"' and Password = '" + pass+ "'";

	        Class.forName("com.mysql.jdbc.Driver");
	        Connection con = DriverManager.getConnection(url, userName, password);
	        PreparedStatement pt = con.prepareStatement(query);
	        ResultSet table = pt.executeQuery();
	        
	        if (table.next()) {
				return true;
			}
			else {
				return false;
			}
		}
		catch(SQLException e){} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return false;
		
		
		
	}
	

	

}
