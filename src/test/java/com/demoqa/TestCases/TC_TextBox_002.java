package com.demoqa.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.demoqa.PageObjects.TextBoxPage;

public class TC_TextBox_002 extends BaseClassdmq 
{
	@Test
	public void main() throws InterruptedException
	{
	extentLogger = extentReport.createTest("Verify Texbox Input");
	//driver.navigate().to(baseURL);
	driver.get("https://demoqa.com/text-box");
	driver.manage().window().maximize();
	extentLogger.log(Status.INFO, "Browser Maximized Successfully");
	TextBoxPage tp = new TextBoxPage(driver);
	
	tp.userName(fullname);
	tp.userEmail(username);
	tp.currentAddress(CurrentAdd);
	tp.permanentAddress(PermanentAdd);
//	WebElement sub = driver.findElement(By.id("submit"));
//	sub.click();
	extentLogger.log(Status.PASS, "Data Input Successful");
	
	String temp= CaptureScreen();
	extentLogger.pass(MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
	
	
	}	
	
}
