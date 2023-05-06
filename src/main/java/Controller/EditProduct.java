package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.ProductDAO;
import Model.Products;

@WebServlet("/editProduct")
public class EditProduct extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		Products pd = new ProductDAO().getProductById(id);
		request.setAttribute("product",pd);
		RequestDispatcher rd = request.getRequestDispatcher("View/UpdateProduct.jsp");
		rd.forward(request, response);
		
	}
}
