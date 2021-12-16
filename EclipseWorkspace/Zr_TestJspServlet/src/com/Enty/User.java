package com.Enty;

public class User {
	private String UserName;
	private String Password;

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public User(String userName, String password) {
		super();
		UserName = userName;
		Password = password;
	}

	public User(String userName) {
		super();
		UserName = userName;

	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
