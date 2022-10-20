package com.inetbanking.testCases;

import java.io.IOException;
import java.time.Duration;

import javax.swing.Popup;

import org.apache.hc.core5.http2.hpack.HPackDecoder;
import org.checkerframework.checker.units.qual.h;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

public class NewCusTC_01 extends TestBase {

	HomePage hp;
	LoginPage lp;
	
@Test()
public void addingNewCus() throws IOException {
	lp=new LoginPage(driver);
	lp.EnteruserID("mngr448612");
	lp.EnterPass("EnEzynE");
	lp.clickLogButt();
	hp=new HomePage(driver);
	hp.createNewCustomer();
	hp.enterCusName("Seeba Singh");
		hp.selectGender("Female");
		hp.dobPicker("Dec");
		hp.dobPicker("30");
		hp.dobPicker("1995");
		hp.enterCusAdd("Mirchandani Palms");
		hp.enterCity("Pune");
		hp.enterState("Maharashtra");
		hp.enterPin("411027");
		hp.enterMobileNo("9347326637");
		hp.enterCusEmail("seebasingh30@gmail.com");
		hp.enterPassword("");
		hp.clickSubButt();
		
		
}
}