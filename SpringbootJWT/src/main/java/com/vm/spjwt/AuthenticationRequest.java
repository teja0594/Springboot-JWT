package com.vm.spjwt;

/**
 * this class will generate a jwt and return jwt in response
 * @author Admin
 *
 */
public class AuthenticationRequest {
	
	private String userName;
	private String password;
	public String getUserName() {
		return userName;
	}
	
	
	
	public AuthenticationRequest(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}