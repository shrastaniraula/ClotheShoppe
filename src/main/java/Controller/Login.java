package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.RegistrationDAO;

@WebServlet(name = "Server2", urlPatterns = {"/Server2"})
public class Login extends HttpServlet {
	private static final long serialVersionUID = 102831973239L;
       
    /**
     * @throws IOException 
     * @see HttpServlet#HttpServlet()
     */
    public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException { 
    	
    	String Username = request.getParameter("username");
    	String Password = request.getParameter("password");
    	
    	
    	
    	System.out.println(Username+Password);
    	
    	response.setContentType("text/html");

    	
    	
    	RegistrationDAO sado = new RegistrationDAO();
		boolean message = sado.login(Username,Password);
		
		if(message == true) {
			RequestDispatcher rd = request.getRequestDispatcher("Profile.jsp");
			rd.forward(request, response);
		}
		else {
			PrintWriter out = response.getWriter();
			out.println("<br><br><br>");
			out.println("<p>TRY AGAIN</p>");
			
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
		}
		
    	
    }


}

