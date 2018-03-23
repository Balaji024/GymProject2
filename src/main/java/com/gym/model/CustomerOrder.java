package com.gym.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class CustomerOrder {
	@Id

	@GeneratedValue(strategy=GenerationType.AUTO)

private int orderId;

private Date purchaseDate;

@ManyToOne(cascade=CascadeType.ALL)

private Cart cart;

@ManyToOne(cascade=CascadeType.ALL)

private Customer customer;

@ManyToOne(cascade=CascadeType.ALL)

private BillingAddress billingAddress;

@ManyToOne(cascade=CascadeType.ALL)

private ShippingAddress shippingAddress;

public int getOrderId() {

	return orderId;

}

public void setOrderId(int orderId) {

	this.orderId = orderId;

}

public Date getPurchaseDate() {

	return purchaseDate;

}

public void setPurchaseDate(Date purchaseDate) {

	this.purchaseDate = purchaseDate;

}

public Cart getCart() {

	return cart;

}

public void setCart(Cart cart) {

	this.cart = cart;

}

public Customer getCustomer() {

	return customer;

}

public void setCustomer(Customer customer) {

	this.customer = customer;

}

public BillingAddress getBillingAddress() {

	return billingAddress;

}

public void setBillingAddress(BillingAddress billingAddress) {

	this.billingAddress = billingAddress;

}

public ShippingAddress getShippingAddress() {

	return shippingAddress;

}

public void setShippingAddress(ShippingAddress shippingAddress) {

	this.shippingAddress = shippingAddress;

}
}
