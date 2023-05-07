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

@WebServlet("/updateUserByUser")
@MultipartConfig
public class UpdateUserByUser extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String ImagePath = "users/" + phone+".png";
		
		
		User user = new User(username, email, address, phone, password, ImagePath);
		RegistrationDAO rDao = new RegistrationDAO();
		
		String message = rDao.updateUser(user);
		
		Part image = request.getPart("image");
		
		if(message.equals("Successfully Registered") && image!=null && image.getInputStream().available() > 0) {
			String imagePath = getServletContext().getInitParameter("productImagePath");
			String fullPath = imagePath+ImagePath;
			image.write(fullPath);
			response.sendRedirect("homeEntry");
		}

	}

}
