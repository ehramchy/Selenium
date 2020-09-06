   package Wrapper01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificWrapper1 {
     
	   
	 public ChromeDriver driver; 
	 
	 
	// @Parameters({"url","uname","pwd"})
	 @Parameters({"url","uname","pwd"})
	// @BeforeMethod
	 @BeforeMethod
	// public void login(String url, String uname, String pwd) {
	 public void login(String url, String uname, String pwd) {
	   
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\chowd\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	 System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win84\\chromedriver.exe");
	 driver = new ChromeDriver();
	
	//Load url
	//driver.get("http://leaftaps.com/opentaps/control/main");
	 //driver.get(url);
	 driver.get(url);
	
	//Maximise window
	//driver.manage().window().maximize();
	 driver.manage().window().maximize();
	
	//driver.getTitle();
	  driver.getTitle();
	// Implicitly wait  
	//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);	
	
	//enter username
	//driver.findElementById("username").sendKeys(uname);
	  driver.findElementById("username").sendKeys(uname);
	//Enter password
	//driver.findElementByName("PASSWORD").sendKeys(pwd);
	  driver.findElementByName("PASSWORD").sendKeys(pwd);
	//Click login
	//driver.findElementByClassName("decorativeSubmit").click();
	  driver.findElementByClassName("decorativeSubmit").click();
	//Click CRM/SFA
	//driver.findElementByLinkText("CRM/SFA").click();
	  driver.findElementByLinkText("CRM/SFA").click();
	
	 }
	 
	 @AfterMethod
	 public void closeBrowser() {
		 
		 driver.close();
	 }
	 
	 @DataProvider
	 public String[][] getData() {
		 String[][] data = new String[2][3];
		 
		 data[0][0] = "ABC";
		 data[0][1] = "Ehram";
		 data[0][2] = "Chowd";
		 
		 data[1][0] = "QAS";
		 data[1][1] = "Adyan";
		 data[1][2] = "Chy";
		 
		 return data;
		
		 
		 
		 
	 }
}
