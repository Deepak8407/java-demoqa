package com.demoqa.TestCases;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.demoqa.Utilities.ReadConfig;

public class BaseClassdmq {
	//public String baseURL="https://demoqa.com/profile";
	//public String baseURL="https://demoqa.com/text-box";
	static ReadConfig rcon = new ReadConfig();
	public static String username = rcon.getUserName();
	//public static String username = "deepakyadav8407@gmail.com";
	public String password = "Deepak@7890";
	public static String fullname = "Deepak Yadav";
	public static String CurrentAdd = "At.Pune";
	public static String PermanentAdd ="Wakad, Pune, 411057";
	
	public static WebDriver driver;
	public static ExtentReports extentReport;
	public static ExtentSparkReporter sparkReporter;
	public static ExtentTest extentLogger;
	
	@BeforeTest
	public void setup()
	{
		extentReport = new ExtentReports();
		sparkReporter = new ExtentSparkReporter(new File(System.getProperty("user.dir")+ "\\Reports\\extent-report.html"));
		extentReport.attachReporter(sparkReporter);
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
	}
	@AfterTest
	public void teardown(/*ITestResult result*/)throws IOException
	{
//		if(result.getStatus()==ITestResult.FAILURE)
//		{
//	String temp= CaptureScreen();
//	extentLogger.fail(MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
//		}
		extentReport.flush();
		driver.quit();
	}
	
	public String CaptureScreen()
	{
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"/Screenshots/"+System.currentTimeMillis()+".png";
		File dest=new File(path);
		
		try 
			{
				FileUtils.copyFile(src, dest);
			} catch (IOException e) 
			{
				// TODO Auto-generated catch block
			//	e.printStackTrace();
			System.out.println("Capture Failed"+e.getMessage());
		}
		return path;
	}

}
	

