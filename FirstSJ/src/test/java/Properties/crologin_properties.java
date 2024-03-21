package Properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class crologin_properties {
	
	public static Properties loginPage_CROPRO;
	
	public crologin_properties() {
		
		File crologin_details = new File(System.getProperty("user.dir")+"/Test_data/cro_login_page_data");
		
		try {
			loginPage_CROPRO = new Properties();
			FileInputStream cro_data = new FileInputStream(crologin_details);
			loginPage_CROPRO.load(cro_data);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public String crol_url() {
		String croURL = loginPage_CROPRO.getProperty("cro_login_username");
		return croURL;
	}
	public String crol_username() {
		String crouserName = loginPage_CROPRO.getProperty("cro_login_password");
		return crouserName;
	}
	public String crol_password() {
		String croPassword = loginPage_CROPRO.getProperty("cro_login_btn");
		return croPassword;
	}
}
