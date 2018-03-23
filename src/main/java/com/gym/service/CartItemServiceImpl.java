/*package com.gym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gym.DAO.CartItemDAO;
import com.gym.model.Cart;
import com.gym.model.CartItem;
import com.gym.model.CustomerOrder;
@Transactional
@Service
public class CartItemServiceImpl {
	@Autowired
	private CartItemDAO cartItemDAO;

	public void saveOrUpdateCartItem(CartItem cartItem){

		cartItemDAO.saveOrUpdateCartItem(cartItem);

	}

	public void removeCartItem(int cartItemId) {

		cartItemDAO.removeCartItem(cartItemId);

		

	}

	public Cart getCart(int cartId) {

		

		return cartItemDAO.getCart(cartId);

	}

	public CustomerOrder createOrder(Cart cart) {

		// TODO Auto-generated method stub

		return cartItemDAO.createOrder(cart);

	}
}
*/