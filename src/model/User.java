package model;

import java.io.*;

public class User implements Serializable{
	private int userId;
	private String userName;
	private String userPassword;
	
	private void setUserId(int userId) {
		this.userId=userId;
	}
	private int getUserId() {
		return userId;
	}
	
	private void setUserName(String userName) {
		this.userName=userName;
	}
	private String getUserName() {
		return userName;
	}
	
	private void setUserPassword(String userPassword) {
		this.userPassword=userPassword;
	}
	private String getUserPassword() {
		return userPassword;
	}
}
