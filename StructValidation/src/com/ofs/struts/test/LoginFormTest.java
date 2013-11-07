package com.ofs.struts.test;

import org.junit.Test;

import junit.framework.TestCase;

//import com.ofs.struts.helloworld.action.LoginAction;

import com.ofs.struts.helloworld.form.LoginForm;

public class LoginFormTest extends TestCase {

	@Test
	 public void test() {
	     String concatenated =LoginForm.con("admin","admin123");
	        assertEquals("admin,admin123",concatenated);
	 
	 }

}
