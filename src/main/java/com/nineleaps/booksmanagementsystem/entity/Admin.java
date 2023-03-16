package com.nineleaps.booksmanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="adminnfo")
public class Admin {

	@Id
	@Column(name="adminid")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long adminId;
	@Column(name="adminusername",nullable = false)
	private String adminUserName;
	@Column(name="adminpassword",nullable = false)
	private String adminPassword;
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	public Long getAdminId() {
		return adminId;
	}
	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}
	public String getAdminUserName() {
		return adminUserName;
	}
	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public Admin(Long adminId, String adminUserName, String adminPassword) {
		super();
		this.adminId = adminId;
		this.adminUserName = adminUserName;
		this.adminPassword = adminPassword;
	}
}

