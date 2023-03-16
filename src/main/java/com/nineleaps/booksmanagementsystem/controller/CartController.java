package com.nineleaps.booksmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nineleaps.booksmanagementsystem.service.ICartService;


@RestController

public class CartController {
	
	@Autowired
	private ICartService cartServices;
	
	@GetMapping("/findcarttotal/{bookid}/{customerid}")
	public Long findByBook(@PathVariable(name="bookid")Long bookId,@PathVariable(name="customerid")Long customerId) {
		return cartServices.findByBookId(bookId,customerId);
		
	}
	
	
	
	
}