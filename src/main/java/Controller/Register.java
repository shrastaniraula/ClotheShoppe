package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import Model.RegistrationDAO;
import Model.User;

@SuppressWarnings("serial")
@WebServlet("/hello")
@MultipartConfig
public class Register extends HttpServlet {
       
    public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException { 
    	
    	
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String phone_number = request.getParameter("phone_number");
		String password = request.getParameter("password");
		
		String encryptedPassword = Model.AESEncryption.encrypt(password);
		String relativePath = "users/"+phone_number+".png";
		
		System.out.println("hello");
		System.out.print(encryptedPassword);
		System.out.println("hello");
		User rt = new User(username, email, address,phone_number, encryptedPassword,relativePath);
		System.out.print(rt);
		
		RegistrationDAO rDao = new RegistrationDAO();
		String message =  rDao.registerUser(rt);
		
		if(message.equals("Successfully Added")) {
			Part image = request.getPart("image");
			String imagePath = getServletContext().getInitParameter("productImagePath");
			String fullPath = imagePath+relativePath;
			image.write(fullPath);
			
			response.sendRedirect("View/Login.jsp");
		}
    	
    }


}
