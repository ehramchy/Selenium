package learnInterface1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

 	public class CreateLeadLIFrame {

	public static void main(String[] args) {
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
		driver.findElementById("createLeadForm_companyName").sendKeys("Adyan");
		
		//Enter Forename
		driver.findElementById("createLeadForm_firstName").sendKeys("Ehsan");
		
		//Enter Surname
		driver.findElementById("createLeadForm_lastName").sendKeys("Yusra");
		
		//Enter First Name (Local)
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Ehram");
		
		//Enter Last Name (Local)
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Uddin");
		
		//Enter Solution
		
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mr");
		
		//Enter Title
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Dr");
		
		//Enter Department
		driver.findElementById("createLeadForm_departmentName").sendKeys("IT Solution");
		
		//Enter Annual Revenue
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("50000");
		
		 WebElement Source = driver.findElementById("createLeadForm_dataSourceId");
		  Select dd = new Select(Source);
		//dd.selectByVisibleText("Cold Call");
		//dd.selectByValue("LEAD_CONFERENCE");
		  dd.selectByIndex(7);
		
		  WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		 //WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
         Select dd1 = new Select(industry);
		 dd1.selectByVisibleText("Aerospace");
		//dd1.selectByValue("IND_HARDWARE");
		  //dd1.selectByIndex(3);
		  
		 WebElement Ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		//WebElement Ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		 Select dd2 = new Select(Ownership);
		dd2.selectByVisibleText("LLC/LLP");
		//dd2.selectByValue("OWN_PROPRIETOR");
		//dd2.selectByIndex(2);
		
		 WebElement Mkt_Cpn = driver.findElementById("createLeadForm_marketingCampaignId");
		//WebElement mkt_cam = driver.findElementById("createLeadForm_marketingCampaignId");
		 Select dd3 = new Select(Mkt_Cpn);  
		 dd3.selectByVisibleText("Automobile");
		//dd3.selectByValue("CATRQ_CARNDRIVER");
		//dd3.selectByIndex(5);
		 
		 WebElement Pref_Cnc = driver.findElementById("createLeadForm_currencyUomId");
		//WebElement prefferedcurrency = driver.findElementById("createLeadForm_currencyUomId");
		  Select dd4 = new Select(Pref_Cnc);
		  dd4.selectByVisibleText("USD - American Dollar");
		//dd4.selectByValue("UYP");
		//dd4.selectByIndex(10);
	    
	       WebElement State = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		  Select dd5 = new Select(State);
		//dd5.selectByVisibleText("Alabama");
		//dd5.selectByValue("AK");
		  dd5.selectByIndex(4);
		  		
		//Enter Number of Employees
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("700");
		
		//Enter Ticker Symbol 
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("KK");
		
		//SIC Code
		driver.findElementById("createLeadForm_sicCode").sendKeys("bt");
		
		//Enter Address line 1
		driver.findElementById("createLeadForm_sicCode").sendKeys("kt");
		
		//Enter Description
		driver.findElementById("createLeadForm_description").sendKeys("This is a very good IT Solution c");
		
		//Enter Description
		driver.findElementById("createLeadForm_importantNote").sendKeys("This is a IT Firm");
		
		//Enter Area Code
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("00");
		//enter Phone Number
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("01239876542");
		
		//Enter Extension
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("2");
		
		//E-mail Address
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("adss@gmail.com");
		
		//Enter Person to Ask for
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("rumman");
		
		//Enter Web URL
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("trs");
		
		//Enter To Name
		driver.findElementById("createLeadForm_generalToName").sendKeys("ksss");
		
		//Enter Attention Name
		  driver.findElementById("createLeadForm_generalAttnName").sendKeys("RRS");
		
		//Enter Address Line 1
		  driver.findElementById("createLeadForm_generalAddress1").sendKeys("Field LANE");
		
		//Enter Address Line 2
		  driver.findElementById("createLeadForm_generalAddress2").sendKeys("Broad Way");
		
		//Select Class for Drop Down (how to handle with Drop down?)
		//Identify the Drop down element and Pass to Select class
						
		//Enter City
		  driver.findElementById("createLeadForm_generalCity").sendKeys("Ray");
		
		//Enter State/Province
		//driver.findElementById("createLeadForm_generalStateProvinceGeoId").sendKeys("gold");
		
		//Enter Postal Code
		  driver.findElementById("createLeadForm_generalPostalCode").sendKeys("12323");
		
		//Enter Zip Code/Postal
		  driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("2332");
		
		//Click Create Lead
	    driver.findElementByClassName("smallSubmit").click();
		  
	}

}
