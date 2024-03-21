package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class crologin_page {
	
	@FindBy(xpath = "//input[@id='email']") public WebElement cro_login_username;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/input[1]") public WebElement cro_login_password;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/button[1]") public WebElement cro_login_btn;

}
