package com.ofs.sasi.struts.LoginForm.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


@SuppressWarnings("serial")
public class LoginForm extends ActionForm {

	private String userName;
	private String password;
	private boolean valid;
	private String name;

	
	public ActionErrors validate(ActionMapping mapping, ActionForm form,
			HttpServletRequest request) {

		ActionErrors errors = new ActionErrors();
		RegisterForm regform = (RegisterForm) form;
		
		name = regform.getName();

		if (userName == null || userName.length() < 1) {
			errors.add("userName", new ActionMessage("error.userName.required"));
		}

		if (password == null || password.length() < 1) {
			errors.add("password", new ActionMessage("error.password.required"));
		}

		return errors;
	}

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.userName = null;
		this.password = null;
		super.reset(mapping, request);
	}

	public String getUserName() {
		return userName;
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
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "LoginForm [ userName=" + userName + ", password= " + password
				+ "]";
	}

	public static String con(String name, String password) {

		StringBuilder builder = new StringBuilder();

		String nm = name;

		builder.append(nm);

		builder.append(",");

		String pwd = password;

		builder.append(pwd);

		return builder.toString();

	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		
		this.valid = valid;
	}

}
