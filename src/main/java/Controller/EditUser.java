package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Model.RegistrationDAO;
import Model.User;

@WebServlet("/editUser")
public class EditUser extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String phNo = request.getParameter("phNo");
		User user = new RegistrationDAO().getUserRecordByPhNo(phNo);
		request.setAttribute("userl",user);
		RequestDispatcher rd = request.getRequestDispatcher("View/UpdateUserByAdmin.jsp");
		rd.forward(request, response);
		
	}
}
