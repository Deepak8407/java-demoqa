package com.demoqa.PageObjects;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	public static ExtentReports extentReport;
	public static ExtentSparkReporter sparkReporter;
	public static ExtentTest extentLogger;
	
	public static void createInstance() {
		extentReport = new ExtentReports();
		sparkReporter = new ExtentSparkReporter(new File(System.getProperty("user.dir")+ "\\Reports\\extent-report.html"));
		extentReport.attachReporter(sparkReporter);
	}
	
}
