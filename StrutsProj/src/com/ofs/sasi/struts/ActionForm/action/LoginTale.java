package com.ofs.sasi.struts.ActionForm.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class LoginTale {

	public static void main(String[] args) {
		System.out.println("Table Creation Example!");
		Connection con = null;
		String url = "jdbc:oracle:thin:@//192.168.8.166 :1521/";
		String dbName = "orcl";
		String driver = "oracle.jdbc.OracleDriver";
		String userName = "training"; 
		String password = "training";
		try{
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(url+dbName, userName, password);
			try{
				java.sql.Statement st = con.createStatement();
				String table = "CREATE TABLE Customer_Profile(Name varchar(15),UName varchar(15),"
						+ "PWord varchar(15),CPWord varchar(15),Email varchar(25),"
						+ "Dob varchar(10),Mobile varchar(15),Address varchar(20),"
						+ "Gender varchar(10))";
				st.executeUpdate(table);
				System.out.println("Table creation process successfully!");
			}
			catch(SQLException s){
				System.out.println("Table all ready exists!");
			}catch(Exception s){
				System.out.println("Table all ready exists!");
			}
			
			con.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	
}
