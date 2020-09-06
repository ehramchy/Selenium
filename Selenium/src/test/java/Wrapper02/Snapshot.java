package Wrapper02;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import com.google.common.io.Files;

public class Snapshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

   System.setProperty("webdriver.chrome.driver", "C:\\Users\\chowd\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); 
		
		//Load url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximise window
		driver.manage().window().maximize();		
		
		driver.getTitle();
		
		// Implicitly wait  
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		//enter username
		driver.findElementById("username").sendKeys("Demosalesmanager");
		
		//Enter password
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		//Click login
		driver.findElementByClassName("decorativeSubmit").click();
		
		//Click CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();
		
		//driver.close();
		//Thread.sleep(3000);
		
		//Click create lead
		  driver.findElementByLinkText("Create Lead").click();
			
		//Enter companyname
		driver.findElementById("createLeadForm_companyName").sendKeys("ABCD");
		
		//Enter Forename
		try {
			driver.findElementById("createLeadForm_firstNamed").sendKeys("Rahim");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		File scrsht = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\rhcho\\Pictures\\snapshot\\image.png");
	
		FilesUtils.copyFile(scrsht, dest);  */
		
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dst = new File("C:\\Users\\chowd\\OneDrive\\Pictures\\ehram2.png");
	    FileUtils.copyFile(src, dst);	
				
		//Enter Surname
		driver.findElementById("createLeadForm_lastName").sendKeys("Karim");		
		
		//Click Create Lead
	    driver.findElementByClassName("smallSubmit").click();
		
	}

}
