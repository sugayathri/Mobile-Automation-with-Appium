package appium_virtual_real;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Realdevice_Connection {

	public static void main(String[] args) throws MalformedURLException
{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		  dc.setCapability(MobileCapabilityType.DEVICE_NAME, "XUV3Y18630019853"); 

	        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

	        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0.0");
        dc.setCapability("appPackage", "com.android.calculator2");
	        dc.setCapability("appActivity", "com.android.calculator2.Calculator");
	        URL url=new URL("http://127.0.0.1:4723/wd/hub");
	        AndroidDriver<WebElement>ad=new AndroidDriver<WebElement>(url, dc);
	        WebElement nine=ad.findElement(By.id("com.android.calculator2:id/digit_9"));
	        		nine.click();
	        		
	        		WebElement plus=ad.findElement(By.id("com.android.calculator2:id/op_add"));
	        		plus.click();
	        		WebElement seven=ad.findElement(By.id("com.android.calculator2:id/digit_7"));
	        		seven.click();
	        		
	        		//ad.findElement(By.id("com.android.calculator2:id/result"));
	        		WebElement equal=ad.findElement(By.id("com.android.calculator2:id/eq"));
	        		equal.click();
	        		ad.findElement(By.id("com.android.calculator2:id/formula"));
        		/*WebElement clear=ad.findElement(By.id("com.android.calculator2:id/op_clr"));
	        		clear.click();   */
	        	}
}
