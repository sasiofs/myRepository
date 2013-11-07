package com.ofs.sasi.struts.ActionForm.action;

import java.util.Date;

import javax.servlet.http.*;

import org.apache.struts.action.*;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import com.ofs.sasi.struts.DBConnect.service.InsertValues;
import com.ofs.sasi.struts.LoginForm.form.RegisterForm;

public class RegisterAction extends Action {
	InsertValues insert_values = new InsertValues();

	public ActionForward execute(ActionMapping mapping, ActionForm af,
			HttpServletRequest req, HttpServletResponse res) throws Exception {
		String status = "home";
		RegisterForm rf = (RegisterForm) af;
		Document document = new Document();
		try {

			res.setContentType("application/pdf");

			PdfWriter.getInstance(document, res.getOutputStream());
			document.open();
			
			document.add(new Paragraph("Name"));
			document.add(new Paragraph(rf.getName()));
			
			document.add(new Paragraph("User Name :"));
			document.add(new Paragraph( rf.getUsername()));
			
			document.add(new Paragraph("Password ;"));
			document.add(new Paragraph(rf.getPassword()));
			
			document.add(new Paragraph("Date of Birth :"));
			document.add(new Paragraph(rf.getDob()));
			
			document.add(new Paragraph("E-Mail :"));
			document.add(new Paragraph(rf.getEmail()));
			
			document.add(new Paragraph("Mobile :"));
			document.add(new Paragraph(rf.getMobile()));
			
			document.add(new Paragraph("Gender :"));
			document.add(new Paragraph(rf.getGender()));
						
			document.add(new Paragraph("Date You have created"));
			document.add(new Paragraph(new Date().toString()));

		} catch (Exception e) {
			e.printStackTrace();
		}
		document.close();

		
		rf = insert_values.registerNewValues(rf);
		if (rf.isValid()) {
			status = "home";
		} else
			status = "register";
		return mapping.findForward(status);
	}
}

