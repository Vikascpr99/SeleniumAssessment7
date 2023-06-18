package ActionPerform;

import org.openqa.selenium.WebDriver;

public class CloseBrowser extends BrowserSetting {

	public void closeBrowser () {
		driver.quit();
	}
}
