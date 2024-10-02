package myAppAndroid.myAppTestCases;

import org.testng.annotations.Test;

public class TestCase_02 extends TestBase {
	
	@Test(enabled = true)
	public void test_Case_Long_Click() {

		home.clickViews();

		views.longPress(); 
		
	}
	
	@Test
	public void test_Case_Scroll() {
		
		home.clickViews();

		views.scrollToSwitch();
		
		views.clickSwitch();
	}
	
}
