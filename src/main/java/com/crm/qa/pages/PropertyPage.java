package com.crm.qa.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class PropertyPage extends TestBase {

	
	@FindBy(xpath="//span[@class='search-input-location-placeholder-1 ']")
	WebElement input_value;
	
	
	@FindBy(xpath="//ul[@class='listing-results clearfix js-gtm-list']/li//a[@class='listing-results-price text-price']")    
	List<WebElement> pr;
	
	public PropertyPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void Property_values() {
		
		
		
		
		
		  List<WebElement> price_list=driver.findElements(By.xpath("//ul[@class='listing-results clearfix js-gtm-list']/li//a[@class='listing-results-price text-price']"));

	      
	      List <Integer> prices =new ArrayList<Integer>();
	      System.out.println("Propery Values are-----------" );
	      for(int i=0;i<price_list.size();i++){
	    	  String Values= price_list.get(i).getText();
	    	  String price=Values.replaceAll("[^0-9]","");
	    	  int price_value=Integer.parseInt(price);
	    	  int[] prop_rates=new int[price_list.size()];
	    	  prop_rates[i]=price_value;
	    	  
	    	  prices.add(prop_rates[i]);
	    	  System.out.println("£"+prices.get(i));
	      }
	      
	     // System.out.println("list values are" +prices);
	      //Collections.sort(ll);
	      
	      Collections.sort(prices, Collections.reverseOrder());
	      
	      System.out.println("sorted values in descending order are : -----------");
	      for(int i=0;i<price_list.size();i++){
	      System.out.println("£"+prices.get(i));
	      
	      
	      }
	      
	      
	      
	      
	}

	
	public property_detailsPage click_5thElement() {
		
		
		WebElement ees=pr.get(4);
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	  	js.executeScript("arguments[0].click();", ees);		
		return new property_detailsPage();
	}
	
//	public DealsPage clickOnDealsLink(){
//		dealsLink.click();
//		return new DealsPage();
//	}
	
	public void clickOnNewContactLink(){
		
		
	}}
	
	
	
	
	
	
	


