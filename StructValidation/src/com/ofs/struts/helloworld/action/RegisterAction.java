package com.ofs.struts.helloworld.action;

import javax.servlet.http.*;

import org.apache.struts.action.*;

import com.ofs.struts.helloworld.form.RegisterForm;

public class RegisterAction extends Action
{

public ActionForward execute(ActionMapping mapping,ActionForm af,HttpServletRequest req,HttpServletResponse res) throws Exception
{
	String status="home";
  RegisterForm rf=(RegisterForm)af;
  
  System.out.println(rf.getName());
  System.out.println(rf.getUsername());
  System.out.println(rf.getPassword());
  System.out.println(rf.getCpassword());
  System.out.println(rf.getEmail());
  System.out.println(rf.getDob());
  System.out.println(rf.getMobile());
  System.out.println(rf.getAddress());
  System.out.println(rf.getGender());
 
  return mapping.findForward(status);
}
}

