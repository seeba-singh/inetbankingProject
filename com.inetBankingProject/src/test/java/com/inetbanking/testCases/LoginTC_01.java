package com.inetbanking.testCases;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObject.LoginPage;
import com.inetbanking.testBase.TestBase;

public class LoginTC_01 extends TestBase{
	LoginPage lp;
	HomePage hp;
	@Test(priority = 1)
	public void TC_001() {
	lp=new LoginPage(driver);
	lp.EnteruserID("mngr448612");
	lp.EnterPass("EnEzynE");
	lp.clickLogButt();
	if (driver.getPageSource().contains("HomePage")) {
		Assert.assertTrue(true);
		System.out.println("Login is Successful......");
	}
	else {
		Assert.assertTrue(false);
		System.out.println("Login is failed.....");
		
	}
		
}
	
		
		
		
		
	}