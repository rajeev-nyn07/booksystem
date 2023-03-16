package com.nineleaps.booksmanagementsystem.service;

import java.util.List;

import com.nineleaps.booksmanagementsystem.entity.Order;

public interface IOrderService {
	public List<Order> getAllOrder();
	public Order getOrderById(Long orderId);
	public Order insertOrder(Order newOrder) ;

}
