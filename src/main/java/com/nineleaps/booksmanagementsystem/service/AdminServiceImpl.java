package com.nineleaps.booksmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nineleaps.booksmanagementsystem.entity.Admin;
import com.nineleaps.booksmanagementsystem.repository.AdminRepository;
@Service
public class AdminServiceImpl implements IAdminService {

	@Autowired
	private AdminRepository adminRepository;
	@Override
	public List<Admin> getAllAdmins() {
		return adminRepository.findAll();
	}

	@Override
	public Admin getAdminById(Long adminId) {
		return adminRepository.findById(adminId).get();
	}

	@Override
	public void deleteAdmin(Long adminId) {
		adminRepository.deleteById(adminId);
	}

	@Override
	public Admin insertAdmin(Admin newAdmin) {
		return adminRepository.save(newAdmin);
	}

	@Override
	public String updateAdmin(Long adminId, Admin updatedAdmin) {
		Admin admin=getAdminById(adminId);
		if(admin!=null) {
			admin.setAdminUserName(updatedAdmin.getAdminUserName());
			admin.setAdminPassword(updatedAdmin.getAdminPassword());
			adminRepository.save(admin);
			return "Updated!";
		}
		else {
			return "No admin with this id present";
		}
		
	}

	@Override
	public Admin findByAdminUserName(String adminUserName) {
		return adminRepository.findByAdminUserName(adminUserName);
	}
	

}
