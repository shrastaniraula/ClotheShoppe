package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Model.RegistrationDAO;

@WebServlet("/deleteUser")
public class DeleteUser extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String phNo = request.getParameter("phNo");
		String message = new RegistrationDAO().deleteUser(phNo);
		
		
		if(message.equals("Successfully Deleted")) {
			response.sendRedirect("viewUser");
		}
		else {
			System.out.println(message);
		}
	}
	
	
}
