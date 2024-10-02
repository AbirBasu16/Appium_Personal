package myAppAndroid.myAppPageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyAppBase {

	protected AndroidDriver driver;
	
	//Constructor...
	public MyAppBase(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//Re-usable Actions...
	
	protected void long_Click_Gesture(WebElement ele) { 

		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId(), "duration", 1500));
		
	}
	
	protected void double_Click_Gesture(WebElement ele) { 
		
		((JavascriptExecutor) driver).executeScript("mobile: doubleClickGesture", ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId()));
		
	}
	
	protected void scroll_Gesture() {		
		
		boolean check = true;
		
		while (check) {
			check = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of("left", 100, "top", 100, "width", 200, "height", 200, "direction", "down", "percent", 1.0));
		}
		
	}
	
	protected void scrollTo_Gesture(String text) {
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable( new UiSelector()).scrollIntoView(text(\"" + text + "\"))"));
		
	}
	
}