package com.gym.DAO;

import java.util.List;

import com.gym.model.Product;

public interface ProductDAO {
	public boolean addProduct(Product product);
	public boolean deleteProduct(Product product);
	public boolean updateProduct(Product product);
	public Product getProduct(int productId);
	List<Product>  getProductsbasedonCatId(int CategoryId);
	public List<Product> listProducts();

}
