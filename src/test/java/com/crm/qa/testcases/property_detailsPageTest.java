package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.PropertyPage;
import com.crm.qa.pages.property_detailsPage;

public class property_detailsPageTest extends TestBase{
	LoginPage loginPage;
PropertyPage propertyPage;
property_detailsPage property_details_page;
	
	public property_detailsPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
		propertyPage = loginPage.login(prop.getProperty("input"));
		property_details_page=propertyPage.click_5thElement();
	}

	@Test(priority=1)
	public void Agent_Name_test(){
		property_details_page.Agent_Name();
	}
	
	
	@Test(priority=2)
	public void Agent_Number_test(){
		property_details_page.Agent_Number();
	
}
	
	
	@Test(priority=3)
	public void Agent_Logo_test(){
		property_details_page.Agent_Logo_value();
	}
	
	
	@Test(priority=4)
	public void validate_Agent_Logo_test(){
		
		boolean flag = property_details_page.validate_Agent_Logo();
		Assert.assertTrue(flag);
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}

