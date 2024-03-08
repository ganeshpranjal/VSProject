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
	import com.sqa.qa.pages.CustomersPage;

	public class CustomersPageTest extends TestBase{
		LoginPage loginPage;
		CustomersPage customersPage;
		String Customers_username = prop.getProperty("Customers_username");
		
		
		
		
		public CustomersPageTest()
		{
			super();
		}
		
		@BeforeMethod
		public void setUp(){
			initialization();
			loginPage = new LoginPage();
			customersPage = loginPage.ManagerLogin2();
		}
		
		@Test(priority=1)
		public void DeleteCustomerEntry() throws InterruptedException{
			customersPage.DeleteEntry(Customers_username);
		}
		
		
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
		
		
		
		

	}



