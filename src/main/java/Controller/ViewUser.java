package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.RegistrationDAO;
import Model.User;

@WebServlet("/viewUser")
public class ViewUser extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RegistrationDAO rdao = new RegistrationDAO();
		ArrayList<User> userList =  rdao.fetchUserRecord();
		request.setAttribute("userList",userList);
		RequestDispatcher rd = request.getRequestDispatcher("View/EditProfileAdmin.jsp");
		rd.forward(request, response);
	}
	
}
