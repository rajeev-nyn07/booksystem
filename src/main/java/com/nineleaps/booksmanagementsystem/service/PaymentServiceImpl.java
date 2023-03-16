package com.nineleaps.booksmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nineleaps.booksmanagementsystem.entity.Payment;
import com.nineleaps.booksmanagementsystem.repository.OrderRepository;
import com.nineleaps.booksmanagementsystem.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements IPaymentService {

	@Autowired
	private PaymentRepository paymentRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private IBookService iBookServices;
	
	public Payment insertPayment(Payment newPayment) {
		return paymentRepository.save(newPayment);
	}
	@Override
	public String findByPaymentId(Long paymentId) {
		
		String paymentResult= paymentRepository.findByPaymentId(paymentId).getPaymentStatus();
		if(paymentResult.equals("success")) {
			
			return "check order status";
		}
		else {
			iBookServices.getAllBooks();
			return "Payment failed. Try again !!!";
		}
		
	}
	@Override
	public List<Payment> getAllPayment() {
		// TODO Auto-generated method stub
		return paymentRepository.findAll();
	}

}

