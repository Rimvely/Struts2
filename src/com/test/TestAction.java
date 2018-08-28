package com.test;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String userId;
	private String userName;
	private String message;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	//자동으로 실행되는 것
	public String execute() throws Exception {
		
		message = userName + "님 방가방가..";
		
		return SUCCESS; //이미 만들어져 있는 String type의 "success" 라는 단어 저장
		
	}
	
	
	
	
}
