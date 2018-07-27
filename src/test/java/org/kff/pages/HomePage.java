package org.kff.pages;

import org.kff.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id="search-field")
	public WebElement search;

	@FindBy(xpath="//a[.='menu']")
	public WebElement menu;
	
	@FindBy(css="a[href='/statedata']")
	public WebElement statHealthFacts;
	
	@FindBy(css="a[href='/statedata']")
	public WebElement statHealthFactssub;
	
	@FindBy(xpath="//a")
	public WebElement links;
	
	@FindBy(xpath="//h4[.='Featured State Data Resources']")
	public WebElement featuredStateData;
	
	@FindBy(css="h3.kicker")
	public WebElement newUpdatedIndicator;
	
	
	
	
	
	
	

	

}