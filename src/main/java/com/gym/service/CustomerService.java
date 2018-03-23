package com.gym.service;

import com.gym.model.Customer;
import com.gym.model.User;

public interface CustomerService {
	public void registerCustomer(Customer customer);
	public boolean isEmailValid(String email);
	public boolean isUsernameValid(String username);
	public User getUser(String username);


}
