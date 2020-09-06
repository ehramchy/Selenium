package Wrapper;

import org.testng.annotations.Test;

public class EditLead1 extends ProWrapper {
	
	@Test
	
	public void EditLead1() {
    driver.findElementByLinkText("Leads").click();
		
		
	driver.findElementByXPath("//a[text()='Find Leads']").click();
		
	driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Hema");		
		
	driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();		
		
	//driver.findElementByLinkText("Hema").click();
		
	//Verify Title of the page
		
		
	/*driver.findElementByLinkText("Edit").click();		
				
    driver.findElementById("updateLeadForm_companyName").clear();
    driver.findElementById("updateLeadForm_companyName").sendKeys("CTS");
    driver.findElementByName("submitButton").click();
		
	driver.findElementByLinkText("Edit").click();*/
		
		
	}

}
