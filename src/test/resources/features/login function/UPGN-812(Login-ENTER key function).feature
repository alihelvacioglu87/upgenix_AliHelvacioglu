Feature: Default

	#Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.
	@UPGN-812
	Scenario: Login function (ENTER key function)
		When User enter "salesmanager56@info.com" to the emailInput
		And User enter "salesmanager" to the passwordInput
		And User press ENTER key
		Then User verify the title is "#Inbox - Odoo"