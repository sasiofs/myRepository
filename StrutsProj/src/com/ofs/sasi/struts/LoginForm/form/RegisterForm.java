package com.ofs.sasi.struts.LoginForm.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
//import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import org.apache.struts.validator.ValidatorForm;

@SuppressWarnings("serial")
public class RegisterForm extends ValidatorForm
{
	private String name;
	private String username;
	private String password;
	private String cpassword;
	private String email;
	private String dob;
	private String mobile;
	private String address;
	private String gender;
	private boolean valid;
	
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
	{
	 ActionErrors errors = new ActionErrors();
	
	 /*if (getName().length() == 0) {
	 errors.add("userName", new ActionMessage("error.Name.required"));
	 }*/
	 
	 if (name == null || name.trim().equals("")) {
	 errors.add("name", new ActionMessage("error.name.required"));
	 }
	 
	 if (username == null || username.trim().equals("")) {
	 errors.add("username", new ActionMessage("error.username.required"));
	 }

	 if (password == null || password.trim().equals("")) {
     errors.add("password", new ActionMessage("error.password.required"));
	 }
	 
	 if (cpassword == null || cpassword.trim().equals("")) {
	 errors.add("cpassword", new ActionMessage("error.cpassword.required"));
	 }
	 
	 if (email == null || email.trim().equals("")) {
	 errors.add("email", new ActionMessage("error.email.required"));
	 }
	 
	 if (dob == null || dob.trim().equals("")) {
	 errors.add("dob", new ActionMessage("error.dob.required"));
	 }
	 
	 if (mobile == null || mobile.trim().equals("")) {
	 errors.add("mobile", new ActionMessage("error.mobile.required"));
	 }
	 
	 if (address == null || address.trim().equals("")) {
	 errors.add("address", new ActionMessage("error.address.required"));
	 }
	 
	 if (gender == null || gender.trim().equals("")) {
	 errors.add("gender", new ActionMessage("error.gender.required"));
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
public String getCpassword() {
	return cpassword;
}
public void setCpassword(String cpassword) {
	this.cpassword = cpassword;
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

public boolean isValid() {
	return valid;
}

public void setValid(boolean valid) {
	this.valid = valid;
}

public void reset(ActionMapping mapping, HttpServletRequest request) {
    this.name = null;
    this.username = null;
    this.password = null;
    this.cpassword = null;
    this.email = null;
    this.dob = null;
    this.mobile = null;
    this.address = null;
    this.gender = null;
    super.reset(mapping, request);
}
}
