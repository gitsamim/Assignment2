package com.assignment.testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.assignment.pageobject.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass
{

	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		
		String exp1 = "abc";
		String exp2 = "abc";
		
		lp.clickSignIn();
		String email=randomestring()+"@gmail.com";
		lp.enterEmail(email);
		lp.createAccount();
		lp.enterFname(exp1);
		lp.enterLname(exp2);
		lp.enterPassword("AS1234tgb6");
		lp.address("abc road");
		lp.cityName("bangalore");
		lp.state();
		lp.postCode("66221");
		lp.country();
		lp.mobileNo("9999999999");
		lp.aliasAddress("www road");
		lp.register();
		
		String s = exp1+exp2;
		lp.validate(s);
	/*	
		addcust.clickAddNewCustomer();
		
		logger.info("providing customer details....");
		
		
		addcust.custName("Samim");
		addcust.custgender("male");
		addcust.custdob("06","20","1980");
		Thread.sleep(5000);
		addcust.custaddress("INDIA");
		addcust.custcity("KOLKATA");
		addcust.custstate("WB");
		addcust.custpinno("713131");
		addcust.custtelephoneno("8918697677");
		
		String email=randomestring()+"@gmail.com";
		addcust.custemailid(email);
		addcust.custpassword("abcdef");
		addcust.custsubmit();
		
		Thread.sleep(3000);
		
		logger.info("validation started....");
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed....");
			
		}
		else
		{
			logger.info("test case failed....");
			captureScrenshot(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
		
		*/
			
	}
	
}