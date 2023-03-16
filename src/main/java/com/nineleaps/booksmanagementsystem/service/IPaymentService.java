package com.nineleaps.booksmanagementsystem.service;

import java.util.List;

import com.nineleaps.booksmanagementsystem.entity.Payment;

public interface IPaymentService {
	

	public String findByPaymentId(Long paymentId);
	public Payment insertPayment(Payment newPayment) ;
	public List<Payment> getAllPayment();

}
