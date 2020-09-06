package sPofFramework;

import org.testng.annotations.Test;

public class Framework extends GeneralWrap {

		@Test
		public void testcase() {
			
			launchBrowser("http://leaftaps.com/opentaps/control/main");
			enterById("username", "Demosalesmanager");
			enterById("password", "crmsfa");
			clickByClassName("decorativeSubmit");
			clickByLinkText("CRM/SFA");		
			clickByLinkText("Create Lead");
	        enterById("createLeadForm_companyName", "ADC");
	        enterById("createLeadForm_firstName", "Ehsan");
	        enterById("createLeadForm_lastName", "Adyan");
		}
	
			
}
