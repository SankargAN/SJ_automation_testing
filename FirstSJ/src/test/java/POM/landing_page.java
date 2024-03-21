package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class landing_page {

	//Landing Page
	@FindBy(xpath = "//*[@id=\"layout-wrapper\"]/div/div/app-cro/div[2]/div/div/div/button") public WebElement patient_admin_addrow;
	@FindBy(xpath = "/html/body/modal-container/div[2]/div/div[2]/form/div[1]/div[1]/div/input") public	WebElement patient_admin_crocode;
	@FindBy(xpath = "/html/body/modal-container/div[2]/div/div[2]/form/div[1]/div[2]/div/input") public	WebElement patient_admin_croname;
	@FindBy(xpath = "/html/body/modal-container/div[2]/div/div[2]/form/div[1]/div[3]/div/input") public	WebElement patient_admin_phone;
	@FindBy(xpath = "/html/body/modal-container/div[2]/div/div[2]/form/div[1]/div[4]/div/input") public	WebElement patient_admin_email;
	@FindBy(xpath = "/html/body/modal-container/div[2]/div/div[2]/form/div[1]/div[5]/div[1]/div/input")public	WebElement patient_admin_add1;
	@FindBy(xpath = "/html/body/modal-container/div[2]/div/div[2]/form/div[1]/div[5]/div[2]/div/input") public	WebElement patient_admin_add2;
	@FindBy(xpath = "/html/body/modal-container/div[2]/div/div[2]/form/div[1]/div[5]/div[3]/div/input") public	WebElement patient_admin_add3;
	@FindBy(xpath = "/html/body/modal-container/div[2]/div/div[2]/form/div[1]/div[5]/div[4]/div/input") public	WebElement patient_admin_add4;
	@FindBy(xpath = "/html/body/modal-container/div[2]/div/div[2]/form/div[1]/div[5]/div[5]/div/select") public WebElement patient_admin_country_dropdown;
	@FindBy(xpath = "/html/body/modal-container/div[2]/div/div[2]/form/div[1]/div[5]/div[6]/div/select") public WebElement patient_admin_state_dropdown;
	@FindBy(xpath = "/html/body/modal-container/div[2]/div/div[2]/form/div[1]/div[5]/div[7]/div/select") public WebElement patient_admin_city_dropdown;
	@FindBy(xpath = "/html/body/modal-container/div[2]/div/div[2]/form/div[1]/div[5]/div[8]/div/input") public WebElement patient_admin_dis;
	@FindBy(xpath = "/html/body/modal-container/div[2]/div/div[2]/form/div[1]/div[5]/div[9]/div/input") public WebElement patient_admin_pincode;
	@FindBy(xpath = "/html/body/modal-container/div[2]/div/div[2]/form/div[2]/button") public WebElement patient_admin_savebutton;
	@FindBy(xpath = "/html/body/modal-container/div[2]/div/div[2]/form/div[1]/div[1]/div/p/span") public WebElement patient_crocode_error;
	
	
	//Click on view button.
	@FindBy(xpath = "//*[@id=\"basic-datatable\"]/tbody[1]/tr/td[5]/div/button[1]") public WebElement patient_admin_view_button;
	@FindBy(xpath = "/html/body/modal-container/div[2]/div/div[1]/button") public WebElement lp_view_btn;
	
	//Edit button Click
	@FindBy(xpath = "//*[@id=\"basic-datatable\"]/tbody[1]/tr/td[5]/div/button[2]") public WebElement lp_edit_btn;
	@FindBy(xpath = "/html/body/modal-container/div[2]/div/div[2]/form/div[3]/button") public WebElement lp_edit_save;
	
    //Active & Deactive
	@FindBy(xpath = "//*[@id=\"basic-datatable\"]/tbody[1]/tr/td[5]/div/button[3]") public WebElement lp_act_dec_btn;
	
}	

