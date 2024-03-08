package com.sqa.qa.testcases;


	
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import com.sqa.qa.base.TestBase;

	import com.sqa.qa.pages.LoginPage;
	import com.sqa.qa.pages.AccountPage;
	import com.sqa.qa.pages.TransactionsPage;

	public class TransactionsPageTest extends TestBase{
		LoginPage loginPage;
		TransactionsPage customerTransactionPage;
		
		String date = prop.getProperty("ValidationDate");
		String Startdate = prop.getProperty("StartDate");
		String Enddate = prop.getProperty("EndDate");
		
		String AccountexistUser = prop.getProperty("AccontExistUser");
		
		
		
		public TransactionsPageTest()
		{
			super();
		}
		
		@BeforeMethod
		public void setUp(){
			initialization();
			loginPage = new LoginPage();
			customerTransactionPage = loginPage.CustomerLogin1(AccountexistUser);
			
			
		}
		


		@Test(priority=1)
		public void Verify_Deposit_With_ValideAmmount()
		{
			customerTransactionPage.Filter(Startdate, Enddate);
			
		}
		
		
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
		
		
		
		

	}


