package Properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import POM.landing_page;

public class patient_addrow_properties {

	public static Properties Patient_Addrow;
	
	public patient_addrow_properties() {
		
		File addrow_data = new File(System.getProperty("user.dir")+"/Test_data/Patient_addrow");
		
		try {
			Patient_Addrow = new Properties();
			FileInputStream AddRow = new FileInputStream(addrow_data);
			Patient_Addrow.load(AddRow);			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	
	public String patient_code() {
		String PatCode = Patient_Addrow.getProperty("patient_admin_crocode");
		return PatCode;
	}
	public String patient_name() {
		String PatName = Patient_Addrow.getProperty("patient_admin_croname");
		return PatName;
	}
	public String patient_phone() {
		String PatPhon = Patient_Addrow.getProperty("patient_admin_phone");
		return PatPhon;
	}
	public String patient_email() {
		String PatEmail = Patient_Addrow.getProperty("patient_admin_email");
		return PatEmail;
	}
	public String Patient_add1() {
		String Patadd1 = Patient_Addrow.getProperty("patient_admin_add1");
		return Patadd1;
	}
	public String Patient_add2() {
		String Patadd2 = Patient_Addrow.getProperty("patient_admin_add2");
		return Patadd2;
	}
	public String Patient_add3() {
		String Patadd3 = Patient_Addrow.getProperty("patient_admin_add3");
		return Patadd3;
	}
	public String Patient_add4() {
		String Patadd4 = Patient_Addrow.getProperty("patient_admin_add4");
		return Patadd4;
	}
	public String Patient_Contry() {
		String PatCoun = Patient_Addrow.getProperty("patient_admin_country_dropdown");
		return PatCoun;
	}
	public String Patient_State() {
		String PatState = Patient_Addrow.getProperty("patient_admin_state_dropdown");
		return PatState;
	}
	public String Patient_City() {
		String PatCity = Patient_Addrow.getProperty("patient_admin_city_dropdown");
		return PatCity;
	}
	public String Patient_Pincode() {
		String PatPin = Patient_Addrow.getProperty("patient_admin_pincode");
		return PatPin;
	}
	public String Patient_crocodeerr() {
		String Paterror = Patient_Addrow.getProperty("crocode_error_message");
		return Paterror;
	}
	public String Patient_edit_name() {
		String Patedtcname = Patient_Addrow.getProperty("edit_croName");
		return Patedtcname;
	}
	
	
	
}
