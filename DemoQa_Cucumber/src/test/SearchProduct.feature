Feature: Login and Search Product

Scenario: Successful Login and Search Product
	Given User Launch Chrome browser
	When User opens URL "http://admin-demo.nopcommerce.com/login"
	And  User enters Email as "admin@yourstore.com" and Password as "admin"
	Then User click on Login button
	Then User Click on Catlog button
	Then User Click on Products
	Then User Click on Product Name txtbox
	And  User eneter Name of the product "Sony"
	Then User Click on Category Options
	And  User Select option from list
	Then User click on Search subcategories
	Then User Manufacturer options
	And  User Select option from list
	Then User click on Vendor
	And  User Select option from list
	Then User click on Warehouse
	And  User Select option from list
	Then User click on Product type
	And  User Select option from list
	Then User click on Published
	And  User Select option from list
	Then User click on Go directly to product SKU txtbox
	And  User enter "Any Text"
	Then User click on go button
	And  User close Chrome browser