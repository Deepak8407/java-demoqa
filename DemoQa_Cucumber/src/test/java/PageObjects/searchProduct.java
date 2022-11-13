package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class searchProduct {
	public WebDriver ldriver;
	
	public searchProduct(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(id="Email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="//p[contains(.,'Catalog')]")
	WebElement catlogdpdown;
	
	@FindBy(xpath="//p[contains(.,'Products')]")
	WebElement productopn;
	
	@FindBy(id="SearchProductName")
	WebElement productName;
	
	@FindBy(id="SearchCategoryId")
	WebElement productCategorydpdown;
	
	@FindBy(id="SearchIncludeSubCategories")
	WebElement SearchIncludeSubCategoriescheck;
	
	@FindBy(id="SearchManufacturerId")
	WebElement SearchManufacturerIddpdown;
	
	@FindBy(id="SearchVendorId")
	WebElement vendorIddpdown;
	
	@FindBy(id="SearchWarehouseId")
	WebElement warehouseIddpdown;
	
	@FindBy(id="SearchProductTypeId")
	WebElement pTypeIddpdown;
	
	@FindBy(id="SearchPublishedId")
	WebElement publishedIddpdown;
	
	@FindBy(id="GoDirectlyToSku")
	WebElement GoDirectlyToSkutxt;
	
	@FindBy(id="go-to-product-by-sku")
	WebElement GoDirectlyToSku_btn;
	
	public void setUserName(String uname)
	{
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}
	public void setPassword(String pwd)
	{
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	public void clickbtnLogin()
	{
		btnLogin.click();
	}
	public void getcatlogdpdown()
	{
//		Select select=new Select(catlogdpdown);
//		select.selectByIndex(1);
		catlogdpdown.click();
	}
	public void getproductopn()
	{
		productopn.click();
	}
	public void clickproductName()
	{
		productName.click();
	}
	public void setproductName(String pname)
	{
		
		productName.sendKeys(pname);
	}
	public void getproductCategorydpdown()
	{
		Select select=new Select(productCategorydpdown);
		select.selectByIndex(2);
	}
	public void getSearchIncludeSubCategoriescheck()
	{
		SearchIncludeSubCategoriescheck.click();
	}
	public void getSearchManufacturerIddpdown()
	{
		Select select=new Select(SearchManufacturerIddpdown);
		select.selectByIndex(2);
	}
	public void getvendorIddpdown()
	{
		Select select=new Select(vendorIddpdown);
		select.selectByIndex(2);
	}
	public void getwarehouseIddpdown()
	{
		Select select=new Select(warehouseIddpdown);
		select.selectByIndex(2);
	}
	public void getpTypeIddpdown()
	{
		Select select=new Select(pTypeIddpdown);
		select.selectByIndex(2);
	}
	public void getpublishedIddpdown()
	{
		Select select=new Select(publishedIddpdown);
		select.selectByIndex(2);
	}
	
	public void clickGoDirectlyToSkutxt()
	{
		productName.click();
		
	}
	public void setGoDirectlyToSkutxt(String atxt)
	{
		productName.click();
		productName.sendKeys(atxt);
	}
	public void clickGoDirectlyToSku_btn()
	{
		GoDirectlyToSku_btn.click();
	}
}
