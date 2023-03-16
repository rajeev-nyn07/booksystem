package com.nineleaps.booksmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nineleaps.booksmanagementsystem.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long>{
	public Admin findByAdminUserName(String adminUserName);
	}
