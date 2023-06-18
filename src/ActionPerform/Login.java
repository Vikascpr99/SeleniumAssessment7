package ActionPerform;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Login extends BrowserSetting{

	public void login() {
		WebElement login_button = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div"));
		Actions action = new Actions(driver);
		action.moveToElement(login_button).perform();
		
	}
}
