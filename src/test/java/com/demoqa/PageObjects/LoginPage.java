package com.demoqa.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
		WebDriver localdriver;
		public LoginPage(WebDriver remotedriver)
		{
			localdriver = remotedriver;
			PageFactory.initElements(remotedriver, this);
			
		}
		
		//WebElement txtUserName = localdriver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
		@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[6]/span/div/div[1]")
		WebElement bookStoreApplication;
		
	//	Select select = new Select(bookStoreApplication);
		
		@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[1]/span")
		@CacheLookup
		WebElement btnlogin;
		
		@FindBy(id="userName")
		WebElement userName;
		
		@FindBy(id="password")
		WebElement Password;
		
		@FindBy(id="login")
		WebElement login;
		
		//@FindBy(xpath="//*[contains(text(),'Log out')]")
		@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div[3]/button")
		WebElement logout;
		
		
		
		public void clickbookStoreApplication()
		{
			bookStoreApplication.click();
		}
		
		public void clickMainlogin()
		{
			btnlogin.click();
		}
		
		public void clicktxtuserName()
		{
			userName.click();
		}
		
		public void settxtuserName(String uname)
		{
			userName.sendKeys(uname);
		}
		
		public void clicktxtPassword()
		{
			Password.click();
		}
		
		public void settxtPasswod(String pass)
		{
			Password.sendKeys(pass);
		}
		
			public void btnLogin()
		{
				login.click();
		}

		public void btnlogout()
		{
			logout.click();
		}

}
