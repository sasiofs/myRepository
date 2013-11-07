package com.ofs.sasi.struts.ActionForm.action;

import javax.servlet.http.*;

import org.apache.struts.action.*;

import com.ofs.sasi.struts.DBConnect.service.InsertValues1;
import com.ofs.sasi.struts.LoginForm.form.AdminLoginForm;


public class AdminLoginAction extends Action
{
	InsertValues1 insert_values = new InsertValues1();

public ActionForward execute(ActionMapping mapping,ActionForm af,HttpServletRequest req,HttpServletResponse res) throws Exception
{
  String target="";
  AdminLoginForm alf = (AdminLoginForm) af;
 // AdminForm rf=(AdminForm)af;
  //rf=insert_values.registerNewValues(rf);
  //if(rf.isValid()){
	  //status = "success";
  //}else
	  //status = "failure";
  
  if(alf.getUserName().equals("Sasi") && alf.getPassword().equals("Selva")){
	  target="success";
  }else{
	  target = "failure";
  }
  
  return mapping.findForward(target);
}
}

