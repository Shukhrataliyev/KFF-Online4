package org.kff.tests;

import org.kff.pages.HomePage;
import org.kff.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase{
	
	HomePage homePage = new HomePage(driver);
	String expectedTitle = "Kaiser Family Foundation - Health Policy Research, Analysis, Polling, Facts, Data and Journalism";
	
	@Test(priority = 1, groups = {"smoke"})
	public void verifyTitle() {
		Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
		Assert.assertTrue(homePage.menu.isDisplayed());
		Assert.assertTrue(homePage.search.isDisplayed());
	}
	
	@Test
	public void clickMenu() {
		
		homePage.menu.click();
		homePage.statHealthFacts.click();
		//homePage.statHealthFactssub.click();
		
	}
	

}
