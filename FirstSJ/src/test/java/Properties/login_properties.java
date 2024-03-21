package Properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class login_properties {

	public static Properties Login_pro;
	
	public login_properties () {
		File file = new File(System.getProperty("user.dir")+"/Test_data/Login_data");
		
		try {
			Login_pro = new Properties();
			FileInputStream input = new FileInputStream(file);
			Login_pro.load(input);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public String admin_url() {
		String AURL = Login_pro.getProperty("cro_url");
		return AURL;
	}
	public String admin_username() {
		String AUN = Login_pro.getProperty("cro_admin_un");
		return AUN;
	}
	public String admin_password() {
		String AP = Login_pro.getProperty("cro_admin_psw");
		return AP;
	}
/*	
 * public String output() {
		File file = new File(System.getProperty("user.dir")+"/Test_data/Login_data");
		String getfilepath = file.getPath();
		return getfilepath;
	}
*/ 
}
