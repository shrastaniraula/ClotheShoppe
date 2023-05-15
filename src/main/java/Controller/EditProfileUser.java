package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import Model.RegistrationDAO;
import Model.User;



@WebServlet("/EditProfileUser")
@MultipartConfig 
public class EditProfileUser extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session = ((HttpServletRequest)request).getSession();
	
			String phone = (String) session.getAttribute("loggedInusername");
			RegistrationDAO rdao = new RegistrationDAO();
			User userList =  rdao.getUserRecordByPhNo(phone);
			request.setAttribute("userl",userList);
//			System.out.println(userList);
			RequestDispatcher rd = request.getRequestDispatcher("View/EditProfileUser.jsp");
			rd.forward(request, response);
		}
		
		
		
	}
	

