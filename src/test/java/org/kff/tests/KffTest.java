package org.kff.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.kff.pages.CalculatorPage;
import org.kff.pages.HomePage;
import org.kff.pages.StateDataPage;
import org.kff.utilities.BrowserUtils;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class KffTest extends TestBase {

	HomePage homePage = new HomePage(driver);
	CalculatorPage calculatorPage = new CalculatorPage(driver);
	StateDataPage stateDataPage = new StateDataPage(driver);

	@Ignore
	@Test(priority = 1) // (description = "Verify labels and tab links are displayed", priority = 1)
	public void titleVerification() {
		assertEquals(driver.getTitle(),
				"Kaiser Family Foundation - Health Policy Research, Analysis, Polling, Facts, Data and Journalism",
				"HomePage is not displayed. Application is down.");
		assertTrue(homePage.search.isDisplayed());
		assertTrue(homePage.menu.isDisplayed()&&homePage.menu.isEnabled());
		
	

		homePage.search.sendKeys("insurance calculator");
		homePage.submitBtn.click();

		assertEquals(calculatorPage.himc.getText(), "Health Insurance Marketplace Calculator");
		assertEquals(calculatorPage.date.getText().substring(0, 16), "November 3, 2017");

		calculatorPage.himc.click();
		assertEquals(calculatorPage.text.getText(),
				"Note: This calculator has been updated with premiums for 2018 plans.");

		assertTrue(calculatorPage.stateText.isDisplayed());
		assertTrue(calculatorPage.householdText.isDisplayed());
	}

	@Test(priority = 2) // (description = "Verify labels and tab links are displayed", priority = 1)
	public void titleVerification2() throws InterruptedException {

		assertEquals(driver.getTitle(),
				"Kaiser Family Foundation - Health Policy Research, Analysis, Polling, Facts, Data and Journalism",
				"HomePage is not displayed. Application is down.");

		homePage.menu.click();
		
		
		BrowserUtils.hover(homePage.statHealthFacts);
		homePage.statHealthFacts.click();
		homePage.statHealthFactsSub.click();
		
		stateDataPage = new StateDataPage(driver);
		
		assertEquals(driver.getTitle(),
				"State Health Facts | The Henry J. Kaiser Family Foundation");
		
		assertTrue(stateDataPage.SSHF.isDisplayed());
		
	}
}
