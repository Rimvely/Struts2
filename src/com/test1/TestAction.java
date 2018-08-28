package com.test1;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private User user; //호출하기
	private String message;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getMessage() {
		return message;
	}
	
	public String execute() throws Exception {
		
		message = user.getUserName() + "님 방가방가!";
		
		return "ok";
	}
	
	
}
