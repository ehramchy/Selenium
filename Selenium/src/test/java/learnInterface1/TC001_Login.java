package learnInterface1;

import org.testng.annotations.Test;

public class TC001_Login extends GenericWrapper {
    
	@Test
	public void login() {
 
		launchBrowser("http://leaftaps.com/opentaps/control/main");
		enterById("username", "demosalesmanager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLinkText("CRM/SFA");		
		clickByLinkText("Create Lead");
        enterById("createLeadForm_companyName", "ADC");
        enterById("createLeadForm_firstName", "Ehsan");
        enterById("createLeadForm_lastName", "Adyan");
                
	}

}
