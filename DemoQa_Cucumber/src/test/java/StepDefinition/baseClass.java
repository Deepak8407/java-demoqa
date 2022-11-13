package StepDefinition;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import PageObjects.AddCustomerPage;
import PageObjects.LoginPage;

public class baseClass {
	public WebDriver driver;
	public LoginPage lp;
	public AddCustomerPage acp;
	
	//Created for generatind random string for unique email id
	public static String randomstring()
	{
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}
}
