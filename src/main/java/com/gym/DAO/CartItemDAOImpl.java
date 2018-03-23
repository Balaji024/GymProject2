package com.gym.DAO;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gym.model.Authorities;
import com.gym.model.Cart;
import com.gym.model.CartItem;
import com.gym.model.Customer;
import com.gym.model.CustomerOrder;
import com.gym.model.User;
@Repository("cartItemDAO")
@Transactional
public class CartItemDAOImpl implements CartItemDAO{
	@Autowired

	 SessionFactory sessionFactory;

		public void saveOrUpdateCartItem(CartItem cartItem) {

			Session session=sessionFactory.getCurrentSession();

			session.saveOrUpdate(cartItem);

		}

		public void removeCartItem(int cartItemId) {

		    Session session=sessionFactory.getCurrentSession();

		    //select * from cartitem where id=?

		    CartItem cartItem=(CartItem)session.get(CartItem.class, cartItemId);

		    //delete from cartitem where id=?

		    session.delete(cartItem);

			

		}

		public Cart getCart(int cartId) {

			Session session=sessionFactory.getCurrentSession();

			Cart cart=(Cart)session.get(Cart.class, cartId);

			//select records both from parent and child table , fetchType.EAGER

			return cart;

		}

		public CustomerOrder createOrder(Cart cart) {

			Session session=sessionFactory.getCurrentSession();

			CustomerOrder customerOrder=new CustomerOrder();

			customerOrder.setPurchaseDate(new Date());

			List<CartItem> cartItems=cart.getCartItems();

			double grandTotal=0;

			for(CartItem cartItem:cartItems){

				grandTotal=cartItem.getTotalPrice() + grandTotal;

			}

			

			cart.setGrandTotal(grandTotal);//update grandtotal column in cart

			customerOrder.setCart(cart);//FK cart_id

			Customer customer=cart.getCustomer();

			customerOrder.setCustomer(customer);//FK customer_id

			customerOrder.setBillingAddress(customer.getBillingaddress());//FK billingaddress_id

			customerOrder.setShippingAddress(customer.getShippingaddress());//FK shipping Address Id

			session.save(customerOrder);

			//insert into customerorder ..

			//update cart set grandtotal where id=?

			//update shippingaddress set ..... where id=?

			return customerOrder;

		}

}
