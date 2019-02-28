package TestNGDemoNike;




import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BeVinApp {
	@Test
	public void runApp() throws MalformedURLException{
		DesiredCapabilities dCap = new DesiredCapabilities();

		dCap.setCapability("Browser_Name", "Android");
		dCap.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME,Platform.ANDROID);
		dCap.setCapability(MobileCapabilityType.DEVICE_NAME,"Device1");
		dCap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"Com.android.calculator2");
		dCap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"Com.android.calculator2.Calculator");
		
		WebDriver remoteWebDriver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), dCap);
		System.out.println(remoteWebDriver.toString());


		remoteWebDriver.findElement(By.name("2")).click();
		remoteWebDriver.findElement(By.name("+")).click();
		remoteWebDriver.findElement(By.name("7")).click();
		remoteWebDriver.findElement(By.name("=")).click();
	}

}
