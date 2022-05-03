package com.demoqa.TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.demoqa.PageObjects.CheckBox;
import com.demoqa.PageObjects.RadioButton;

public class TC_RadioButton_004 extends BaseClassdmq
{
	@Test
	public void RadioButtonTest() throws IOException, InterruptedException 
	{
		extentLogger = extentReport.createTest("Verify Click on RadioButton");
		driver.navigate().to("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		extentLogger.log(Status.INFO, "Browser Maximized Successfully");
		
		RadioButton rb=new RadioButton(driver);
		
		rb.SetrdobtnYes();
		extentLogger.log(Status.INFO, "Clicked on RadioButton Yes");
		rb.SetrdobtnImpressive();
		extentLogger.log(Status.INFO, "Clicked on RadioButton Impressive");
		rb.CheckrdobtnNo();
		
		extentLogger.log(Status.PASS, "Radio Button Check Successfully");
		//extentLogger.log(Status.FAIL, "Toggle Click Failed");
		Thread.sleep(2000);
		String temp= CaptureScreen();
		extentLogger.pass(MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		//extentLogger.fail(MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
	}
}
