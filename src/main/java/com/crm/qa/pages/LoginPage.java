package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(xpath="//span[@class='search-input-location-placeholder-1 ']")
	WebElement input_value;
	
	@FindBy(xpath="//button[@id='search-submit']")
	WebElement submitBtn;
	
	
	
	
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	

	
	public PropertyPage login(String input){
		
		Actions actions = new Actions(driver);
		actions.moveToElement(input_value);
		actions.click();
		actions.sendKeys(input);
		actions.build().perform();
		submitBtn.click();
		    	
		return new PropertyPage();
	}
	
}
