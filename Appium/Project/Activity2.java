package Project;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Activity2 {
	AppiumDriver<MobileElement> driver = null;
	WebDriverWait wait = null;
	
	@BeforeClass
	public void setUp() throws MalformedURLException
	
	{

		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("deviceName","Pixel 4 API 28");
		caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("noReset", true);
        
        driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps);
        wait = new WebDriverWait(driver,10);
		
	}
	
	@Test
	
	public void createTask() throws InterruptedException
	
	{
		
	     Thread.sleep(1000);
		driver.findElementById("com.google.android.keep:id/new_note_button").click();
		driver.findElementById("com.google.android.keep:id/editable_title").sendKeys("Notes");
		driver.findElementById("com.google.android.keep:id/edit_note_text").sendKeys("SmallNotes");
		 Thread.sleep(1000);
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]").click();
	     Thread.sleep(1000);

		//Assertion
		
		String title = driver.findElementById("com.google.android.keep:id/index_note_title").getText();
		
		Assert.assertTrue(title.equals("Notes"));
		
       String description = driver.findElementById("com.google.android.keep:id/index_note_text_description").getText();
		
		Assert.assertTrue(description.equals("SmallNotes"));
		

	}
	
	   
    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
