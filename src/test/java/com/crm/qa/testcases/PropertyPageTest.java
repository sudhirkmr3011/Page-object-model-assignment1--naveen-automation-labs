package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
//import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.PropertyPage;
import com.crm.qa.pages.LoginPage;


public class PropertyPageTest extends TestBase {
	LoginPage loginPage;
	PropertyPage propertyPage;
	
	

	public PropertyPageTest(){
		super();
	}

	
	@BeforeMethod
	public void setUp() {
		initialization();
		
		//contactsPage = new ContactsPage();
		loginPage = new LoginPage();
	 propertyPage = new PropertyPage();
		propertyPage = loginPage.login(prop.getProperty("input"));
	}
	
	
	@Test(priority=1)
	public void Property_values_Test(){
		//propertyPage = new PropertyPage();
		propertyPage.Property_values();
	//Assert.assertEquals(homePageTitle, "CRMPRO","Home page title not matched");
	}
	
	
	
	@Test(priority=2)
	public void click_5thElement_Test(){
		//propertyPage = new PropertyPage();
		propertyPage.click_5thElement();
	//Assert.assertEquals(homePageTitle, "CRMPRO","Home page title not matched");
	}

	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	

}
