package com.gym.service;

import java.util.List;


import com.gym.model.Product;

public interface ProductService {
	public boolean addProduct(Product product);
	 public Product getProduct(int productId);
	 public boolean deleteProduct(Product product);
		public boolean updateProduct(Product product);
		List<Product>  getProductsbasedonCatId(int CategoryId);
		public List<Product> listProducts();

}
