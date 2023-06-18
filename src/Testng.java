import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ActionPerform.BrowserSetting;
import ActionPerform.CloseBrowser;
import ActionPerform.EnterDetails;
import ActionPerform.FilterPrice;
import ActionPerform.GetMobile;
import ActionPerform.Login;
import ActionPerform.MobileListunder15000;
import ActionPerform.OpenApplication;
import ActionPerform.Signup;
import ActionPerform.WritePhoneList;

public class Testng {
 WebDriver driver;

@BeforeTest
public void openbrowser() {
	
	System.out.println("Flipcart Test in Different Browser");
}


@Test(priority = 1)

public void chrome() throws InterruptedException, IOException {
	System.out.println("Open Application in Chrome Browser");
	BrowserSetting bs = new BrowserSetting();
	bs.chromeSetting();
	
	OpenApplication oa = new OpenApplication();
	oa.openApplication();
	
	EnterDetails ed = new EnterDetails();
	ed.enterKeyword();
	Thread.sleep(5000);
//	WebDriverWait wait = new WebDriverWait(driver, 20);
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/ul/li[7]/div")));
	ed.suggestion();	

	MobileListunder15000 ml = new MobileListunder15000();
	ml.mobileUnder15000();
	
	
	Thread.sleep(3000);
	FilterPrice fp = new FilterPrice();
	fp.filterName();
	Thread.sleep(3000);
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[2]/div[4]/div[3]/select/option[4]")));
	fp.selectRange();
	Thread.sleep(3000);
	fp.selectAndroidVersion();
	Thread.sleep(10000);
	WritePhoneList wpl = new WritePhoneList();
	wpl.output();
	
	
	GetMobile gm = new GetMobile();
	gm.getMobile();
	
	Login l = new Login();
	l.login();
	Thread.sleep(3000);
	Signup s = new Signup();
	s.signup();
	
		

}

@Test(priority = 2)

public void edge() throws InterruptedException, IOException {
	System.out.println("Open Application in edge Browser");
	BrowserSetting bs = new BrowserSetting();
	bs.edgeSetting();
	
	OpenApplication oa = new OpenApplication();
	oa.openApplication();
	
	EnterDetails ed = new EnterDetails();
	ed.enterKeyword();
	Thread.sleep(5000);
//	WebDriverWait wait = new WebDriverWait(driver, 20);
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/ul/li[7]/div")));
	ed.suggestion();	

	MobileListunder15000 ml = new MobileListunder15000();
	ml.mobileUnder15000();
	
	
	Thread.sleep(3000);
	FilterPrice fp = new FilterPrice();
	fp.filterName();
	Thread.sleep(3000);
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[2]/div[4]/div[3]/select/option[4]")));
	fp.selectRange();
	Thread.sleep(3000);
	fp.selectAndroidVersion();
	Thread.sleep(10000);
	WritePhoneList wpl = new WritePhoneList();
	wpl.output();
	
	
	GetMobile gm = new GetMobile();
	gm.getMobile();
	
	Login l = new Login();
	l.login();
	Thread.sleep(3000);
	Signup s = new Signup();
	s.signup();
	
		

}



@AfterTest
public void closeBrowser() {
CloseBrowser cb = new CloseBrowser();
cb.closeBrowser();
}

}
