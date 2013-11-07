package com.ofs.sasi.struts.DBConnect.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.ofs.sasi.struts.DBConnect.connect.DBConnect;
import com.ofs.sasi.struts.LoginForm.form.RecordForm;

public class RecordValues {

	private DBConnect dbcon = null;
	private Connection con = null;
	private PreparedStatement pst = null;
	private ResultSet rs;

	ArrayList<RecordForm> RecordDetailsList = new ArrayList<RecordForm>();

	@SuppressWarnings("static-access")
	public RecordForm recordNewValues(RecordForm reform1) throws Exception {
		dbcon = DBConnect.getInstance();
		con = dbcon.connection();
		//RecordForm RecordObject = reform;

		try {
			//pst = con.prepareStatement("select * from customer_details");
			pst = con.prepareStatement("SELECT customer_profile.NAME,customer_details.USERID,"
					+ "customer_details.UNAME,customer_details.ACCNTNO,"
					+ "customer_details.BALANCE FROM customer_profile,customer_details "
					+ "WHERE customer_details.UNAME=customer_profile.UNAME");
			rs = pst.executeQuery();
			while (rs.next()) {
				RecordForm RecordObject1 = new RecordForm();
				RecordObject1.setUserid(rs.getInt("USERID"));
				RecordObject1.setUsername(rs.getString("UNAME"));
				RecordObject1.setAccntno(rs.getString("ACCNTNO"));
				RecordObject1.setBalance(rs.getInt("BALANCE"));
                RecordObject1.setName(rs.getString("NAME")); 
				
				RecordDetailsList.add(RecordObject1);

				//RecordObject1.setList(RecordDetailsList);

			}
			//RecordObject.setList(RecordDetailsList);
			reform1.setList(RecordDetailsList);
			//RecordObject.setValid(true);
			reform1.setValid(true);
		} catch (Exception e) {
			 reform1.setValid(false);
			//RecordObject.setValid(false);
			System.out.println(e);
		}
		return reform1;
	}

}
