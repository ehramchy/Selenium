package learnInterface1;

import org.testng.annotations.Test;

public class TC002_Local extends TC001_Login {
	
	@Test
	public void Local() {
		
		enterById("createLeadForm_firstNameLocal", "Ehram");
		enterById("createLeadForm_lastNameLocal", "Uddin");
		enterById("createLeadForm_personalTitle", "Mr");
		enterById("createLeadForm_generalProfTitle", "Dr");
		verifyTextbyId("createLeadForm_companyName", "Adyan");
		
	}

}
