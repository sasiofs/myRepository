package com.ofs.sasi.struts.LoginForm.form;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

@SuppressWarnings("serial")
public class WithdrawlForm extends ActionForm{

	public static DepositeForm depositeForm;
	
	private int withdrawl;
	private String accnt_no;
	
	public String getAccnt_no() {
		return accnt_no;
	}
	public void setAccnt_no(String accnt_no) {
		this.accnt_no = accnt_no;
	}
	public int getWithdrawl() {
		return withdrawl;
	}
    public void setWithdrawl(int withdrawl) {
		this.withdrawl = withdrawl;
	}
    

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request){
	 
		 ActionErrors errors = new ActionErrors();
		 if(withdrawl == 0){
			 errors.add("withdrawl", new ActionMessage("error.withdrawl.required"));
		 }
		 
		 if(accnt_no == null || accnt_no.trim().equals("")){
			 errors.add("accnt_no", new ActionMessage("error.accnt_no.required"));
		 }
		 return errors;
	  }

	 
}
