Feature: Default

	#User can log out and ends up in login page.
	@UPGN-827 @Logout
	Scenario: Log out function
		Given User is on user home page
		When User clicks on account name
		And User clicks on Log out
		Then User verify that the title is "Login | Best solution for startups"