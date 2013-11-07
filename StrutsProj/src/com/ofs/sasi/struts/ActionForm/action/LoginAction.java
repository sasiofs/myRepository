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
import com.ofs.sasi.struts.LoginForm.form.LoginForm;


    public class LoginAction extends Action {
    	
		private DBConnect dbcon;
    	private Connection con;
    	private PreparedStatement pst;
    	private ResultSet rs;
 
   	
	@SuppressWarnings("static-access")
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String target = null;
		LoginForm loginForm = (LoginForm) form;
		dbcon = DBConnect.getInstance();
		con = dbcon.connection();
		try{ 
			pst = con.prepareStatement("SELECT NAME FROM CUSTOMER_PROFILE WHERE UNAME=? AND PWORD=?");
			pst.setString(1, loginForm.getUserName());
			pst.setString(2, loginForm.getPassword());
			rs = pst.executeQuery();
			if (rs.next()) {
				//loginForm.setUserName(rs.getString("UNAME"));
				loginForm.setName(rs.getString("NAME"));
				target="success";
				
			}else{
				target="failure";
			}
			
				
			
			
        //Statement stmt = (Statement) con.createStatement();
        //Query = "SELECT UNAME, PWORD FROM CUSTOMER_PROFILE;";
        //stmt.executeQuery("SELECT UNAME, PWORD FROM CUSTOMER_PROFILE;");
        //ResultSet rs = stmt.getResultSet();
        //while(rs.next()){
        	//U_Name = rs.getString("UNAME");
        	//P_Word = rs.getString("PWORD");
			
        
		//if (loginForm.getUserName().equals(U_Name)
			//	&& loginForm.getPassword().equals(P_Word)) {
			//target = "success";
			//request.setAttribute("message", loginForm.getPassword());
		//} else {
			//target = "failure";
		//}
	    //}//end-while
		HttpSession session = request.getSession();
        //session.setAttribute("message", loginForm.getUserName());
		session.setAttribute("message", loginForm.getName());
		
		} catch(Exception e){
		/*System.out.println();*/
			e.printStackTrace();
		}
		//return loginForm;
		return mapping.findForward(target);
	}
	
	
}



