package com.nineleaps.booksmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nineleaps.booksmanagementsystem.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {

}
