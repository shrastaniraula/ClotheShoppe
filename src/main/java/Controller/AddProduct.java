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

//import model.AESEncryption;

@SuppressWarnings("serial")
@WebServlet("/AddProduct")
@MultipartConfig
public class AddProduct extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
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
		
		String message = pDao.addProduct(product);
		System.out.println("okay");
		System.out.println(message);
		System.out.println("okay");
		
		if(message.equals("Successfully Added")) {
			
			
			
			
			String imagePath = getServletContext().getInitParameter("productImagePath");
			System.out.print(imagePath);
			String fullPath = imagePath+productImagePath;
			System.out.print(fullPath);
			
//			response.sendRedirect("/ClotheShop/View/EditDeleteProduct.jsp");
			response.sendRedirect("viewProduct");
			
//			Part image = request.getPart("image");
//			System.out.print(image);
//			image.write(fullPath);
			
			
			
		}
		
		
		
	}
	
	

	
	
}
