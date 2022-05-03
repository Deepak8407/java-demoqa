package com.demoqa.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBox {
	WebDriver lcldriver;
	public CheckBox(WebDriver rmtdriver)
	{
		lcldriver = rmtdriver;
		PageFactory.initElements(rmtdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"tree-node\"]/ol/li/span/button")
	WebElement toggleclick;
	
	@FindBy(xpath="//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button")
	WebElement desktoggle;
	
	@FindBy(xpath="//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[1]/span/label/span[3]")
	WebElement notes;
	
	public void Settoggleclick()
	{
		toggleclick.click();
	}
	public void Setdesktoggle()
	{
		desktoggle.click();
	}
	public void Setnotes()
	{
		notes.click();
	}
	
}
