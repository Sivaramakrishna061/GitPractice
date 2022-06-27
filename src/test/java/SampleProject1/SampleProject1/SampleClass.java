package SampleProject1.SampleProject1;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class SampleClass {

	public static void main(String[] args) throws MalformedURLException {
		

		/*Desired Capabilities*/
		
		File Parentfile = new File("");
		File file = new File (Parentfile, "");
		
	DesiredCapabilities Dc = new DesiredCapabilities();
			Dc. setCapability(MobileCapabilityType.PLATFORM_NAME, " ");
			Dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "");
			Dc. setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
			Dc.setCapability(MobileCapabilityType.UDID ,"");
			Dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomato2");
		Dc.setCapability("appPackage", "");
		Dc.setCapability("appActivity", "");
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL ("http://127.0.0.1:4723/wd/hub"),Dc );
	}

}
