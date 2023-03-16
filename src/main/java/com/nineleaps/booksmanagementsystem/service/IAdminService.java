package com.nineleaps.booksmanagementsystem.service;

import java.util.List;

import com.nineleaps.booksmanagementsystem.entity.Admin;



public interface IAdminService{
	public List<Admin> getAllAdmins();
	public Admin getAdminById(Long adminId);
	public void deleteAdmin(Long adminId);
	public Admin insertAdmin(Admin newAdmin);
	public String updateAdmin(Long adminId,Admin updatedAdmin);
	public Admin findByAdminUserName(String adminUserName);
}
