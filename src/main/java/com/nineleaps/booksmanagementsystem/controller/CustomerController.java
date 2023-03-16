package com.nineleaps.booksmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nineleaps.booksmanagementsystem.entity.Book;
import com.nineleaps.booksmanagementsystem.entity.Customer;
import com.nineleaps.booksmanagementsystem.service.IBookService;
import com.nineleaps.booksmanagementsystem.service.ICustomerService;


@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private ICustomerService customerServices;
	
	@Autowired
	private IBookService bookService;
	
//	@GetMapping("/getallcustomer")
//	public List<Customer> getAllCustomer(){
//		return customerServices.getAllCustomer();
//		
//	}
	@GetMapping("/getcustomerbyid/{custid}")
	public Customer getCustomerById(@PathVariable(name="custid") Long customerId) {
		return customerServices.getCustomerById(customerId);
		
	}
	@PostMapping("/insertcustomer")
	public Customer insertCustomer(@RequestBody Customer newCustomer) {
		return customerServices.insertCustomer(newCustomer);
		
	}
	
	@GetMapping("/getallbooks")
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	@GetMapping("findbybookname/{bookname}")
	//custom methods
	public Book findByBookName(@PathVariable(name="bookname")String bookName) {
		return bookService.findByBookName(bookName);
		
	}
	
	@GetMapping("/validate/{custname}/{custpassword}")
	public String findByAdminUserNameAndAdminPassword(String customerUserName, String customerPassword) {
		return customerServices.findByAdminUserNameAndAdminPassword(customerUserName, customerPassword);
	}
	
	
}
