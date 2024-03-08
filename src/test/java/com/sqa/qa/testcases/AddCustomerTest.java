package com.sqa.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sqa.qa.base.TestBase;

import com.sqa.qa.pages.LoginPage;
import com.sqa.qa.pages.AccountPage;
import com.sqa.qa.pages.AddCustomerPage;

public class AddCustomerTest extends TestBase{
	LoginPage loginPage;
	AccountPage accountPage;
	AddCustomerPage addCustomerPage;
	String AccountexistUser = prop.getProperty("AccontExistUser");
	String fname = prop.getProperty("fname");
	String lname = prop.getProperty("Lname");
	String postcode = prop.getProperty("postcode") ;
	String message_AddCustomer = prop.getProperty("message_AddCustomer") ;
	String message_AddCustomer_Exist = prop.getProperty("message_AddCustomer_Exist") ;
	
	
	
	public AddCustomerTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
		addCustomerPage = loginPage.ManagerLogin();
		
		
		
	}

	
	@Test(priority=1)
	public void AddCustomer_NotExist() throws InterruptedException
	{
		addCustomerPage.AddCustomer(fname,lname,postcode);
		String result = addCustomerPage.getAlertMessageText();
		String actualText = result;
        String expectedPartialText = message_AddCustomer;
		   // Assertion using assertContains (custom assertion method)
        addCustomerPage.assertContains(actualText, expectedPartialText);
        addCustomerPage.getAlert();
		
		
	}
	
	@Test(priority=2, dependsOnMethods = "AddCustomer_NotExist")
	public void AddCustomer_Exist() throws InterruptedException
	{
		addCustomerPage.AddCustomer(fname,lname,postcode);
        addCustomerPage.getAlert();
        Thread.sleep(1000);
		addCustomerPage.AddCustomer(fname,lname,postcode);
		String result2 = addCustomerPage.getAlertMessageText();
        Assert.assertEquals(result2, message_AddCustomer_Exist);
		
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}
