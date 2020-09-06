package Wrapper02;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Utils.InteReadExcel;

public class InteDataExcel_ProjSWrapper {

	public ChromeDriver driver;
	
		 @Parameters({"url","uname","pwd"})
		
		 @BeforeMethod
		
		 public void login(String url, String uname, String pwd) {
		   
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\chowd\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		//Load url
		//driver.get("http://leaftaps.com/opentaps/control/main");		 
		 driver.get(url);
		
		//Maximise window		
		 driver.manage().window().maximize();		
		
		  driver.getTitle();
		// Implicitly wait  
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);	
		
		//enter username
		  driver.findElementById("username").sendKeys(uname);
		//Enter password
		
		  driver.findElementByName("PASSWORD").sendKeys(pwd);
		//Click login
		
		  driver.findElementByClassName("decorativeSubmit").click();
		//Click CRM/SFA
		
		  driver.findElementByLinkText("CRM/SFA").click();
		
		 }
		 
		 @AfterMethod
		 public void closeBrowser() {
			 
			 driver.close();
		 }
		 
		 @DataProvider
		 public String[][] getData() throws IOException {
			 InteReadExcel r1 = new InteReadExcel();
			return r1.readexl();
			 
		 }
}
