package ActionPerform;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenApplication extends BrowserSetting {

	public void openApplication() {
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		driver.switchTo().defaultContent();
	}
}
