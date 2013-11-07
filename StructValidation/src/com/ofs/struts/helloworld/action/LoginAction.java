package com.ofs.struts.helloworld.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


import com.ofs.struts.helloworld.form.LoginForm;


    public class LoginAction extends Action {
    	//private RegisterForm register_form1;
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String target = null;
		LoginForm loginForm = (LoginForm) form;
		


		if (loginForm.getUserName().equals("admin")
				&& loginForm.getPassword().equals("admin123")) {
			target = "success";
			request.setAttribute("message", loginForm.getPassword());
		} else {
			target = "failure";
		}

		HttpSession session = request.getSession();
        session.setAttribute("authentication", loginForm.getUserName());
        
		return mapping.findForward(target);
	}
	
	
}



