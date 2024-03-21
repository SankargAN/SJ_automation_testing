package TestCase_crologinpage;

import org.testng.annotations.Test;

import Properties.crologin_properties;
import Utilities.BaseClass;

public class crologin_page extends BaseClass {

	@Test
	public static void crologin_detail_data () throws Exception {
		
		//crologin_pagePOM.webelementPOM,
		sendKeys(New_loginPage_PRO.cro_login_username, main_loginPageCRO_Pro.crol_url());
		Thread.sleep(3000);
		
		sendKeys(New_loginPage_PRO.cro_login_password, main_loginPageCRO_Pro.crol_password());
		Thread.sleep(3000);
		
		click(New_loginPage_PRO.cro_login_btn);
		Thread.sleep(3000);


	}

}
