package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Agent_DetailsPage extends TestBase{
	
	
	
	
	@FindBy(xpath="//*[@id='content' and @class='layout-']//h1")
	WebElement Agent;
	
	
	
	public Agent_DetailsPage() {
		PageFactory.initElements(driver, this);
	}
	
	

	public String validateAgent_Name() {
		
		System.out.println(Agent.getText());
		return Agent.getText();
		
		
	}
	
}
