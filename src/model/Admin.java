package model;

import java.io.Serializable;

public class Admin implements Serializable{
	private int adminId;
	private String adminName;
	private String adminPassword;
	
	public void setAdminId(int adminId) {
		this.adminId=adminId;
	}
	public int getAdminId() {
		return adminId;
	}
	
	public void setAdminName(String adminName) {
		this.adminName=adminName;
	}
	public String getAdminName() {
		return adminName;
	}
	
	public void setAdminPassword(String adminPassword) {
		this.adminPassword=adminPassword;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	
}
