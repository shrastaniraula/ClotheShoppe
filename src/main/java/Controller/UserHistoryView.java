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


@WebServlet("/HistoryUser")
public class UserHistoryView extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CartDAO pdao = new CartDAO();
		HttpSession session = ((HttpServletRequest)request).getSession();
		String customerPhone = (String) session.getAttribute("loggedInusername");
		
		ArrayList<Cart> historyList =  pdao.fetchHistoryList(customerPhone);
		request.setAttribute("histList",historyList);
		System.out.println(historyList);
		RequestDispatcher rd = request.getRequestDispatcher("View/History.jsp");
		rd.forward(request, response);
	}
}
