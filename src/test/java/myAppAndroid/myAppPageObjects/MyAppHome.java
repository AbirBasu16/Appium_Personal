package myAppAndroid.myAppPageObjects;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyAppHome extends MyAppBase {
	
	//constructor...
	public MyAppHome(AndroidDriver driver) {
		super(driver);
	}
	
	//Locators using @AppiumFindBy...
	@AndroidFindBy(accessibility = "Accessibility") 
	WebElement accessibility;
	
	@AndroidFindBy(accessibility = "Animation") 
	WebElement animation;
	
	@AndroidFindBy(accessibility = "App") 
	WebElement app;
	
	@AndroidFindBy(accessibility = "Content") 
	WebElement content;
	
	@AndroidFindBy(accessibility = "Graphics") 
	WebElement graphics;
	
	@AndroidFindBy(accessibility = "Media") 
	WebElement media;
	
	@AndroidFindBy(accessibility = "NFC") 
	WebElement nfc;
	
	@AndroidFindBy(accessibility = "OS") 
	WebElement os;
	
	@AndroidFindBy(accessibility = "Preference") 
	WebElement preference;
	
	@AndroidFindBy(accessibility = "Text") 
	WebElement text;
	
	@AndroidFindBy(accessibility = "Views") 
	WebElement views;
	
	
	//Actions Methods...
	public void clickAccessibility() {
		accessibility.click();
	}
	
	public void clickAnimation() {
		animation.click();
	}

	public void clickApp() {
		app.click();
	}

	public void clickContent() {
		content.click();
	}

	public void clickGraphics() {
		graphics.click();
	}

	public void clickMedia() {
		media.click();
	}

	public void clickNfc() {
		nfc.click();
	}

	public void clickOs() {
		os.click();
	}

	public void clickPreference() {
		preference.click();
	}

	public void clickText() {
		text.click();
	}

	public void clickViews() {
		views.click();
	}

}
