package com.ofs.sasi.struts.LoginForm.form;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

@SuppressWarnings("serial")
public class TransferForm extends ActionForm{

	public static TransferForm tform;
	
	private String accntnofrom;
	private String accntnoto;
	private int transfer;
	
	public String getAccntnofrom() {
		return accntnofrom;
	}
	public void setAccntnofrom(String accntnofrom) {
		this.accntnofrom = accntnofrom;
	}
    public String getAccntnoto() {
		return accntnoto;
	}
	public void setAccntnoto(String accntnoto) {
		this.accntnoto = accntnoto;
	}
	public int getTransfer() {
		return transfer;
	}
	public void setTransfer(int transfer) {
		this.transfer = transfer;
	}
 
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request){
	 
		 ActionErrors errors = new ActionErrors();
		 if(accntnofrom == null || accntnofrom.trim().equalsIgnoreCase("")){
			 errors.add("accntfrom", new ActionMessage("error.accntfrom.required"));
		 }
		 if(accntnoto == null || accntnoto.trim().equalsIgnoreCase("")){
			 errors.add("accntnoto", new ActionMessage("error.accntnoto.required"));
		 }
		 if(transfer == 0){
			 errors.add("transfer", new ActionMessage("error.transfer.required"));
		 }
		 return errors;
	  }

	 
}
