package com.ofs.sasi.struts.LoginForm.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class ProfileForm extends Action {

	private String name;
	private String password;
	private String username;
	private String email;
	private String dob;
	private String mobile;
	private String address;
	private String gender;
	
	public ActionErrors validate(ActionMapping mapping, ActionForm form, HttpServletRequest request){
		
		ActionErrors errors = new ActionErrors();
		RegisterForm regform = (RegisterForm) form;
		
		name = regform.getName();
		username = regform.getUsername();
		email = regform.getEmail();
		dob = regform.getDob();
		mobile = regform.getMobile();
		address = regform.getAddress();
		gender = regform.getGender();
		
		if (password == null || password.length() < 1) {
			errors.add("password", new ActionMessage("error.password.required"));
		}
		return errors;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
}
