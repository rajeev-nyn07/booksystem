package com.nineleaps.booksmanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customerinfo")
public class Customer {
	@Id
	@Column(name="customerid")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long customerId;
	@Column(name="customername",nullable = false)
	private String customerName;
	@Column(name="customeremail",nullable = false)
	private String customerEmail;
	@Column(name="customerusername",nullable = false)
	private String customerUserName;
	@Column(name="customerpassword",nullable = false)
	private String customerPassword;
	@Column(name="customerwallet",nullable = false)
	private Long customerWallet;
	
	public Customer(Long customerId, String customerName,
			
			String customerUserName,
			Long customerWallet) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerUserName = customerUserName;
		this.customerPassword = customerPassword;
		this.customerWallet = customerWallet;
	}

	public Long getCustomerWallet() {
		return customerWallet;
	}

	public void setCustomerWallet(Long customerWallet) {
		this.customerWallet = customerWallet;
	}

	public Customer(Long customerId, String customerName,
			 String customerEmail, String customerUserName, String customerPassword) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerUserName = customerUserName;
		this.customerPassword = customerPassword;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerUserName() {
		return customerUserName;
	}

	public void setCustomerUserName(String customerUserName) {
		this.customerUserName = customerUserName;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
}
