package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Cart;
import Model.CartDAO;


@WebServlet("/OrderViewAdmin")
public class ViewOrderAdmin extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CartDAO pdao = new CartDAO();
	
		ArrayList<Cart> historyList =  pdao.fetchOrderList();
		request.setAttribute("histList",historyList);
		System.out.println(historyList);
		RequestDispatcher rd = request.getRequestDispatcher("View/ViewOrderAdmin.jsp");
		rd.forward(request, response);
	}
	

}
