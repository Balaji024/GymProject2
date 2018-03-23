/*package com.gym.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gym.DAO.CategoryDAO;

import com.gym.model.Category;
import com.gym.model.Product;


public class CategoryUnitTest {
	static CategoryDAO categoryDAO;

	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.gym");
		context.refresh();
		
		categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
	}
	
	
	@Test
	public void addCategoryTest()
	{
		Category category=new Category();
	category.setCategoryId(1);
	category.setCategoryDescription("Run to Ruin Your Extra weight");
	category.setCategoryName("Treadmills");
		assertTrue("Problem in Category Insertion",categoryDAO.addCategory(category));
	}
	
	@Test
	public void getCategoryTest()
	{
		assertNotNull("Problem in get Category",categoryDAO.getCategory(1));
	}
	
@Test
public void deleteCategoryTest()
{
	Category category=categoryDAO.getCategory(5);
	
	assertTrue("Problem in Deletion:",categoryDAO.deleteCategory(category));
}

@Test
public void updateCategoryTest()
{
	Category category=categoryDAO.getCategory(1);
	category.setCategoryDescription("run to ruin your weight");
	assertTrue("Problem in Updation",categoryDAO.updateCategory(category));
}

@Test
public void listCategoriesTest()
{
	List<Category> listCategories=categoryDAO.listCategories();
	assertNotNull("No Products",listCategories);
	
	for(Category category:listCategories)
	{
		System.out.println(category.getCategoryId()+":::");
		System.out.println(category.getCategoryName()+":::");
		System.out.println(category.getCategoryDescription()+":::");
		
	}
		
	}
}
*/