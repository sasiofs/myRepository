package com.ofs.sasi.struts.ActionForm.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.*;

import com.ofs.sasi.struts.DBConnect.service.InsertValues1;
import com.ofs.sasi.struts.LoginForm.form.AdminForm;


public class AdminAction extends Action{

	InsertValues1 insert_values1 = new InsertValues1();

	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest req,HttpServletResponse res) throws Exception
	{
	  String status="";
	  //String target="";
	  System.out.println("Hi");
	  AdminForm af=(AdminForm) form;
	  af=insert_values1.registerValues(af);
	  if(af.isValid()){
		  status = "home";
		  //target = "success";
	  }else{
		  status = "admin";
		  //target = "failure";
	  }	  
	  return mapping.findForward(status);
	  
	}
	
}
