package org.kff.pages;

import java.util.ArrayList;
import java.util.List;

import org.kff.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {

	
	private WebDriver driver;

	public CalculatorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(Driver.getDriver(), this);
	} 
	
	
	@FindBy(id="zip-prompt")
	public WebElement stateText; 
	
	@FindBy(id="state-wrapper")
	public WebElement stateDropDown; 
	
	@FindBy(css="p:contains(^Enter your zip code$)")  //xpath="//p[.='Enter your zip code']"
	public WebElement zipcodeText; 
	
	@FindBy (name="zip")
	public WebElement zipcodeBox;

	@FindBy(css="p:contains(^Select county$)")  //xpath="//p[.='Select county']"
	public WebElement countyText; 
	
	@FindBy(id="locale-inner")
	public WebElement countyDropDown; 
	
	@FindBy(css="p:contains(^Enter income as$)")  //xpath="//p[.='Enter income as']"
	public WebElement incomeText; 
	
	@FindBy(name="income-type")
	public WebElement incomeDropDown; 
	
	@FindBy(id="income-prompt")
	public WebElement householdText; 
	
	@FindBy(name="income")
	public WebElement incomeBox; 
	
	@FindBy(className="prompt-with-tip")
	public WebElement coverageavailableText; 
	
	@FindBy(name="employer-coverage")
	public WebElement coverageDropDown; 
	
	@FindBy(xpath="(//article//a)[1]")
	public WebElement himc; 
	
	@FindBy(xpath="(//p[@class = 'byline'])[1]")
	public WebElement date; 

	@FindBy(xpath="(//div[@id='subsidy-calculator-new']//strong)[1]")
	public WebElement text; 

	
	

	
	
	
	
	
	
}
