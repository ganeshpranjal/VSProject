package com.sqa.qa.pages;


	
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;


import com.sqa.qa.pages.HomePage;
import com.sqa.qa.base.TestBase;

	public class CustomerLoginPage extends TestBase {
		
		@FindBy(xpath="//button[@class='btn btn-primary btn-lg']")
		WebElement customerloginbutton;
		@FindBy(xpath="//option[@value='21']")
		WebElement namefrdropdown;
		@FindBy(xpath="//button[@type='submit']")
		WebElement loginbutton;
		@FindBy(xpath="//div[@class='ng-scope']")
		WebElement nextpage;
		
		//Initializing the Page Objects:
		public CustomerLoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		
	}


