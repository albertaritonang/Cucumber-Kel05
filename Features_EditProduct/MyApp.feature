Feature: Test for Gaol Production (http://127.0.0.1:8000)

  Scenario: Test edit Product as Admin
	Given open chrome and start application
	When I login as an Admin
	When I click the submit button
	When I click the drop down ECommerce menu
	When I click the Produk button
	When I click the Update button
	When I fill in the product details
	When I click the choose file button
	When I upload product image
	When I click the Add button
	Then I see Product added successfully message