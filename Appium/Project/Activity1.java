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
import io.appium.java_client.MobileElement;

public class Activity1 {

	
	AppiumDriver<MobileElement> driver = null;
	WebDriverWait wait = null;
	
	@BeforeClass
	public void setUp() throws MalformedURLException
	
	{

		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("deviceName","Pixel 4 API 28");
		caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");
        caps.setCapability("noReset", true);
        
        driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps);
        wait = new WebDriverWait(driver,10);
		
	}
	
	@Test
	
	public void createTask() throws InterruptedException
	
	{
		  Thread.sleep(1000);
	//Creating List
		driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"New list\"]/android.widget.TextView").click();
		//MobileElement list = driver.findElementById("com.google.android.apps.tasks:id/edit_list_title");
		//wait.until(ExpectedConditions.elementToBeClickable(list));
            Thread.sleep(1000);
		driver.findElementById("com.google.android.apps.tasks:id/edit_list_title").sendKeys("Activities");
		driver.findElementById("done_button").click();
		
		//Adding Tasks 
		
		Thread.sleep(1000);
		driver.findElementById("tasks_fab").click();
		Thread.sleep(1000);
		driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Tasks");
		driver.findElementById("add_task_done").click();
		Thread.sleep(1000);
           driver.findElementById("tasks_fab").click();
           Thread.sleep(1000);
		driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Keep");
		driver.findElementById("add_task_done").click();
		Thread.sleep(1000);
        driver.findElementById("tasks_fab").click();
        Thread.sleep(1000);
		driver.findElementById("add_task_title").sendKeys("Complete the second Activity Google Keep");
		driver.findElementById("add_task_done").click();
		
		//Assertion
		Assert.assertTrue(driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Tasks\"]/android.view.ViewGroup/android.widget.TextView").isDisplayed());
		Assert.assertTrue(driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Keep\"]/android.view.ViewGroup/android.widget.TextView").isDisplayed());

		Assert.assertTrue(driver.findElementByXPath(	
				"//android.widget.FrameLayout[@content-desc=\"Complete the second Activity Google Keep\"]/android.view.ViewGroup/android.widget.TextView").isDisplayed());

		
		
	}
	
	   
    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
