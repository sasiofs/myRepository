package com.ofs.sasi.struts.DBConnect.service;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ofs.sasi.struts.DBConnect.connect.DBConnect;
import com.ofs.sasi.struts.LoginForm.form.RegisterForm;

public class InsertValues {

	private DBConnect dbcon;
	private Connection con;
	private PreparedStatement pst;
	private RegisterForm register_form;
	
	
	
	@SuppressWarnings("static-access")
	public RegisterForm registerNewValues(RegisterForm register) throws Exception{
		register_form = register;
		dbcon = DBConnect.getInstance();
		con = dbcon.connection();
			
		
	    	try {
    			pst = con.prepareStatement("INSERT INTO Customer_Profile VALUES(?,?,?,?,?,?,?,?,?)");
    			pst.setString(1, register_form.getName());
    			pst.setString(2, register_form.getUsername());
    			pst.setString(3, register_form.getPassword());
    			pst.setString(4, register_form.getCpassword());
    			pst.setString(5, register_form.getEmail());
    			pst.setString(6, register_form.getDob());
    			pst.setString(7, register_form.getMobile());
    			pst.setString(8, register_form.getAddress());
    			pst.setString(9, register_form.getGender());

    			pst.executeUpdate();
    			register_form.setValid(true);
    		    } catch (Exception e) {
    			register_form.setValid(false);
    			System.out.println(e);
  	    		}
    	return register_form;
	}
}
