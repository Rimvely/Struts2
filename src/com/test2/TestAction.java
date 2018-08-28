package com.test2;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

//Model Driven 방식 //ModelDriven은 get set으로 값을 넣고 빼줌 Preparable은 객체 생성을 해줌
public class TestAction extends ActionSupport implements ModelDriven<User>, Preparable {

	private static final long serialVersionUID = 1L;
	
	private User dto;
	
	//getter만만들어줌 set은 알아서 해줌
	@Override
	public User getModel() {
		return dto;
	}

	public User getDto() {
		return dto;
	}
	
	@Override
	public void prepare() throws Exception {
		dto = new User();
	}
	
	//(excute를) 메소드 단위로 만들어줌 
	public String created() throws Exception {
		
		
		if(dto==null||dto.getMode()==null||dto.getMode().equals("")){//순서바뀌면안됨
			return INPUT;
		}
		
		//request가 없으니 만들어야한다
		HttpServletRequest request = ServletActionContext.getRequest();//getResponse if you need
		
		request.setAttribute("message", "스트럿츠2!");
		//request.setAttribute("dto", dto); 이거대신 - (User getModel() return dto;)
		
		return SUCCESS;
		
		
	}
	



	
	
	
}
