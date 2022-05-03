package com.demoqa.TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.demoqa.PageObjects.CheckBox;

public class TC_CheckBox_003 extends BaseClassdmq
{
	@Test
	public void CheckboxTest()
	{
		extentLogger = extentReport.createTest("To Check Click on CheckBox");
		driver.navigate().to("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		extentLogger.log(Status.INFO, "Browser Maximized Successfully");
		
		CheckBox cb=new CheckBox(driver);
		
		cb.Settoggleclick();
		cb.Setdesktoggle();
		cb.Setnotes();
		extentLogger.log(Status.INFO, "Click on Toggle Click");
		extentLogger.log(Status.PASS, "Toggle Click ScuccessFull");
		//extentLogger.log(Status.FAIL, "Toggle Click Failed");
		
		String temp= CaptureScreen();
		extentLogger.pass(MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		//extentLogger.fail(MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
	}
}
