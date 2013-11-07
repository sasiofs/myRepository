package com.ofs.sasi.struts.DBConnect.service;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ofs.sasi.struts.DBConnect.connect.DBConnect;
import com.ofs.sasi.struts.LoginForm.form.AdminForm;


public class InsertValues1 {

	private DBConnect dbcon;
	private Connection con;
	private PreparedStatement pst;
	private AdminForm admin_form;
	
	
	
	@SuppressWarnings("static-access")
	public AdminForm registerValues(AdminForm admin) throws Exception{
		admin_form = admin;
		dbcon = DBConnect.getInstance();
		con = dbcon.connection();
		System.out.println("Hi");	
		
	    	try {
    			pst = con.prepareStatement("INSERT INTO Customer_Details VALUES(?,?,?,?)");
    			pst.setInt(1, admin_form.getUserid());
    			pst.setString(2, admin_form.getUsername());
    			pst.setString(3, admin_form.getAccntno());
    			pst.setInt(4, admin_form.getBalance());
    			

    			pst.executeUpdate();
    			admin_form.setValid(true);
    		    } catch (Exception e) {
    			admin_form.setValid(false);
    			System.out.println(e);
  	    		}
    	return admin_form;
	}
}
