package Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import POM.landing_page;
import POM.login_page;
import POM.logincro_page;
import Properties.crologin_properties;
import Properties.login_properties;
import Properties.patient_addrow_properties;
import TestCases_patient_view.patient_view;
import TestCase_crologinpage.crologin_page;


public class BaseClass {
	public static login_page login_pagePOM;
	public static WebDriver driver;
	public static Select select;
	public static landing_page landing_pagePOM; //1
	public static login_properties Login_Pro;
	public static patient_view patient_view_Pro; 
	public static patient_addrow_properties PatientAddrow_Pro; //2
	public static logincro_page New_loginPage_PRO; //CRO 1
	public static crologin_properties main_loginPageCRO_Pro; //CRO 2
	public static SoftAssert softassert;
	//1.Web,//2.propertiemethod
	//landing_pagePOM
	@BeforeTest
		public void browserInstalation() {
			driver = new ChromeDriver();
			login_pagePOM = PageFactory.initElements(driver, login_page.class);
			softassert = new SoftAssert();
			Login_Pro = new login_properties();
			//crologin_pro = new crologin_properties();
			PatientAddrow_Pro = new patient_addrow_properties(); //2
			patient_view_Pro = new patient_view();
			landing_pagePOM = PageFactory.initElements(driver, landing_page.class); //1
			New_loginPage_PRO = new logincro_page(); //CRO 2
			main_loginPageCRO_Pro = PageFactory.initElements(driver, crologin_properties.class); // CRO 1
		}
		public static void sendKeys(WebElement element, String data) {
			element.sendKeys(data);
		}
		public static void click(WebElement element) {
			element.click();
		}
		public static void clear(WebElement element) {
			element.clear();
		}
		public static void selectbytext(WebElement element, String data) {
			select = new Select(element);
			select.selectByVisibleText(data);
		}
		
	@AfterTest
		public void closebrowser() {
			//driver.close();
		}	
}
