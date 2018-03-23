package com.gym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gym.DAO.CustomerDAO;
import com.gym.model.Customer;
import com.gym.model.User;
@Repository
@Transactional
public class CustomerServiceImpl implements CustomerService {
	@Autowired
private CustomerDAO customerDAO;
	public void registerCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDAO.registerCustomer(customer);
		
	}

	public boolean isEmailValid(String email) {
		// TODO Auto-generated method stub
		return customerDAO.isEmailValid(email);
	}

	public boolean isUsernameValid(String username) {
		// TODO Auto-generated method stub
		return customerDAO.isUsernameValid(username);
	}

	public User getUser(String username) {
		// TODO Auto-generated method stub
		return customerDAO.getUser(username);
	}

}
