package myAppAndroid.myAppTestCases;

import org.testng.annotations.Test;

public class TestCase_01 extends TestBase{
	
	@Test
	public void verify_Accessibility_Click() {

		home.clickAccessibility();
		
	}
	
	@Test
	public void verify_Animation_Click() {
		
		home.clickAnimation();

	}
	
	@Test
	public void verify_App_Click() {
		
		home.clickApp();		
		
	}
	
	@Test
	public void verify_Content_Click() {
		
		home.clickContent();
		
	}
	
	@Test
	public void verify_Graphics_Click() {

		home.clickGraphics();

	}
	
	@Test
	public void verify_Media_Click() {
		
		home.clickMedia();

	}
	
	@Test
	public void verify_Nfc_Click() {
		
		home.clickNfc();
	
	}
	
	@Test
	public void verify_Os_Click() {
		
		home.clickOs();
	
	}
	
	@Test
	public void verify_Preference_Click() {
		
		home.clickPreference();
	
	}
	
	@Test
	public void verify_Text_Click() {
		
		home.clickText();
	
	}
	
	@Test
	public void verify_Views_Click() {
		
		home.clickViews();		
		
	}
	

	
}
