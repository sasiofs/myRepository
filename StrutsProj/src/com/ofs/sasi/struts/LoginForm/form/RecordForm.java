package com.ofs.sasi.struts.LoginForm.form;


import java.util.List;

import org.apache.struts.action.ActionForm;

@SuppressWarnings("serial")
public class RecordForm extends ActionForm{
	
	private int userid;
	private String username;
	private String accntno;
	private int balance;
	private String name;
	private  boolean valid;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	private List<RecordForm> list;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAccntno() {
		return accntno;
	}
	public void setAccntno(String accntno) {
		this.accntno = accntno;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public List<RecordForm> getList() {
		return list;
	}
	public void setList(List<RecordForm> list) {
		this.list = list;
	}
	
	

}
