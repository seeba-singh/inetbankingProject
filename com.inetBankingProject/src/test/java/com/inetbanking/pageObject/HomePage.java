package com.inetbanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	@FindBy(xpath = "//div[@id='dismiss-button']")
	WebElement popup2Element;
	

	
	@FindBy(css = "svg[fill='#5F6368']")
	WebElement popupElement;

	@FindBy(xpath = "//a[text()='New Customer']")
	WebElement newCustomer;

	@FindBy(xpath = "//input[@name='name']")
	WebElement cusname;

	@FindBy(xpath = "//input[@value='f']")
	WebElement rad1;

	@FindBy(xpath = "//input[@name='dob']")
	WebElement dobelement;

	@FindBy(xpath = "//textarea[@name='addr']")
	WebElement addrelement;

	@FindBy(xpath = "//input[@name='city']")
	WebElement cityelElement;

	@FindBy(xpath = "//input[@name='state']")
	WebElement state;

	@FindBy(xpath = "//input[@name='pinno']")
	WebElement pinno;

	@FindBy(xpath = "(//input[@name='telephoneno'])[1]")
	WebElement telephoneno;

	@FindBy(xpath = "(//input[@name='emailid'])[1]")
	WebElement emailid;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//input[@name='sub']")
	WebElement subElement;

	@FindBy(xpath = "//div[@id='dismiss-button']")
	WebElement closepopElement;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void createNewCustomer() {
		newCustomer.click();

	}

	public void enterCusName(String customername) {
		try {

			cusname.clear();
			cusname.sendKeys("Raman Teke");
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	public void selectGender() {
		rad1.click();
	}

 
	

	

	public void enterCusAdd(String Address) {
		addrelement.clear();
		addrelement.sendKeys(Address);

	}

	public void enterCity(String CITY) {

		cityelElement.sendKeys(CITY);

	}

	public void enterState(String State) {
		state.sendKeys(State);
	}

	public void enterPin(String PIN) {

		pinno.sendKeys(PIN);
	}

	public void enterMobileNo(String MB_NO) {
		telephoneno.sendKeys(MB_NO);

	}

	public void enterCusEmail(String Email) {
		emailid.sendKeys(Email);
	}

	public void enterPassword(String Cuspass) {
		password.sendKeys(Cuspass);

	}

	public void clickSubButt() {
		subElement.click();

	}

	public void closePopUp1() {
		popupElement.click();

	}
	public void closePopUp2() {
		popup2Element.click();

	}


	public void dobPicker(String DOB) {
		dobelement.sendKeys(DOB);;
		
	}

}