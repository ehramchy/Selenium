package learnInterface1;

import org.testng.annotations.Test;

public class TC003_Forecast extends TC002_Local {
        
	@Test
	public void forecast() {
		clickByLinkText("Forecasts");
		clickByLinkText("Find Forecasts");
		clickByName("submitButton");
	}
}
