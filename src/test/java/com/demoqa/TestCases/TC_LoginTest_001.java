package com.demoqa.TestCases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.demoqa.PageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClassdmq 
{
	@Test
	public void loginTest() throws InterruptedException
	{
		extentLogger = extentReport.createTest("To Check Login into Page");
		driver.navigate().to("https://demoqa.com/login");
		driver.manage().window().maximize();
		extentLogger.log(Status.INFO, "Browser Maximized Successfully");
		
		LoginPage lp=new LoginPage(driver);
		
		//lp.clickbookStoreApplication();
		//lp.clickMainlogin();
		lp.clicktxtuserName();
		lp.settxtuserName(username);
		lp.clicktxtPassword();
		lp.settxtPasswod(password);
		lp.btnLogin();
		Thread.sleep(2000);
		String temp= CaptureScreen();
		extentLogger.fail(MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		extentLogger.log(Status.INFO, "Check for Login");
		extentLogger.log(Status.FAIL, "Login UnSuccessfull");
		
		
		
		
		
	//	lp.btnlogout();
//		WebElement logout = driver.findElement(By.xpath("//*[contains(text(),'Log out')]"));
//		logout.click();
		}
	
}
