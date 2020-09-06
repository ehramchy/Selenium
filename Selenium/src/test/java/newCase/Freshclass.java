package newCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Freshclass implements Supeclass {

public ChromeDriver driver;
	
	public void launchBrowser(String url) {				
	
	 System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win84\\chromedriver.exe");
		
		 driver = new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.get(url);		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	

	}

	public void enterById(String locatorValue, String data) {		
		driver.findElementById(locatorValue).sendKeys(data);
	}

	public void enterByname(String locatorValue, String data) {		
		driver.findElementByName(locatorValue).sendKeys(data);
	}

	public void enterByPartialLinkText(String locator) {		
		
	}	

	public void enterByXpath(String locatorValue, String data) {		
		driver.findElementByXPath(locatorValue).sendKeys(data);
	}

	public void clickByName(String locatorValue) {
		driver.findElementByName(locatorValue).click();
		
	}	

	public void clickByClassName(String locatorValue) {		
		driver.findElementByClassName(locatorValue).click();
	}

	public void clickByLinkText(String locatorValue) {		
		driver.findElementByLinkText(locatorValue).click();
	}

	public void clickByXpath(String locatorValue) {
		driver.findElementByXPath(locatorValue).click();
		
	}

	public void selectVisibleTextById(String Id, String Value) {
		WebElement ele1 = driver.findElementById(Id);
		  Select dd = new Select(ele1);
		dd.selectByVisibleText(Value);				
	}

	public void selectVisibleTextByName(String Name, String Value) {
		WebElement ele = driver.findElementByName(Name);
		Select dd1 = new Select(ele);
		 dd1.selectByVisibleText(Value);		
	}
	
	public void verifyTextbyId(String locatorValue, String data) {
		String txt = driver.findElementById(locatorValue).getText();
		if(txt.equals(data)) {
			System.out.println("Name is Matched");
		}else {
			System.out.println("Name is not matched");
		}
	}

	public void selectIndexById(String Id, int Value) {
		WebElement ele2 = driver.findElementById(Id);
		  Select dd2 = new Select(ele2);		
		  dd2.selectByIndex(Value);		
	}

	public void selectIndexByName(String Name, int Value) {
		WebElement ele3 = driver.findElementById(Name);
		  Select dd3 = new Select(ele3);		
		  dd3.selectByIndex(Value);		
	}

	public void selectValueById(String Id, String value) {
		
		
	}

	public void selectValueByName(String name, String value) {
		
		
	}

	public void getTextById(String Id) {
		WebElement ttt = driver.findElementById(Id);
		System.out.println("Text");
		
	}

	public void closeBrowser() {
		driver.close();
		
	}

	public void enterByPartialLinkText(String locatorvalue, String data) {
		// TODO Auto-generated method stub
		
	}

	public void verifyById(String locatorValue, String data) {
		// TODO Auto-generated method stub
		
	}
	
}


	
	

