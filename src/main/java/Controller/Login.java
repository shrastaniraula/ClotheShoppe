package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.RegistrationDAO;
import Model.User;



@WebServlet("/Server2")
public class Login extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		String phone_number = request.getParameter("phone_number");
		String password = request.getParameter("password");
		
		
		RegistrationDAO rDao = new RegistrationDAO();
		boolean isValid =  rDao.checkLogin(phone_number,password);
		HttpSession session = request.getSession();
		if(isValid == true) {
			session.setAttribute("loggedInusername",phone_number);
			response.sendRedirect("View/Index.jsp");
			
		}
		else {
			session.setAttribute("loginError","Invalid user_id or password");
			response.sendRedirect("View/Login.jsp");		
		}
		
	}
      
   

}