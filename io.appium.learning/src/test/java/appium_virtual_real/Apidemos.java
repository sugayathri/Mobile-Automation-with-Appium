package appium_virtual_real;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Apidemos {

	public static void main(String[] args) throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "XUV3Y18630019853");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0.0");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<AndroidElement>driver=new AndroidDriver<AndroidElement>(url, dc);

		WebElement Text=driver.findElementByXPath("//android.widget.TextView[@text='Text']");
		Text.click();
		AndroidElement list=(AndroidElement)driver.findElementById("android:id/text1");
		MobileElement listitem=(MobileElement)driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new  UiSelector().scrollIntoView("+ "new UiSelector().description(\"Marquee\"));"));
		System.out.println(listitem.getLocation());
		listitem.click();
}
	}

