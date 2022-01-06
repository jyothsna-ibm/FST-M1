package Project;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class Activity3 {
	AppiumDriver<MobileElement> driver = null;
	WebDriverWait wait = null;
	
	@BeforeClass
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
	
	public void createTask() throws InterruptedException
	
	{
		
		driver.get("https://www.training-support.net/selenium");
		 String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
         Thread.sleep(1000);
		driver.findElement(MobileBy.AndroidUIAutomator(UiScrollable+".scrollForward(7).scrollIntoView(textContains(\"Web Element Directory\"))"));
//		
//		driver.findElement(MobileBy.AndroidUIAutomator(UiScrollable+".scrollForward(7).scrollIntoView(text(\"Nested IFrames  A page in a page in a page.\"))"));
		//driver.findElement(MobileBy.AndroidUIAutomator(UiScrollable+".scrollForward(7).scrollIntoView(text(\"Selects  Dropdowns and Multi Selects\"))"));

		driver.findElement(MobileBy.AndroidUIAutomator(UiScrollable+".scrollForward(7).scrollIntoView(textContains(\"To-Do List\"))")).click();

		//wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[1]")));
        Thread.sleep(1000);
		driver.findElementByXPath("//android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.view.View[2]").click();

		driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.EditText").sendKeys("Add tasks to list");
		driver.findElementByXPath("//android.widget.Button[@text='Add Task']").click();

		
		driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.EditText").sendKeys("Get number of tasks");
		driver.findElementByXPath("//android.widget.Button[@text='Add Task']").click();
		
		driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.EditText").sendKeys("Clear the list");
		driver.findElementByXPath("//android.widget.Button[@text='Add Task']").click();
		
		List<MobileElement> ele = driver.findElementsByXPath("//android.view.View[@resource-id='tasksList']/android.view.View");
         int num = ele.size();
        Assert.assertTrue(num==3);
        
		
        driver.findElementByXPath("//android.view.View[@resource-id='tasksList']/android.view.View[1]/android.view.View[@text='Add tasks to list']").click();
		
        Thread.sleep(1000);
        driver.findElementByXPath("//android.view.View[@resource-id='tasksList']/android.view.View[2]/android.view.View[@text='Get number of tasks']").click();
        Thread.sleep(1000);
        driver.findElementByXPath("//android.view.View[@resource-id='tasksList']/android.view.View[3]/android.view.View[@text='Clear the list']").click();
        Thread.sleep(1000);
		driver.findElementByXPath("//android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.view.View[2]").click();
        Thread.sleep(1000);


		List<MobileElement> ele1 = driver.findElementsByXPath("//android.view.View[@resource-id='tasksList']/android.view.View");
         int num1 = ele1.size();
        Assert.assertTrue(num1==0);
        
	}
	
	   
    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
