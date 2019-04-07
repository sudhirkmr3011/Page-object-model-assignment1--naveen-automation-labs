package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class property_detailsPage extends TestBase {

	@FindBy(xpath = "//*[@class='ui-agent__name']")
	WebElement AgentName;
	
	
	
	@FindBy(xpath = "//*[@class='ui-agent__tel ui-agent__text']")
	WebElement AgentNumber;
	
	@FindBy(xpath = "//*[@class='ui-agent__logo']/img")
	WebElement AgentLogoValue;
	
	@FindBy(xpath="//img[contains(@class,'js-lazy-loaded')]")
	WebElement AgentLogo;
	
	static String Agent_detail;
	
	public property_detailsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public Agent_DetailsPage Agent_Name(){
		System.out.println("Agent Name is : "+AgentName.getText());
		Agent_detail=AgentName.getText();
		AgentName.click();
		return new Agent_DetailsPage();
	}
	
	
	
	public String Agent_Detail(){
		return Agent_detail;
	}
	
	
	public void Agent_Number(){
		String Values= AgentNumber.getText();
  	    String Agent_no=Values.replaceAll("[^0-9]","");
		System.out.println("Agent Number is : "+Agent_no);
		
	}
	
	
public void Agent_Logo_value(){
		
		System.out.println("Agent logo value : "+AgentLogoValue.getAttribute("alt"));
	}
public boolean validate_Agent_Logo(){
	
	
	System.out.println("Validating Agent logo "+AgentLogo.isDisplayed());
	return AgentLogo.isDisplayed();
	
}

}
