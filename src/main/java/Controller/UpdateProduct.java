package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import Model.ProductDAO;
import Model.Products;

@WebServlet("/updateProduct")
@MultipartConfig
public class UpdateProduct extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String productId = request.getParameter("productId");
		String productName = request.getParameter("productName");
		String price = request.getParameter("price");
		String category = request.getParameter("category");
		String brand = request.getParameter("brand");
		String description = request.getParameter("description");
		String stock = request.getParameter("stock");
		String productImagePath = "products/" + productId+".png";
		
		
		Products product = new Products(productId, productName, price, category, brand, description, stock, productImagePath);
		ProductDAO pDao = new ProductDAO();
		
		String message = pDao.updateProduct(product);
		Part image = request.getPart("image");
		
		if(message.equals("Successfully Registered") && image!=null && image.getInputStream().available() > 0) {
			String imagePath = getServletContext().getInitParameter("productImagePath");
			String fullPath = imagePath+productImagePath;
			image.write(fullPath);
			response.sendRedirect("viewProduct");
		}

	}

}
