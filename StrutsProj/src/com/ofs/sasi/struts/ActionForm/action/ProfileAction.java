package com.ofs.sasi.struts.ActionForm.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.ofs.sasi.struts.DBConnect.connect.DBConnect;
import com.ofs.sasi.struts.LoginForm.form.ProfileForm;
import com.ofs.sasi.struts.LoginForm.form.RegisterForm;


    public class ProfileAction extends Action {
    	
		private DBConnect dbcon;
    	private Connection con;
    	private PreparedStatement pst;
    	private ResultSet rs;
    	public ProfileForm proform;
   	
	@SuppressWarnings("static-access")
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String target = null;
		//LoginForm loginForm = (LoginForm) form;
		RegisterForm regform = (RegisterForm) form;
		//proform =  (ProfileForm) form;
		dbcon = DBConnect.getInstance();
		con = dbcon.connection();
		try{ 
			System.out.println("sasi");
			pst = con.prepareStatement("SELECT NAME,UNAME,EMAIL,DOB,MOBILE,ADDRESS,GENDER FROM "
					+ "CUSTOMER_PROFILE WHERE PWORD=?");
			pst.setString(1, proform.getPassword());
			rs = pst.executeQuery();
			if (rs.next()) {
				//loginForm.setUserName(rs.getString("UNAME"));
				proform.setName(rs.getString("NAME"));
				proform.setUsername(rs.getString("UNAME"));
				proform.setEmail(rs.getString("EMAIL"));
				proform.setDob(rs.getString("DOB"));
				proform.setMobile(rs.getString("MOBILE"));
				proform.setAddress(rs.getString("ADDRESS"));
				proform.setGender(rs.getString("GENDER"));
				
				
				
				target="success";
				
				
			}else{
				target="failure";
			}
			HttpSession session = request.getSession();
			session.setAttribute("message1", proform.getName());
			session.setAttribute("message2", proform.getUsername());
			session.setAttribute("message3", proform.getEmail());
			session.setAttribute("message4", proform.getDob());
			session.setAttribute("message5", proform.getMobile());
			session.setAttribute("message6", proform.getAddress());
		} catch(Exception e){
		/*System.out.println();*/
			e.printStackTrace();
		}
		//return loginForm;
		return mapping.findForward(target);
	}
	
	
}



