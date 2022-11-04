Feature: Default

	#The user must be logged out if the user closes the open tab (all tabs if there are multiple open tabs)
	@UPGN-829 @Logout
	Scenario: Logging out by closing Tab(s)
		Given User is on user home page
		When User copy the URL
		And User close the all opened tab(s)
		And User open a new browser and get to the copied URL
		Then User shouldn't see the title is "#Inbox - Odoo"