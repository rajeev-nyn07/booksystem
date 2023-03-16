package com.nineleaps.booksmanagementsystem.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nineleaps.booksmanagementsystem.entity.Payment;
import com.nineleaps.booksmanagementsystem.service.IPaymentService;


@RestController
public class PaymentController {

	@Autowired
	private IPaymentService paymentservices;
	
	@GetMapping("/paymentstatus/{paymentid}")
	public String findByPaymentId(@PathVariable(name="paymentid") Long paymentId) {
		return paymentservices.findByPaymentId(paymentId);
		
	}
	@GetMapping("/getallpayments")
	public List<Payment> getAllPayment(){
		return paymentservices.getAllPayment();
	}
}