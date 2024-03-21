package TestCases_Login;

import org.testng.annotations.Test;

import Utilities.BaseClass;

public class loginPage extends BaseClass {

	/*
	 * Login page automation
	 * 
	 */
	// Valid login details	
	@Test(priority = 1)	
		public static void login() throws InterruptedException {
			
			driver.get(Login_Pro.admin_url());
			Thread.sleep(3000);
			
			sendKeys(login_pagePOM.username, Login_Pro.admin_username());
			Thread.sleep(3000);
			
			sendKeys(login_pagePOM.password, Login_Pro.admin_password());
			Thread.sleep(3000);
			
			click(login_pagePOM.loginbutton);
			Thread.sleep(5000);
			
			//System.err.println(Login_Pro.output());
			
//			click(login_pagePOM.profilename);
//			Thread.sleep(5000);
			
//			click(login_pagePOM.logout);
//			Thread.sleep(5000);
		} //login
	
	// Invalid username and password
	@Test(priority = 2)	
	public static void loginInvalid() throws InterruptedException {
		
		driver.get("http://52.8.28.154:83/account/login");
		Thread.sleep(3000);
		
		sendKeys(login_pagePOM.username, "admin11@roboxa.com");
		Thread.sleep(3000);
		
		sendKeys(login_pagePOM.password, "admin11");
		Thread.sleep(3000);
		
		click(login_pagePOM.loginbutton);
	} // loginInvalid
	
	//Invalid Username and valid password
	@Test(priority = 3)	
	public static void loginInvalidusername() throws InterruptedException {
		Thread.sleep(3000);
		
		clear(login_pagePOM.username);
		sendKeys(login_pagePOM.username, "admin12@roboxa.com");
		Thread.sleep(3000);
		
		clear(login_pagePOM.password);
		sendKeys(login_pagePOM.password, "admin");
		Thread.sleep(3000);
		
		click(login_pagePOM.loginbutton);
	} //loginInvalidusername
	
	@Test(priority = 4)	
	public static void loginempty() throws InterruptedException {
		Thread.sleep(3000);
		
		clear(login_pagePOM.username);
		sendKeys(login_pagePOM.username, "");
		Thread.sleep(3000);
		
		clear(login_pagePOM.password);
		sendKeys(login_pagePOM.password, "");
		Thread.sleep(3000);
		
		click(login_pagePOM.loginbutton);
	} //loginempty

	
	@Test(priority = 5)	
	public static void logout() throws InterruptedException {
		
		click(login_pagePOM.profilename);
		Thread.sleep(5000);
		
		click(login_pagePOM.logout);
		Thread.sleep(5000);
	} //loginempty
} //loginPage



//@Test(priority = 3)
//	public static void forgot() throws InterruptedException {
//	Thread.sleep(5000);
//		click(login_pagePOM.profilename);
//		Thread.sleep(5000);
//		click(login_pagePOM.logout);
//		Thread.sleep(5000);
//		
//		click(login_pagePOM.forgotpassword);
//	}

