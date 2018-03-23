package com.gym.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gym.DAO.CategoryDAO;
import com.gym.model.Category;
@Transactional
@Service

public class CategoryServiceImpl implements CategoryService {
	 @Autowired
	    private CategoryDAO categoryDAO;

	public boolean addCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryDAO.addCategory(category);
	}

	public Category getCategory(int categoryId) {
		// TODO Auto-generated method stub
		return categoryDAO.getCategory(categoryId);
		
	}

	public boolean deleteCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryDAO.deleteCategory(category);
	}

	public boolean updateCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryDAO.updateCategory(category);
	}

	public List<Category> listCategories() {
		// TODO Auto-generated method stub
		return categoryDAO.listCategories();
	}

}
