package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.ProductDAO;
import Model.Products;


@WebServlet("/SearchProduct")
public class SearchProduct extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String searching = request.getParameter("searchObject");
		
		System.out.print(searching);
		
		ProductDAO pdao = new ProductDAO();
		ArrayList<Products> productList =  pdao.fetchProductListbySearch(searching);
		request.setAttribute("pdList",productList);
		System.out.println(productList);
		RequestDispatcher rd = request.getRequestDispatcher("View/Home.jsp");
		rd.forward(request, response);
	}
}
