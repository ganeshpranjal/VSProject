package com.sqa.qa.pages;


	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.sqa.qa.base.TestBase;

	public class HomePage extends TestBase {
		
		@FindBy(xpath="//button[normalize-space()='Customer Login']")
		WebElement Customer_Login;
		
		@FindBy(linkText="Bank Manager Login")
		WebElement Manager_Login;
		

		@FindBy(xpath = "//span[@class='title']")
		WebElement HomePageValidation;

		

		// Initializing the Page Objects:
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		public String verifyHomePageTitle(){
			return driver.getTitle();
		}
		
		
		public boolean verifyCorrectPage()
		{
			return HomePageValidation.isDisplayed();
		}

		public void clickOnNewContactLink() {
			// TODO Auto-generated method stub
			
		}

		public void ManagerLogin() {
			// TODO Auto-generated method stub
			Manager_Login.click();
		}

		
		
		
		
		
		
		
		

	}



