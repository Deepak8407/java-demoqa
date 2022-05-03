package com.demoqa.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButton {
	WebDriver lcldriver;
	public RadioButton(WebDriver rmtdriver)
	{
		lcldriver = rmtdriver;
		PageFactory.initElements(rmtdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label")
	WebElement rdobtnYes;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label")
	WebElement rdobtnImpressive;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[4]/label")
	WebElement rdobtnNo;
	
	public void SetrdobtnYes()
	{
		rdobtnYes.click();
	}
	public void SetrdobtnImpressive()
	{
		rdobtnImpressive.click();
	}
	public void CheckrdobtnNo()
	{
		rdobtnNo.isEnabled();
	}
	
}
