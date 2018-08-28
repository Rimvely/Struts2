package com.test2;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

//Model Driven ��� //ModelDriven�� get set���� ���� �ְ� ���� Preparable�� ��ü ������ ����
public class TestAction extends ActionSupport implements ModelDriven<User>, Preparable {

	private static final long serialVersionUID = 1L;
	
	private User dto;
	
	//getter��������� set�� �˾Ƽ� ����
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
	
	//(excute��) �޼ҵ� ������ ������� 
	public String created() throws Exception {
		
		
		if(dto==null||dto.getMode()==null||dto.getMode().equals("")){//�����ٲ��ȵ�
			return INPUT;
		}
		
		//request�� ������ �������Ѵ�
		HttpServletRequest request = ServletActionContext.getRequest();//getResponse if you need
		
		request.setAttribute("message", "��Ʈ����2!");
		//request.setAttribute("dto", dto); �̰Ŵ�� - (User getModel() return dto;)
		
		return SUCCESS;
		
		
	}
	



	
	
	
}
