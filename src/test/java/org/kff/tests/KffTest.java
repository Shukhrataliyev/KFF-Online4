package org.kff.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.kff.pages.CalculatorPage;
import org.kff.pages.HomePage;
import org.kff.pages.StateDataPage;
import org.kff.utilities.BrowserUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class KffTest extends TestBase {

	HomePage homePage = new HomePage(driver);
	CalculatorPage calculatorPage = new CalculatorPage(driver);
	StateDataPage stateDataPage = new StateDataPage(driver);

	//@Ignore
	@Test(priority = 1) // (description = "Verify labels and tab links are displayed", priority = 1)
	public void titleVerification() {
		
		extentLogger = report.createTest("titleVerification");
		assertEquals(driver.getTitle(),
				"Kaiser Family Foundation - Health Policy Research, Analysis, Polling, Facts, Data and Journalism",
				"HomePage is not displayed. Application is down.");
		assertTrue(homePage.search.isDisplayed());
		assertTrue(homePage.menu.isDisplayed()&&homePage.menu.isEnabled());
		
	

		homePage.search.sendKeys("insurance calculator");
		homePage.submitBtn.click();

		assertEquals(calculatorPage.himc.getText(), "Health Insurance Marketplace Calculator");
		assertEquals(calculatorPage.date.getText().substring(0, 16), "November 3, 2017");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		calculatorPage.himc.click();
		assertEquals(calculatorPage.text.getText(),
				"Note: This calculator has been updated with premiums for 2018 plans.");
		
		BrowserUtils.waitForPageToLoad(3);
		for (WebElement each : calculatorPage.listCalculatorOptons) {
            if (each.isDisplayed()) {
                //System.out.println(each.getText());
                assertTrue(each.isDisplayed());
            }
        }

		extentLogger.pass("Verified log out link displayed");
	}
   // @Ignore
	@Test(priority = 2) // (description = "Verify labels and tab links are displayed", priority = 1)
	public void titleVerification2() throws InterruptedException {

		extentLogger = report.createTest("titleVerification2");
		assertEquals(driver.getTitle(),
				"Kaiser Family Foundation - Health Policy Research, Analysis, Polling, Facts, Data and Journalism",
				"HomePage is not displayed. Application is down.");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		homePage.menu.click();
		
		
		//BrowserUtils.hover(homePage.statHealthFacts);
		
		js.executeScript("window.scrollBy(0,2000)");
		
		homePage.statHealthFacts.click();
		homePage.statHealthFactsSub.click();
		
		stateDataPage = new StateDataPage(driver);
		
		assertEquals(driver.getTitle(),
				"State Health Facts | The Henry J. Kaiser Family Foundation");
		
		assertTrue(stateDataPage.SSHF.isDisplayed());
		extentLogger.pass("Verified log out link displayed");
	}
	
	
}
