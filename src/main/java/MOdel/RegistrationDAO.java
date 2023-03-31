package MOdel;
import java.sql.*;

public class RegistrationDAO {
	
	public String register(String username, String email, String gender, String Pass, String cpass) {
	    try {
	        String url = "jdbc:mysql://localhost:3306/clotheeshopee";
	        String userName = "root";
	        String password = "";
	        String query = "insert into registration values(?,?,?,?,?)";

	        Class.forName("com.mysql.jdbc.Driver");
	        Connection con = DriverManager.getConnection(url, userName, password);
	        PreparedStatement pt = con.prepareStatement(query);
	        pt.setString(1, username);
	        pt.setString(2, email);
	        pt.setString(3, gender);
	        pt.setString(4, Pass);
	        pt.setString(5, cpass);
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
	

	
	

}
