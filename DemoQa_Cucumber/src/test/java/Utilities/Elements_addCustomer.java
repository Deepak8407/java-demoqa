package Utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Elements_addCustomer {

	public WebDriver driver;
	
	
	
	public void Elements_add() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/Admin/Customer/List");
		
		List<WebElement> pgAddCustElements = driver.findElements(By.xpath("//div"));
		
	}
}
