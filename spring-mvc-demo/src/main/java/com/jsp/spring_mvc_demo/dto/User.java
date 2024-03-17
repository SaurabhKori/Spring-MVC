package com.jsp.spring_mvc_demo.dto;

public class User {
	private String userName;
	private String userEmail;
	private String userPass;
	public User() {
		
	}
	public User(String userName, String userEmail, String userPass) {
		
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPass = userPass;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userEmail=" + userEmail + ", userPass=" + userPass + "]";
	}
	

}
