package com.gym.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;

import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.gym.DAO.CartItemDAO;
import com.gym.DAO.CartItemDAOImpl;
import com.gym.DAO.CategoryDAO;
import com.gym.DAO.CategoryDAOImpl;
import com.gym.DAO.CustomerDAO;
import com.gym.DAO.CustomerDAOImpl;
import com.gym.DAO.ProductDAO;
import com.gym.DAO.ProductDAOImpl;
import com.gym.model.Authorities;
import com.gym.model.BillingAddress;
import com.gym.model.Cart;
import com.gym.model.CartItem;
import com.gym.model.Category;
import com.gym.model.Customer;
import com.gym.model.CustomerOrder;
import com.gym.model.Product;
import com.gym.model.ShippingAddress;
import com.gym.model.User;

@Configuration
@ComponentScan("com.gym")
@EnableTransactionManagement
public class DBconfig {
	@Bean(name="dataSource")
	public DataSource getH2DataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		
		System.out.println("---Data Source Created---");
		return dataSource;
	}
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory()
	{
		
		Properties hibernateProp=new Properties();
		
		hibernateProp.setProperty("hibernate.hbm2ddl.auto", "update");
		hibernateProp.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
		
		LocalSessionFactoryBuilder factoryBuilder=new LocalSessionFactoryBuilder(getH2DataSource());
		factoryBuilder.addAnnotatedClass(Product.class);
		factoryBuilder.addAnnotatedClass(Authorities.class);
		
		factoryBuilder.addAnnotatedClass(BillingAddress.class);
		factoryBuilder.addAnnotatedClass(ShippingAddress.class);
		factoryBuilder.addAnnotatedClass(User.class);
		factoryBuilder.addAnnotatedClass(Customer.class);
		factoryBuilder.addAnnotatedClass(Category.class);
		factoryBuilder.addAnnotatedClass(CustomerOrder.class);
		factoryBuilder.addAnnotatedClass(Cart.class);
		factoryBuilder.addAnnotatedClass(CartItem.class);
		factoryBuilder.addProperties(hibernateProp);
		
		System.out.println("Creating SessionFactory Bean");
		return factoryBuilder.buildSessionFactory();
	}
	@Bean(name="productDAO")
	public ProductDAO getProductDAO()
	{
		System.out.println("---Product DAO Implementation ---");
		return new ProductDAOImpl();
	}
	
	
	@Bean(name="categoryDAO")
	public CategoryDAO getCategoryDAO()
	{
		System.out.println("---Category DAO Implementation ---");
		return new CategoryDAOImpl();
	}
	@Bean(name="customerDAO")
	public CustomerDAO getCustomerDAO()
	{
		System.out.println("---Customer DAO Implementation ---");
		return new CustomerDAOImpl();
	}
	
	@Bean(name="cartItemDAO")
	public CartItemDAO getCartItemDAO()
	{
		System.out.println("---Category DAO Implementation ---");
		return new CartItemDAOImpl();
	}
	@Bean(name="txManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		System.out.println("---Transaction Manager----");
		return new HibernateTransactionManager(sessionFactory);
	}
	
	
	
}
