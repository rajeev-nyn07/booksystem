package com.nineleaps.booksmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nineleaps.booksmanagementsystem.entity.Order;
import com.nineleaps.booksmanagementsystem.repository.OrderRepository;

@Service
public class OrderServiceImpl implements IOrderService{
 
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public List<Order> getAllOrder() {
		return orderRepository.findAll();
	}

	@Override
	public Order getOrderById(Long orderId) {
		return orderRepository.findById(orderId).get();
	}

	

	@Override
	public Order insertOrder(Order newOrder) {
		// TODO Auto-generated method stub
		return orderRepository.save(newOrder);
	}
}
