package ActionPerform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Signup extends BrowserSetting {
	public  void signup() {
		WebElement signup_button = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/div/div/div[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(signup_button).click().perform();
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("987654321");
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div/form/div[3]/button/span")).click();
		String error_msg = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div/form/div[1]/span[3]/span")).getText();
		System.out.println("Getting Error Message while Signup: -> "+error_msg);
		
	}

}
