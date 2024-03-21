package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class login_page {

   /*
    * Here we are adding all path values and storing
    * Ex:- id = "email", element name = username;
    * 	
    */
	@FindBy(id = "email") public WebElement username;
	@FindBy(xpath = "/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div/form/div[2]/div/input") public WebElement password;
	@FindBy(xpath = "/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div/form/div[3]/button") public WebElement loginbutton;
	
    // Forget password
	@FindBy(xpath = "/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div/form/div[4]/b/a") public WebElement forgotpassword;
	
   //Logout
	@FindBy(xpath = "//*[@id=\"page-header-user-dropdown\"]") public WebElement profilename;
	@FindBy(xpath = "//*[@id=\"page-topbar\"]/div/div[2]/div[2]/div[4]/div/a[2]") public WebElement logout;
}

