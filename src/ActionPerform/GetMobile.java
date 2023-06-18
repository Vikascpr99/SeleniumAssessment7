package ActionPerform;

import java.awt.Desktop.Action;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GetMobile extends BrowserSetting{

	public void getMobile() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).click();
		Thread.sleep(5000);
		
		for(String childTab : driver.getWindowHandles()) {
			driver.switchTo().window(childTab);
		}
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		WebElement mobile_price = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[3]/div[1]/div/div"));
		System.out.println("Mobile Price to verify :- "+ mobile_price.getText());
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
		Thread.sleep(3000);
	}
	/*
	public void captureErrorScreenshot(WebDriver driver) {
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		
		 this.takeSnapShot(driver, "C:\\Users\\VK65778\\eclipse-workspace\\Selenium Assignment\\Selenium Assignment 7\\Screenshot") ; 
	}
	
	private void takeSnapShot(WebDriver driver, String string) {
		// TODO Auto-generated method stub
		 TakesScreenshot scrShot =((TakesScreenshot)driver);
		 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		  File DestFile=new File(fileWithPath);

          FileUtils.copyFile(SrcFile, DestFile);
	}
	*/
	
}
