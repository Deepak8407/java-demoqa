package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage {
public WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		@FindBy(xpath="(//a[contains(@href, '#')])[7]")
		WebElement Custmenu;
		
		@FindBy(xpath="//li[4]/ul/li/a/p")
		WebElement Custoption;
		
		@FindBy(xpath="//a[contains(@href, '/Admin/Customer/Create')]")
		WebElement Addnewbtn;
	
		@FindBy(id="Email")
		WebElement cEmailtxt;
		
		@FindBy(id="Password")
		WebElement cPasswordtxt;
		
		@FindBy(id="FirstName")
		WebElement cFirstNametxt;
		
		@FindBy(id="LastName")
		WebElement cLastNametxt;
		
		@FindBy(id="Gender_Male")
		WebElement cGender_Male_rdbtn;
		
		@FindBy(id="Gender_Female")
		WebElement cGender_Female_rdbtn;
		
		@FindBy(id="DateOfBirth")
		WebElement cDateOfBirth_dte;
		
		@FindBy(id="Company")
		WebElement cCompanytxt;
		
		@FindBy(id="IsTaxExempt")
		WebElement cIsTaxExempt_chkbx;
		
		@FindBy(xpath="//*[@id=\"customer-info\"]/div[2]/div[9]/div[2]/div/div[1]/div/div")
		WebElement cNewsletter_dpdown;
		
		@FindBy(xpath="//*[@id=\"customer-info\"]/div[2]/div[10]/div[2]/div/div[1]/div/div") //method not added
		WebElement cCustrole_dpdown;
		
		@FindBy(xpath="//*[@id=\"VendorId\"]")  //method not added
		WebElement cManagerOVendor_dpdown;
		
		@FindBy(id="Active")
		WebElement cActive_chkbx;
		
		@FindBy(id="AdminComment")
		WebElement cAdminCommenttxt;
		
		@FindBy(id="save-continue")
		WebElement csave_continue;
		
		@FindBy(name="save")
		WebElement csavebtn;
		
		public String getPageTitle()
		{
			return ldriver.getTitle();
		}
		
		public void clCustmenu()
		{
			Custmenu.click();
			Custoption.click();
		}
		
		public void clAddnewbtn()
		{
			Addnewbtn.click();
		}
		
		public void getcEmailtxt(String email)
		{
			cEmailtxt.sendKeys(email);
			
		}
		public void getcPasswordtxt(String pwd)
		{
			cPasswordtxt.sendKeys(pwd);
		}
		public void getcFirstNametxt(String fname)
		{
			cFirstNametxt.sendKeys(fname);
		}
		public void getcLastNametxt(String lname)
		{
			cLastNametxt.sendKeys(lname);
		}
		public void clGederbtn(String gen)
		{
			if(gen.equals("male"))
			{
				cGender_Male_rdbtn.click();
			}
			else if(gen.equals("Female"))
			{
				cGender_Female_rdbtn.click();
			}
			else
			{
				cGender_Male_rdbtn.click();//default
			}
			
		}
		public void getcDateOfBirth_dte(String dob)
		{
			cDateOfBirth_dte.sendKeys(dob);
		}
		public void getcCompanytxt(String compname)
		{
			cCompanytxt.sendKeys(compname);
		}
		public void clcIsTaxExempt_chkbx()
		{
			cIsTaxExempt_chkbx.click();
		}
		public void slcNewsletter_dpdown(String newsletr)
		{
//			if(!newsletr.equals("Your store name"))
//			{
//				ldriver.findElement(By.xpath("//*[@id=\"a2652c96-76cd-4ec4-8165-445c10a1d046\"]")).click();
//			}
//			else
//			{
//				ldriver.findElement(By.xpath("//*[@id=\"SelectedNewsletterSubscriptionStoreIds_listbox\"]/li[2]")).click();
//			}
//			Select select = new Select(cNewsletter_dpdown);
//				select.selectByValue("Test store 2");
		}
		public void slcCustrole_dpdown()
		{
//			Select select = new Select(cCustrole_dpdown);
//			select.selectByValue("Guests");
		}
		public void slcManagerOVendor_dpdown()
		{
//			Select select = new Select(cManagerOVendor_dpdown);
//			select.selectByIndex(1);
		}
		public void clcActive_chkbx()
		{
			cActive_chkbx.click();
		}
		
		public void getcAdminCommenttxt(String cmt)
		{
			cAdminCommenttxt.sendKeys(cmt);
		}
		public void clcsavebtn()
		{
			csavebtn.click();
		}
		
		
		
}
