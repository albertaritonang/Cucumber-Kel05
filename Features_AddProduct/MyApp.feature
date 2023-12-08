Feature: Test for Gaol Production (http://127.0.0.1:8000)

  Scenario: Test add Product as Admin
	Given open chrome and start application
	When I login as an Admin
	When I click the submit button
	When I click the drop down ECommerce menu
	When I click the Produk button
	When I click the Add Product Package button
	When I fill in the product details
	When I upload product image
	Then I click the Add button
