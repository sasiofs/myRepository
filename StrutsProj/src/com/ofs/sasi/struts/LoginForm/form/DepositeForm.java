package com.ofs.sasi.struts.LoginForm.form;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

@SuppressWarnings("serial")
public class DepositeForm extends ActionForm{

	public static DepositeForm depositeForm;
	
	private int deposit;
	private String accnt_no;
	
	
	public String getAccnt_no() {
		return accnt_no;
	}

	public void setAccnt_no(String accnt_no) {
		this.accnt_no = accnt_no;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}



	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request){
	 
		 ActionErrors errors = new ActionErrors();
		 if(deposit == 0){
			 errors.add("deposit", new ActionMessage("error.deposit.required"));
		 }
		 
		 if(accnt_no == null || accnt_no.trim().equals("")){
			 errors.add("accnt_no", new ActionMessage("error.accnt_no.required"));
		 }
		 return errors;
	  }

	 
}
