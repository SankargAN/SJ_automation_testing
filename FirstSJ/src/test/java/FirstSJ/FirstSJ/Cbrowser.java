package FirstSJ.FirstSJ;

import java.time.Duration;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Cbrowser {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
			
			driver.get("http://52.8.28.154:83/account/login");
			
			driver.getTitle();
			
			WebElement userName = driver.findElement(By.id("email"));
			userName.sendKeys("admin@roboxa.com");
			Thread.sleep(5000);
				
			WebElement passWord = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div/form/div[2]/div/input"));
			passWord.sendKeys("admin");
			Thread.sleep(5000);
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
			
			WebElement Submit = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div/form/div[3]/button"));
			Submit.click();
			Thread.sleep(5000);
			
			driver.quit();
			}

}
