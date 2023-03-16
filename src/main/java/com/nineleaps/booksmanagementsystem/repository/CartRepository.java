package com.nineleaps.booksmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nineleaps.booksmanagementsystem.entity.Book;
import com.nineleaps.booksmanagementsystem.entity.Cart;
import com.nineleaps.booksmanagementsystem.entity.Customer;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
	public Book findByBook(Book book);
	public Customer findByCustomer_customerId(Long customerId);
}
