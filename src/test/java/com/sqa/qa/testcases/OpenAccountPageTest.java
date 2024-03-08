package com.sqa.qa.testcases;



	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import com.sqa.qa.base.TestBase;

	import com.sqa.qa.pages.LoginPage;
	import com.sqa.qa.pages.OpenAccountPage;
	import com.sqa.qa.pages.AccountPage;
	import com.sqa.qa.pages.AddCustomerPage;

	public class OpenAccountPageTest extends TestBase{
		LoginPage loginPage;
		OpenAccountPage openAccountPage;
		String OpenAccount_username = prop.getProperty("OpenAccount_username");
		
		
		
		
		public OpenAccountPageTest()
		{
			super();
		}
		
		@BeforeMethod
		public void setUp(){
			initialization();
			loginPage = new LoginPage();
			openAccountPage = loginPage.ManagerLogin1();
			
			
			
		}
		
		@Test(priority=1)
		public void OpenAccount() throws InterruptedException{
			openAccountPage.OpenAccount_button.click();
			openAccountPage.AddCustomer(OpenAccount_username);
		}
		
		
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
		
		
		
		

	}



