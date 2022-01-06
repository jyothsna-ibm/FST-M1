package Activities;

import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Keys;
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
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;

public class Activity5 {
   AppiumDriver<MobileElement> driver = null;
     WebDriverWait wait = null;
   
     @BeforeClass
     public void setUp() throws MalformedURLException
     {
    	 DesiredCapabilities caps = new DesiredCapabilities();
    	 caps.setCapability("deviceName", "Pixel 4 API 28");
         caps.setCapability("platformName", "Android");
         caps.setCapability("appPackage", "com.google.android.apps.messaging");
         caps.setCapability("appActivity", ".ui.ConversationListActivity");
         caps.setCapability("noReset", true);
         
         URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
         driver = new AndroidDriver<MobileElement>(appServer, caps);
         wait = new WebDriverWait(driver, 10);
     }
     
     @Test
     public void smsTest()
     {
    	 
    		
         wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AndroidUIAutomator("description(\"Start new conversation\")")));
    	 
    	 driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.apps.messaging:id/start_new_conversation_button\")")).click();
    	 String contactBox= "resourceId(\"com.google.android.apps.messaging:id/recipient_text_view\")";
    	 
    	 wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AndroidUIAutomator(contactBox)));
    	 
    	 driver.findElement(MobileBy.AndroidUIAutomator(contactBox)).sendKeys("9290992319");
    	 
    	driver.getKeyboard().sendKeys(Keys.ENTER);
         
    	// driver.findElement(MobileBy.AndroidUIAutomator(contactBox)).sendKeys(Keys.ENTER);
    	 
    	 String msgBox = "resourceId(\"com.google.android.apps.messaging:id/compose_message_text\")";
    	 
    	 wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AndroidUIAutomator(msgBox)));

    	 driver.findElement(MobileBy.AndroidUIAutomator(msgBox)).sendKeys("Hello Appium");
    	 
    	 driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.apps.messaging:id/send_message_button_icon\")")).click();
    	 
    	 
       String replyBox = "resourceId(\"com.google.android.apps.messaging:id/message_text\")";
    	 
    	 wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AndroidUIAutomator(replyBox)));

    	String msg=  driver.findElement(MobileBy.AndroidUIAutomator(replyBox)).getText();
    	 
    	//Assertion
    	
    	Assert.assertEquals(msg, "Hello Appium");
    	 
     }
     
     @AfterClass
     public void afterClass() {
         driver.quit();
     }
}



