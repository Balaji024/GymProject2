package com.gym.DAO;

import com.gym.model.Cart;
import com.gym.model.CartItem;

import com.gym.model.CustomerOrder;

public interface CartItemDAO {
	void saveOrUpdateCartItem(CartItem cartItem);



	void removeCartItem(int cartItemId);



	Cart getCart(int cartId);



	CustomerOrder createOrder(Cart cart);

}
