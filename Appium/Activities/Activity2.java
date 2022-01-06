package Activities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Activity2 {

	WebDriverWait wait;
	AppiumDriver<MobileElement> driver = null;
	
	@BeforeTest
	public void setUp() throws MalformedURLException 
	
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("deviceName","Pixel 4 API 28");
		caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);
        
        driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps);
        wait = new WebDriverWait(driver,10);
	}
	
	@Test
	
	public void testSearchAppium() throws InterruptedException
	{
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.training-support.net");
		  String pageTitle = driver.findElementByXPath("//android.view.View[2]").getText();
	        System.out.println("Title on Homepage: " + pageTitle);
	       // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("android.view.View[4]")));
	    driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[4]").click();
	   // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[2]")));
	    Thread.sleep(2000);
	    String newPageTitle = driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[2]").getText();
	    
	    //Assertion
	    
	    Assert.assertEquals(pageTitle,"Training Support");
	    Assert.assertEquals(newPageTitle,"About Us");
		
	}
	
	@AfterTest
	
	public void TearDown()
	
	{
		
		driver.quit();
	}
}
