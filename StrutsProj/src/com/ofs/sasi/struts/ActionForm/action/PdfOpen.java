package com.ofs.sasi.struts.ActionForm.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 



import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
 


public class PdfOpen extends Action{

	public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
     
    Document document = new Document();
    try{
        response.setContentType("application/pdf");
        PdfWriter.getInstance(document, response.getOutputStream());
        document.open();
        document.add(new Paragraph("Hello Kiran"));
        document.add(new Paragraph(new Date().toString()));
    }catch(Exception e){
        e.printStackTrace();
    }
    document.close();
    return null;
 
    }
}
