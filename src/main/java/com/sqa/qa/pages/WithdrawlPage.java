package com.sqa.qa.pages;


	
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.sqa.qa.base.TestBase;

	public class WithdrawlPage extends TestBase {
		
		@FindBy(xpath="//button[@ng-click='withdrawl()']")
		WebElement withdrawlbutton;
		@FindBy(xpath="//input[@type='number']")
		WebElement withdrawamount;
		@FindBy(xpath="//button[@type='submit']")
		WebElement submitbutton;
		

}
