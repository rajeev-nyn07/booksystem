package com.nineleaps.booksmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nineleaps.booksmanagementsystem.entity.Order;
import com.nineleaps.booksmanagementsystem.service.IOrderService;



@RestController
public class OrderController {

	@Autowired
	private IOrderService orderSevices;
	
	@GetMapping("/getallorderdetails")
	public List<Order> getAllOrder(){
		return orderSevices.getAllOrder();
	}
	
	@GetMapping("/getorderbyid/{orderid}")
	public Order getOrderById(@PathVariable(name="orderid") Long orderId) {
		return orderSevices.getOrderById(orderId);
	}
	
	
	@PostMapping("/insertorder")
	public Order insertOrder(Order newOrder) {
		return orderSevices.insertOrder(newOrder);
		
	}
	
}