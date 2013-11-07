package com.ofs.sasi.struts.ActionForm.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.ofs.sasi.struts.DBConnect.service.RecordValues;
import com.ofs.sasi.struts.LoginForm.form.RecordForm;

public class RecordAction extends Action{
		
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String target="";
		RecordValues r_values = new RecordValues();
		//RecordForm reform =(RecordForm) form;
		RecordForm RecordObject = (RecordForm) form;
		RecordObject = r_values.recordNewValues(RecordObject);
		//reform = r_values.recordNewValues(reform);
		
		
		if(RecordObject.isValid()){
			HttpSession session = request.getSession(true);
	        session.setAttribute("AccntDetails",RecordObject.getList());
			target = "success";
		}else{
			target = "failure";
		}
		return mapping.findForward(target);
		
	}
}
