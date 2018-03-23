/*package com.gym.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gym.DAO.ProductDAO;
import com.gym.model.Category;
import com.gym.model.Product;

public class ProductUnitTest {
	static ProductDAO productDAO;
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.gym");
		context.refresh();
		
		productDAO=(ProductDAO)context.getBean("productDAO");
	}

	@Test
	public void addProductTest()
	{
		Product product=new Product();
		product.setProductName("bend-rod");
		product.setProdDesc("Get used to accessories that help you");
		assertTrue("Problem in Product Insertion",productDAO.addProduct(product));
	}
	
	
	@Test
	public void getProductTest()
	{
		
		assertNotNull("Problem in get Category",productDAO.getProduct(5));
	}
	
	
	@Test
	public void deleteProductTest()
	{
		Product product=productDAO.getProduct(10);
		
		assertTrue("Problem in Deletion:",productDAO.deleteProduct(product));
	}
	
	@Test
	public void updateProductTest()
	{
		Product product=productDAO.getProduct(2);
		product.setPrice(4000);
		assertTrue("Problem in Updation",productDAO.updateProduct(product));
	}
	
	@Test
	public void listProductsTest()
	{
		List<Product> listProducts=productDAO.listProducts();
		assertNotNull("No Products",listProducts);
		
		for(Product product:listProducts)
		{
			
			System.out.println(product.getProductId()+":::");
			System.out.println(product.getProductName()+":::");
			System.out.println(product.getSupplierId()+":::");
			System.out.println(product.getProdDesc()+":::");
			System.out.println(product.getStock()+":::");
			System.out.println(product.getPrice()+":::");
		}
			
		}
	}


*/