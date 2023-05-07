package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.CartDAO;
import Model.OrderId;


@WebServlet("/checkOut")
public class CheckOut extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CartDAO cdao = new CartDAO();
		String message =  cdao.checkOut();
		
		if(message.equals("Successfully CheckOut")) {
			response.sendRedirect("View/Index.jsp");
			OrderId ocount = new OrderId();
			ocount.increment();
		}
	}
}
