package com.nineleaps.booksmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nineleaps.booksmanagementsystem.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

	public Payment findByPaymentId(Long paymentId);
}