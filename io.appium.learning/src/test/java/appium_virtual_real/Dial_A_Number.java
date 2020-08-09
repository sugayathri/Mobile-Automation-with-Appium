package appium_virtual_real;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Dial_A_Number {

	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "XUV3Y18630019853");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0.0");
//	dc.setCapability("appPackage", "com.dd.devotional.karthikapuranamu");
//		dc.setCapability("appActivity", "com.dd.devotional.karthikapuranamu.SplashScreen");
		Thread.sleep(3000);
//		dc.setCapability("appPackage", "com.android.contacts");
//		dc.setCapability("appActivity", "com.android.contacts.activities.DialtactsActivity");
		dc.setCapability("appPackage", "com.android.mms");
		dc.setCapability("appActivity", "com.android.mms.ui.ConversationList");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement>driver=new AndroidDriver<WebElement>(url, dc);
		
		

	
		
		
	}

}
