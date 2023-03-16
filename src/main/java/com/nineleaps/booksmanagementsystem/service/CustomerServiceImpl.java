package com.nineleaps.booksmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nineleaps.booksmanagementsystem.entity.Customer;
import com.nineleaps.booksmanagementsystem.repository.CustomerRepository;
	
	@Service
	public class CustomerServiceImpl implements ICustomerService {

		@Autowired
		private CustomerRepository customerRepository;
		
		@Override
		public List<Customer> getAllCustomer() {
			
			return customerRepository.findAll();
		}

		@Override
		public Customer getCustomerById(Long customerId) {
			return customerRepository.findById(customerId).get();
		}

		@Override
		public void deleteCustomer(Long customerId) {
			customerRepository.deleteById(customerId);
			
		}

		@Override
		public Customer insertCustomer(Customer newCustomer) {
			return customerRepository.save(newCustomer);
		}

		@Override
		public String updateCustomer(Long customerId, Customer updatedCustomer) {
			Customer customer=getCustomerById(customerId);
			if(customer!=null) {
				customer.setCustomerEmail(updatedCustomer.getCustomerEmail());
				customer.setCustomerName(updatedCustomer.getCustomerName());
				customer.setCustomerUserName(updatedCustomer.getCustomerUserName());
				customer.setCustomerPassword(updatedCustomer.getCustomerPassword());
			}
			customerRepository.save(customer);
			return null;
		}

		@Override
		public Customer findByCustomerName(String customerUserName) {
			return customerRepository.findByCustomerName(customerUserName);
		}
		

		
		
		
		@Override
		public String findByAdminUserNameAndAdminPassword(String customerUserName, String customerPassword) {
			Customer customer=findByCustomerName(customerUserName);
			if(customer!=null) {
			 if(customer.getCustomerPassword().equals(customerPassword)) {
				return "Validated";
			}else
			return "Not Validated-password is wrong";
			}
			return "Not validated-user not found";
		}

		
	}



