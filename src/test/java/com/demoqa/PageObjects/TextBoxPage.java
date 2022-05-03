package com.demoqa.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage {
	WebDriver localdriver;
	public TextBoxPage(WebDriver remotedriver)
	{
		localdriver = remotedriver;
		PageFactory.initElements(remotedriver, this);
	}
	@FindBy(id="userName")
	WebElement TxtFullName;
	
	@FindBy(id="userEmail")
	WebElement TxtEmail;
	
	@FindBy(id="currentAddress")
	WebElement TxtCurrentAddress;
	
	@FindBy(id="permanentAddress")
	WebElement TxtPermtAddress;
	
	@FindBy(id="submit")
	WebElement Txtsubmit;
	
	public void userName(String fname)
	{
		TxtFullName.sendKeys(fname);
	}
	
	public void userEmail(String email)
	{
		TxtEmail.sendKeys(email);
	}
	
	public void currentAddress(String cadd)
	{
		TxtCurrentAddress.sendKeys(cadd);
	}
	
	public void permanentAddress(String padd)
	{
		TxtPermtAddress.sendKeys(padd);
	}
	
	public void submit1()
	{
		Txtsubmit.click();
	}

	
	}

