package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class landing_page_view {
	
	//Click on view button.
	@FindBy(xpath = "//*[@id=\"basic-datatable\"]/tbody[1]/tr/td[5]/div/button[1]") public WebElement pa_view_btn;
	@FindBy(xpath = "/html/body/modal-container/div[2]/div/div[1]/button") public WebElement lp_view_btn;
	
}
