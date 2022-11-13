package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginPage;
import PageObjects.searchProduct;
import io.cucumber.java.en.*;

public class Steps_SearchProduct {
	
	public WebDriver driver;
	public searchProduct srp;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
//		driver = new ChromeDriver();
//		srp=new searchProduct(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	 }

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
		srp.setUserName(email);
		srp.setPassword(password);
	}
	@Then("User click on Login button")
	public void user_click_on_login_button() {
		srp.clickbtnLogin();
	}
	
	@Then("User Click on Catlog button")
	public void user_click_on_catlog_button() {
		srp.getcatlogdpdown();
	}

	@Then("User Click on Products")
	public void user_click_on_products() {
		srp.getcatlogdpdown();
	}

	@Then("User Click on Product Name txtbox")
	public void user_click_on_product_name_txtbox() {
		srp.clickproductName();
	}

	@Then("User eneter Name of the product {string}")
	public void user_eneter_name_of_the_product(String prname) {
		srp.setproductName(prname);
	}

	@Then("User Click on Category Options")
	public void user_click_on_category_options() {
		srp.getproductCategorydpdown();
	}

	@Then("User Select option from list")
	public void user_select_option_from_list() {
	}

	@Then("User click on Search subcategories")
	public void user_click_on_search_subcategories() {
		srp.getSearchIncludeSubCategoriescheck();
	}

	@Then("User Manufacturer options")
	public void user_manufacturer_options() {
		srp.getSearchManufacturerIddpdown();
	}

	@Then("User click on Vendor")
	public void user_click_on_vendor() {
		srp.getvendorIddpdown();
	}

	@Then("User click on Warehouse")
	public void user_click_on_warehouse() {
		srp.getwarehouseIddpdown();
	}

	@Then("User click on Product type")
	public void user_click_on_product_type() {
		srp.getpTypeIddpdown();
	}

	@Then("User click on Published")
	public void user_click_on_published() {
		srp.getpublishedIddpdown();
	}

	@Then("User click on Go directly to product SKU txtbox")
	public void user_click_on_go_directly_to_product_sku_txtbox() {
		
	}

	@Then("User enter {string}")
	public void user_enter(String antxt) {
		srp.setGoDirectlyToSkutxt(antxt);
	}

	@Then("User click on go button")
	public void user_click_on_go_button() {
		srp.clickGoDirectlyToSku_btn();
	}

	@Then("User close Chrome browser")
	public void user_close_chrome_browser() {
		driver.quit();
	}



}
