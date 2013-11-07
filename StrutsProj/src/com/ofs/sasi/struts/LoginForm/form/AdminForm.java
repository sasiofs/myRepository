package com.ofs.sasi.struts.LoginForm.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
//import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.validator.ValidatorForm;

@SuppressWarnings("serial")
public class AdminForm extends ValidatorForm{

	private int userid;
	private String username;
	private String accntno;
	private int balance;
	private boolean valid;
	
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)	{
	 
		ActionErrors errors = new ActionErrors();
		if (userid == 0) {
			 errors.add("userid", new ActionMessage("error.userid.required"));
		}
		if (username == null || username.trim().equals("")) {
		errors.add("username", new ActionMessage("error.username.required"));
		}
		if (accntno== null || accntno.trim().equals("")) {
		errors.add("accntno", new ActionMessage("error.accntno.required"));
		}
		if (balance == 0) {
		errors.add("balance", new ActionMessage("error.balance.required"));
		}
		
		
		return errors;
	}
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
}
