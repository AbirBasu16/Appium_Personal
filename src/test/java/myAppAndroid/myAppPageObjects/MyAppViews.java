package myAppAndroid.myAppPageObjects;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyAppViews extends MyAppBase {
	
	public MyAppViews(AndroidDriver driver) {
		super(driver);
	}
	
	//Locators...
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Expandable Lists\"]") 
	WebElement expandableList;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]")
	WebElement customAdaptor;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"People Names\"]") 
	WebElement peopleNames;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Sample action']") 
	WebElement sampleAction;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Gallery']") 
	WebElement gallery;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Switches']") 
	WebElement switches;
	
	//Actions...
	public void longPress() {
		
		expandableList.click();
		
		customAdaptor.click();
		
		long_Click_Gesture(peopleNames);
		
		sampleAction.click();
		
	}
	
	public void clickSwitch() {
		
		switches.click();
		
	}
	
	public void scrollToSwitch() {
		
//		scroll_Gesture();
		
		scrollTo_Gesture("Switches");
		
	}
	
	
}
