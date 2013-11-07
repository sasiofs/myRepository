package com.ofs.struts.helloworld.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class LoginTale {

	public static void main(String[] args) {
		System.out.println("Table Creation Example!");
		Connection con = null;
		String url = "jdbc:mysql://192.168.4.66:3306/";
		String dbName = "javafresherbatch2";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "isteer-dialog"; 
		String password = "d14l06";
		try{
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(url+dbName, userName, password);
			try{
				java.sql.Statement st = con.createStatement();
				String table = "CREATE TABLE Login(userName varchar(10),password varchar(10))";
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
