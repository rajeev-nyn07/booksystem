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

import com.nineleaps.booksmanagementsystem.entity.Admin;
import com.nineleaps.booksmanagementsystem.entity.Book;
import com.nineleaps.booksmanagementsystem.entity.Customer;
import com.nineleaps.booksmanagementsystem.service.IAdminService;
import com.nineleaps.booksmanagementsystem.service.IBookService;
import com.nineleaps.booksmanagementsystem.service.ICustomerService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private IAdminService adminServices;
	
	@Autowired
	private IBookService bookService;
	
	@Autowired
	private ICustomerService customerServices;
	
	@GetMapping("/getalladmins")
	public List<Admin> getAllAdmins(){
		return adminServices.getAllAdmins();
		
	}
	
	@GetMapping("/getadminbyid/{admin_id}")
	public Admin getAdminById(@PathVariable(name="admin_id") Long adminId) {
		return adminServices.getAdminById(adminId);
		
	}
	
	@DeleteMapping("/deleteadmin/{adminid}")
	public void deleteAdmin(@PathVariable(name="adminid") Long adminId) {
		adminServices.deleteAdmin(adminId);
	}
	
	@PostMapping("/insertadmin")
	public Admin insertAdmin(@RequestBody Admin newAdmin) {
		return adminServices.insertAdmin(newAdmin);
	}
	
	@PatchMapping("/updateadmin/{adminid}")
	public String updateAdmin(@PathVariable(name="adminid")Long adminId,@RequestBody Admin updatedAdmin) {
		return adminServices.updateAdmin(adminId, updatedAdmin);
	}
	
	
	
	@GetMapping("/getbookbyid/{bookid}")
	public Book getBookById(@PathVariable(name="bookid") Long bookId) {
		return bookService.getBookById(bookId);
	}
	

	@DeleteMapping("/deletebookbyid/{bookid}")
	public void deleteBook(@PathVariable(name="bookid")Long bookId) {
		bookService.deleteBook(bookId);
	}
	
	@PostMapping("/insertbooks")
	public Book insertBook(@RequestBody Book newBook) {
		return bookService.insertBook(newBook);
		
	}
	
	@PatchMapping("/updatebooks/{bookid}")
	public Book updateBook(@PathVariable(name="bookid")Long bookId,@RequestBody Book updatedBook) {
		return bookService.updateBook(bookId, updatedBook);
		
	}
	
	@GetMapping("/getcustomerbyid/{custid}")
	public Customer getCustomerById(@PathVariable(name="custid") Long customerId) {
		return customerServices.getCustomerById(customerId);
		
	}
	@DeleteMapping("/deletecustomer/{custid}")
	public void deleteCustomer(@PathVariable(name="custid")Long customerId) {
		customerServices.deleteCustomer(customerId);
	}
	
	@GetMapping("/getallcustomer")
	public List<Customer> getAllCustomer(){
		return customerServices.getAllCustomer();
		
	}
	
	@PatchMapping("/updatecustomer/{custid}")
	public String updateCustomer(@PathVariable(name="custid")Long customerId,@RequestBody Customer updatedCustomer) {
		return customerServices.updateCustomer(customerId, updatedCustomer);
		
	}
	

		@GetMapping("/findbycustomername/{custname}")
		public Customer findByCustomerName(@PathVariable(name="custname")String customerUserName) {
			return customerServices.findByCustomerName(customerUserName);
			
		}
}
