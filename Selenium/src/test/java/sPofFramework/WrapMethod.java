package sPofFramework;

public interface WrapMethod {
		
	public void launchBrowser(String url);
	
	public void enterById(String locatorValue, String data);
	public void enterByname(String locatorValue, String data);
	public void enterByPartialLinkText(String locatorvalue, String data);	
	public void enterByXpath(String locatorValue, String data); 
	
	public void clickByName(String locatorValue);	
	public void clickByClassName(String locatorValue);	
	public void clickByLinkText(String locatorValue);	
	public void clickByXpath(String locatorValue);
	
	public void selectVisibleTextById(String Id, String Value);	
	public void selectVisibleTextByName(String Id, String Value);
	
	public void selectIndexById(String Id, int Value);	
	public void selectIndexByName(String Name, int Value);
	
	public void selectValueById(String Id, String Value);	
	public void selectValueByName(String Name, String Value);
	
	public void getTextById(String locatorValue);
	
	public void verifyById(String locatorValue, String data);
	
	public void closeBrowser();

}
