@DataDriven
Feature: Customers
@AddCust @SanityTest
Scenario: Add a new Customer
	Given User Launch Chrome browser
	When User opens URL "http://admin-demo.nopcommerce.com/login"
	And  User enters Email as "admin@yourstore.com" and Password as "admin"
	And  User click on Login button
	Then User can view Dashboard
	When User click on customer menu
	And  Click on customer Menu Item 
	And  Click on Add new button
	Then User can view Add new customer page
	When User enter customer info
	And  click on save button
	Then User can view confirmation message "The new customer has been added successfully"
	And  close browser
	
@SearchbyEmail @SmokeTest	
Scenario: Search Customer by EmailID
	Given User Launch Chrome browser
	When User opens URL "http://admin-demo.nopcommerce.com/login"
	And  User enters Email as "admin@yourstore.com" and Password as "admin"
	And  User click on Login button
	Then User can view Dashboard
	When User click on customer menu
	And  Click on customer Menu Item
	And  Enter customer Email
	When Click on search button
	Then User should found email in the search table
	And  close browser