package com.gym.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gym.DAO.CartItemDAO;
import com.gym.DAO.CategoryDAO;
import com.gym.DAO.CustomerDAO;
import com.gym.DAO.ProductDAO;
import com.gym.DAO.ProductDAOImpl;
import com.gym.model.CartItem;
import com.gym.model.Category;
import com.gym.model.Customer;
import com.gym.model.Product;

public class DemoTest {
	
	/*@Autowired
	static ProductDAO productDao;*/
	@Autowired
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ProductDAO productDAO;
		//CustomerDAO customerDAO;
		//UserDAO userDAO;
		//CategoryDAO categoryDAO;
		/*CartItemDAO cartItemDAO;*/
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.gym");
		context.refresh();
	//productDAO	=(ProductDAO)context.getBean("productDAO");
	
/*cartItemDAO=(CartItemDAO)context.getBean("cartItemDAO");
CartItem cartItem=new CartItem();
cartItem.setId(1);*/
		
	//ProductDAO	productDao=new ProductDAOImpl();//VMI
		//Product product=new Product();
		//product.setProductId(4);
		
		//product.setProductName("t-rod");
		//product.setPrice(5000);
	//	product.setStock(5);
//		product.setSupplierId(1);
	//	product.setProdDesc("lift to gain weight");
		//product.setPrice(5000);
		//productDAO.addProduct(product);
	
	//userDAO	=(UserDAO)context.getBean("userDAO");
	
	//User user1=new User();
	//user1.setUserId(1);
	//user1.setFirstname("ajeeth");
	//user1.setLastName("kumar");
	//user1.setAddress("No.4,Mathiyalagan street,nehru nagar,checkpost,velachery,chennai-600042");
	//user1.setGender("male");
	//user1.setMobileNumber("9952945869");
	//userDAO.addUser(user1);
		//categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
		//Category category1=new Category();
		//category1.setCategoryId(1);
		//category1.setCategoryDescription("Thesde eqiipments are used to make lowe body transformations");
		//category1.setCategoryName("lowerbody");
		
		
	}

}
