package com.nineleaps.booksmanagementsystem.service;

import java.util.List;

import com.nineleaps.booksmanagementsystem.entity.Customer;

public interface ICustomerService {
	public List<Customer> getAllCustomer();
	public Customer getCustomerById(Long customerId);
	public void deleteCustomer(Long customerId);
	public Customer insertCustomer(Customer newCustomer);
	public String updateCustomer(Long customerId,Customer updatedCustomer);
	public Customer findByCustomerName(String customerUserName);
	public String findByAdminUserNameAndAdminPassword(String customerUserName, String customerPassword) ;

}
