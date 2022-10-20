

package com.inetbanking.utilities;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utility {
	WebDriver driver;
	public static void captureScreenshotOf(WebDriver driver, String screenshotname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./Screenshot/freecrm_"+"screenshotname"+".png");
		
		FileHandler.copy(source, target);
		
	}
	public void handleAlert1() {
		try {
			Alert alert=driver.switchTo().alert();
			alert.accept();
		
		} catch (NoAlertPresentException e) {
			System.out.println("Alert is not present");
			e.getStackTrace();
			
		}
	}
	
		
		
		
	}



