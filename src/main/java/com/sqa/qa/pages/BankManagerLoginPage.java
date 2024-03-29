package com.sqa.qa.pages;


	
	

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;
	import com.sqa.qa.base.TestBase;

	public class BankManagerLoginPage extends TestBase {
		
		//Page Factory - OR:
		@FindBy(xpath="//button[normalize-space()='Customer Login']")
		WebElement Customer_Login;
		
		@FindBy(linkText="Bank Manager Login")
		WebElement Manager_Login;

		//public String addCustomerButton;
		
		
		//Initializing the Page Objects:
		public BankManagerLoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		public AccountPage CustomerLogin(String username)
		{
			Customer_Login.click();
			WebElement dropdownElement = driver.findElement(By.xpath(prop.getProperty("dropdown")));

	        // Create a Select object
	        Select dropdown = new Select(dropdownElement);

	        // Select an option by visible text
	        dropdown.selectByVisibleText(username);
	        String path=prop.getProperty("Login");
	        
	        driver.findElement(By.xpath(path)).click();
	        
	        return new AccountPage();

			
		}
		public void ManagerLogin()
		{
			Manager_Login.click();
		}

		public void addCustomerButton() {
			Customer_Login.click();
			
		}
		
	}


