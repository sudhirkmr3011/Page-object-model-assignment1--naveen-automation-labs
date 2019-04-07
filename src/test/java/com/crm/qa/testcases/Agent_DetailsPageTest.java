package com.crm.qa.testcases;

import org.apache.commons.exec.util.StringUtils;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Agent_DetailsPage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.PropertyPage;
import com.crm.qa.pages.property_detailsPage;

public class Agent_DetailsPageTest extends TestBase{
	LoginPage loginPage;
PropertyPage propertyPage;
property_detailsPage property_details_page;
Agent_DetailsPage agent_DetailsPage;
String Agentdetail;
	public Agent_DetailsPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
		propertyPage = loginPage.login(prop.getProperty("input"));
		property_details_page=propertyPage.click_5thElement();
		agent_DetailsPage=property_details_page.Agent_Name();
		Agentdetail=property_details_page.Agent_Detail();
	}

	@Test(priority=1)
	public void validateAgentNametest(){
		
		
		String Agent_detail=Agentdetail;
		
		String Agent_name=agent_DetailsPage.validateAgent_Name();
		
		//System.out.println("Agentdetail " + Agent_detail);
		//System.out.println("Agent_name " + Agent_name);

		Boolean flag=Agent_name.toLowerCase().contains(Agent_detail.toLowerCase());

		
		Assert.assertTrue(flag);
		if(flag) {
			System.out.println("Agent name is present on page");
		}
		else {
			System.out.println("Agent name is not present on page");
		}
		
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
