package StepDefinition;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import PageObjects.AddCustomerPage;
import PageObjects.LoginPage;
import io.cucumber.java.en.*;

public class Steps extends baseClass {
	
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		lp=new LoginPage(driver);
		
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		
		driver.get(url);
//				Wait wait = new FluentWait(driver)
//				.withTimeout(Duration.ofSeconds(30))
//				.pollingEvery(Duration.ofSeconds(30))
//                .ignoring(ElementClickInterceptedException.class);
		driver.manage().window().maximize();
	 }

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
		lp.setUserName(email);
		lp.setPassword(password);
	}
	@Then("User click on Login button")
	public void user_click_on_login_button() {
		lp.clickbtnLogin();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) {
		
		if(driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			Assert.assertTrue(false);
		} else {
			Assert.assertEquals(title, driver.getTitle());
			
		}
	
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		lp.clicklnkLogout();
		
	}

	@Then("close browser")
	public void close_browser() {
	   driver.quit();
	}
	
	
	//Steps for add new Customer------------------------------------------
	
	@Then("User can view Dashboard")
	public void user_can_view_dashboard() {
		acp=new AddCustomerPage(driver);
		Assert.assertEquals("Dashboard / nopCommerce administration", acp.getPageTitle());
	}

	@When("User click on customer menu")
	public void user_click_on_customer_menu() throws InterruptedException {
		Thread.sleep(3000);
		acp.clCustmenu();
	}

	@When("Click on customer Menu Item")
	public void click_on_customer_menu_item() {
		
	}

	@When("Click on Add new button")
	public void click_on_add_new_button() {
		acp.clAddnewbtn();
	}

	@Then("User can view Add new customer page")
	public void user_can_view_add_new_customer_page() {
		Assert.assertEquals("Add a new customer / nopCommerce administration", acp.getPageTitle());
	}

	@When("User enter customer info")
	public void user_enter_customer_info() {
		String email=randomstring()+"@gmail.com";
		acp.getcEmailtxt(email); 
		acp.getcPasswordtxt("12345");
		
		acp.getcFirstNametxt("kanan");
		acp.getcLastNametxt("gilu");
		acp.clGederbtn("male");
		acp.getcDateOfBirth_dte("10/18/1993");
		acp.getcCompanytxt("goodwill");
		acp.clcIsTaxExempt_chkbx();
		acp.slcNewsletter_dpdown("Test store 2");
		acp.slcCustrole_dpdown();
		acp.slcManagerOVendor_dpdown();
		acp.clcActive_chkbx();
		acp.getcAdminCommenttxt("It was very good at that company");
		
		
		
	}

	@When("click on save button")
	public void click_on_save_button() throws InterruptedException {
		acp.clcsavebtn();
		Thread.sleep(2000);
		
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String msg) {
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
				.contains("The new customer has been added successfully"));
	}	
	
	//Steps for Search customer by mail id------------------
	
	@When("Enter customer Email")
	public void enter_customer_email() {
	}

	@When("Click on search button")
	public void click_on_search_button() {
	}

	@Then("User should found email in the search table")
	public void user_should_found_email_in_the_search_table() {
	}
}
