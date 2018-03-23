package com.gym.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gym.DAO.ProductDAO;
import com.gym.model.Category;
import com.gym.model.Product;
@Transactional
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
private ProductDAO productDAO;
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		return productDAO.addProduct(product);
	}

	public Product getProduct(int productId) {
		// TODO Auto-generated method stub
		return productDAO.getProduct(productId);
	}

	public boolean deleteProduct(Product product) {
		// TODO Auto-generated method stub
		return productDAO.deleteProduct(product);
	}

	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return productDAO.updateProduct(product);

	}

	public List<Product> listProducts() {
		// TODO Auto-generated method stub
		return productDAO.listProducts();
	}

	
	

	public List<Product> getProductsbasedonCatId(int CategoryId) {
		// TODO Auto-generated method stub
		return productDAO.getProductsbasedonCatId(CategoryId);
	}
	}

