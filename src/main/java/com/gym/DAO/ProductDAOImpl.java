package com.gym.DAO;

import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gym.model.Product;
@Repository("productDAO")
@Transactional
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	SessionFactory sessionFactory;

	public boolean addProduct(Product product) {
		System.out.println(product.getCategory().getCategoryId());
		// TODO Auto-generated method stub
		try
		{
		sessionFactory.getCurrentSession().save(product);
		return true;
		}
		catch(Exception e)
		{
		System.out.println("Exception Arised:"+e);
		return false;
		}
		
	}

	public boolean deleteProduct(Product product) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(product);
			//Product product1=(Product)session.get(Product.class,product.getProductId());
			
			return true;
			}
			catch(Exception e) {
				System.out.println("Exception Arised:"+e);
			return false;
			}
		
	}

	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		try
		{
		sessionFactory.getCurrentSession().saveOrUpdate(product);
		System.out.println("BEFORE INSERT/UPDATE " + product.getProductId());
		//if id==0, insert query
		//if id exits in the table, update query
	//INsert into product values (?,.....)
		System.out.println("AFTER INSERT/UPDATE " + product.getProductId());
		return true;
		}
		catch(Exception e) {
			System.out.println("Exception Arised:"+e);
			
		}
		return false;
		
	}

	public Product getProduct(int productId) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Product product=(Product)session.get(Product.class,productId);
		return product;
	}
		
	public List<Product> listProducts() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		//HQL - Hibernate query Language
		Query query=session.createQuery("from Product");//Select * from Product
		return query.list(); //List of Product objects
		
	}

	public List<Product> getProductsbasedonCatId(int categoryId) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();

		//HQL - Hibernate query Language

		return session.createQuery("from Product p where p.category.categoryId="+":cateId ").setInteger("cateId", categoryId).list() ; 		

	
	}



		
	}
	


