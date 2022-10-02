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
			
	}
	
}
