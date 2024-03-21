package TestCases_Landingpage;

import org.testng.annotations.Test;

import Properties.patient_addrow_properties;
import Utilities.BaseClass;

public class addrow extends BaseClass{

	
	/**
	 * Adding proper data
	 * @throws Exception
	 */
	@Test (priority = 1)
	public static void addrow_valid_data () throws Exception {
		
    click(landing_pagePOM.patient_admin_addrow);
	Thread.sleep(5000);
	
	sendKeys(landing_pagePOM.patient_admin_crocode, PatientAddrow_Pro.patient_code());

	Thread.sleep(5000);
	
	sendKeys(landing_pagePOM.patient_admin_croname, PatientAddrow_Pro.patient_name());
	Thread.sleep(5000);
	
	sendKeys(landing_pagePOM.patient_admin_phone, PatientAddrow_Pro.patient_phone());
	Thread.sleep(5000);
	
	sendKeys(landing_pagePOM.patient_admin_email, PatientAddrow_Pro.patient_email());
	Thread.sleep(5000);
	
	sendKeys(landing_pagePOM.patient_admin_add1, PatientAddrow_Pro.Patient_add1());
	Thread.sleep(5000);
	
	sendKeys(landing_pagePOM.patient_admin_add2, PatientAddrow_Pro.Patient_add2());
	Thread.sleep(5000);
	
	sendKeys(landing_pagePOM.patient_admin_add3, PatientAddrow_Pro.Patient_add3());
	Thread.sleep(5000);
	
	sendKeys(landing_pagePOM.patient_admin_add4, "");
	Thread.sleep(5000);
	
	selectbytext(landing_pagePOM.patient_admin_country_dropdown, PatientAddrow_Pro.Patient_Contry());
	Thread.sleep(5000);
	
	selectbytext(landing_pagePOM.patient_admin_state_dropdown,PatientAddrow_Pro.Patient_State());
	Thread.sleep(5000);
	
	selectbytext(landing_pagePOM.patient_admin_city_dropdown, PatientAddrow_Pro.Patient_City());
	Thread.sleep(5000);
	
	sendKeys(landing_pagePOM.patient_admin_dis, "");
	Thread.sleep(5000);
	
	sendKeys(landing_pagePOM.patient_admin_pincode, PatientAddrow_Pro.Patient_Pincode());
	Thread.sleep(5000);
	
	click(landing_pagePOM.patient_admin_savebutton);
	Thread.sleep(5000);
	}
	
	@Test (priority = 2)
	public static void landingpage_view() throws Exception {
		click(landing_pagePOM.patient_admin_view_button);
		Thread.sleep(5000);
		
		click(landing_pagePOM.lp_view_btn);
		Thread.sleep(5000);
	}
	
	@Test (priority = 3)
	
	public static void lp_edit() throws InterruptedException {
		
		click(landing_pagePOM.lp_edit_btn);
		Thread.sleep(3000);
		
		
		clear(landing_pagePOM.patient_admin_croname);
		sendKeys(landing_pagePOM.patient_admin_croname, PatientAddrow_Pro.Patient_edit_name());
		Thread.sleep(3000);
		
		click(landing_pagePOM.lp_edit_save);
		Thread.sleep(3000);
	}
	
	@Test (priority = 4)
	public static void lp_actdev_btn() throws InterruptedException{
		
		click(landing_pagePOM.lp_act_dec_btn);
		Thread.sleep(3000);

	}
	
}
