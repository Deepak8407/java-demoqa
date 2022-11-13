@DataDriven
Feature: Login
@Login @SanityTest
Scenario: Successful Login with Valid Credentials
	Given User Launch Chrome browser
	When User opens URL "http://admin-demo.nopcommerce.com/login"
	And  User enters Email as "admin@yourstore.com" and Password as "admin"
	Then User click on Login button
	Then Page Title should be "Dashboard / nopCommerce administration"
	When User click on Log out link
	Then Page Title should be "Your store. Login"
	And  close browser
@Login1 @SanityTest	
Scenario Outline: Login Data Driven
	Given User Launch Chrome browser
	When User opens URL "http://admin-demo.nopcommerce.com/login"
	And  User enters Email as "<email>" and Password as "<password>"
	Then User click on Login button
	Then Page Title should be "Dashboard / nopCommerce administration"
	When User click on Log out link
	Then Page Title should be "Your store. Login"
	And  close browser
	
	Examples:
			| email 			  | password |
			| admin@yourstore.com | admin |
			| admin@yourstore.com | admin123 |
		