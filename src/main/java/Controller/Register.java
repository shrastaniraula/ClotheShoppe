package Controller;

import java.io.IOException;



import java.io.PrintWriter;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.RegistrationDAO;

@WebServlet(name = "Server1", urlPatterns = {"/Server1"})
public class Register extends HttpServlet {
	private static final long serialVersionUID = 102831973239L;
       
    /**
     * @throws IOException 
     * @see HttpServlet#HttpServlet()
     */
    public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException { 
    	
    	String Username = request.getParameter("username");
    	String Email = request.getParameter("emailb");
    	String Gender = request.getParameter("gender");
    	String Password = request.getParameter("passwordb");
    	String CPassword = request.getParameter("passwordbc");
    	String Image = request.getParameter("image");
    	
    	
    	System.out.println(Username+Email+Gender+Password+CPassword+Image);
    	
    	response.setContentType("text/html");

    	
    	
    	RegistrationDAO sado = new RegistrationDAO();
		String message = sado.register(Username,Email,Gender,Password,CPassword,Image);
		PrintWriter outt = response.getWriter();
		outt.println("<h1>"+message+"</h1>");
    	
    }


}
