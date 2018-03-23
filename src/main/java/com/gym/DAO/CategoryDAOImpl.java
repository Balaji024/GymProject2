package com.gym.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gym.model.Category;
import com.gym.model.Product;

@Repository("categoryDAO")
@Transactional

public class CategoryDAOImpl implements CategoryDAO {
@Autowired
SessionFactory sessionFactory;

	public boolean addCategory(Category category) {
		// TODO Auto-generated method stub
		try
		{
		sessionFactory.getCurrentSession().save(category);
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		System.out.println("Exception Arised..........:"+e);
		return false;
		}
	}
public boolean deleteCategory(Category category) {
	// TODO Auto-generated method stub
	try {
		sessionFactory.getCurrentSession().delete(category);
		//Product product1=(Product)session.get(Product.class,product.getProductId());
		
		return true;
		}
		catch(Exception e) {
			System.out.println("Exception Arised:"+e);
		return false;
		}

}
public boolean updateCategory(Category category) {
	// TODO Auto-generated method stub
	try
	{
	sessionFactory.getCurrentSession().saveOrUpdate(category);
	System.out.println("BEFORE INSERT/UPDATE " + category.getCategoryId());
	//if id==0, insert query
	//if id exits in the table, update query
//INsert into product values (?,.....)
	System.out.println("AFTER INSERT/UPDATE " + category.getCategoryId());
	return true;
	}
	catch(Exception e) {
		System.out.println("Exception Arised:"+e);
		
	}
	
	return false;
}
public Category getCategory(int categoryId) {
	// TODO Auto-generated method stub
	Session session=sessionFactory.openSession();
	Category category=(Category)session.get(Category.class,categoryId);
	return category;
	
}


public List<Category> listCategories() {
	// TODO Auto-generated method stub
	
	Session session=sessionFactory.getCurrentSession();
	//HQL - Hibernate query Language
	Query query=session.createQuery("from Category");//Select * from Product
	return query.list(); //List of Product objects
	
	
	
}

	
}
