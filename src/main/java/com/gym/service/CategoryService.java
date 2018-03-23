package com.gym.service;

import java.util.List;

import com.gym.model.Category;

public interface CategoryService {
	public boolean addCategory(Category category);
	 public Category getCategory(int categoryId);
	 public boolean deleteCategory(Category category);
		public boolean updateCategory(Category category);
		public List<Category> listCategories();
}
