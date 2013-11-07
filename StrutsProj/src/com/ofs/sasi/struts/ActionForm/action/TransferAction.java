package com.ofs.sasi.struts.ActionForm.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.ofs.sasi.struts.DBConnect.connect.DBConnect;
import com.ofs.sasi.struts.LoginForm.form.TransferForm;

public class TransferAction extends Action{
	
	
	private DBConnect dbcon;
	private Connection con;
	
	private PreparedStatement pst;
	int balance=0,balance1=0;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String target="";  
		dbcon = DBConnect.getInstance();
		con = dbcon.connection();
		TransferForm tform =(TransferForm) form; 
		
		
		try{
			
			pst=con.prepareStatement("select BALANCE from customer_details where ACCNTNO=?");
			pst.setString(1,tform.getAccntnofrom());
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
			balance = rs.getInt("BALANCE");
			balance = (balance - tform.getTransfer());
			pst= con.prepareStatement("UPDATE customer_details SET BALANCE=? where ACCNTNO="+tform.getAccntnofrom()+"");
			pst.setInt(1,balance);
			pst.executeUpdate();
			
			
			pst=con.prepareStatement("select BALANCE from customer_details where ACCNTNO=?");
			pst.setString(1,tform.getAccntnoto());
			ResultSet rs1 = pst.executeQuery();
			if(rs1.next()){
			balance1 = rs1.getInt("BALANCE");
			balance1 = (balance1 + tform.getTransfer());
			pst= con.prepareStatement("UPDATE customer_details SET BALANCE=? where ACCNTNO="+tform.getAccntnoto()+"");
			pst.setInt(1,balance1);
			pst.executeUpdate();
			}
			
			target = "success";
			
			}else{
				target="failure";
			}
		}catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
		}
		
		return mapping.findForward(target);
		
	}
}
