package ActionPerform;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetting {

	public static WebDriver driver;
	
	public WebDriver chromeSetting() {
		
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
//			driver.manage().window().maximize();
//			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		//	driver.manage().deleteAllCookies();
		;
			return driver;
	}
	
	
		public WebDriver edgeSetting() {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
			driver.manage().window().maximize();
			
			
			
			
			
//			driver.manage().window().maximize();
//			driver.manage().deleteAllCookies();
			
			return driver;
			
			
		}
		
	
}
