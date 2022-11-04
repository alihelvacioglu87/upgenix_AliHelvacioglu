Feature: Default

	#The user can not go to the home page again by clicking the step back button after successfully logged out.
	@UPGN-828 @Logout
	Scenario: trying to go back after log out
		Given User is on user home page
		When User clicks on account name
		And User clicks on Log out
		And User verify that the title is "Login | Best solution for startups"
		And User navigate to BACK
		Then User verify that the "Odoo Session Expired" message shown