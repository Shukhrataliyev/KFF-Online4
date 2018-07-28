package org.kff.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {

	
	private WebDriver driver;

	public CalculatorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
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
	
	//sssss
	@FindBy(xpath="//div[@class='form-item form-item-people clearfix']/p")
	public WebElement familyMembers; 
	
	@FindBy(name="people")
	public WebElement familyMemberDropDown; 
	
	@FindBy(xpath="//div[@class='form-item form-item-adults clearfix']/p")
	public WebElement numberOfAdults; 
	
	@FindBy(name="adult-count")
	public WebElement adultCount; 
	
	@FindBy(className="adult-info-wrapper adult-info0")
	public WebElement adultAge; 
	
	@FindBy(className="adults[0][age]")
	public WebElement age; 
	
	@FindBy(name="adults[0][tobacco]")
	public WebElement usesTobaco; 
	
	@FindBy(xpath="//div[@class='form-item form-item-children clearfix']/p")
	public WebElement numberOfChildren; 
	
	@FindBy(name="child-count")
	public WebElement childCount; 
	
	
	
	
}
