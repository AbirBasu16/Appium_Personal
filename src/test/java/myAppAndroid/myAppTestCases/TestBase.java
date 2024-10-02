package myAppAndroid.myAppTestCases;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import myAppAndroid.myAppPageObjects.MyAppHome;
import myAppAndroid.myAppPageObjects.MyAppViews;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class TestBase {

	AndroidDriver driver;
	private AppiumDriverLocalService service;
	
	protected MyAppHome home;
	protected MyAppViews views;
	
	@BeforeClass	
	public void startUp() throws MalformedURLException, URISyntaxException {
		
		//For Starting the server on desired IP address and port number...
		service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\abrui\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
					.withIPAddress("127.0.0.1").usingPort(4723).build();
		
		//Starting the service...
		service.start();
		
		//For initializing the driver with device name and app name... 
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel8a");
		options.setApp("C:\\Users\\abrui\\Desktop\\Eclipse Workplace\\Appium\\src\\test\\java\\myAppAndroid\\resources\\ApiDemos-debug.apk");
		
		driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		home = new MyAppHome(driver);
		views = new MyAppViews(driver);

	}
	
	@AfterMethod
	public void navigate_Back() {
		
		while(true) {
			try {
				if (driver.findElement(AppiumBy.accessibilityId("Access'ibility")).isDisplayed()) break;
			} catch (Exception e) {
				driver.navigate().back();
			}
		}
			
	}
	
	@AfterClass(enabled = false)
	public void wrapUp() {
		
		//Quiting the current session...
		driver.quit();
				
		//Stopping the service...
		service.stop();		
		
	}

}
