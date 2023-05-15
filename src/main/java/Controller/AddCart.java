package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.Cart;
import Model.CartDAO;

@WebServlet("/AddCart")
public class AddCart extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		CartDAO cdao = new CartDAO();
		
		HttpSession session = ((HttpServletRequest)request).getSession();
		String customerPhone = (String) session.getAttribute("loggedInusername");
		ArrayList<Cart> finalCartList = cdao.getCartById(id, customerPhone);
		request.setAttribute("cart",finalCartList);
		RequestDispatcher rd = request.getRequestDispatcher("View/AddToCart.jsp");
		rd.forward(request, response);
		
	}
	
	

}
