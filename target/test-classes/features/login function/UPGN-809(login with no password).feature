Feature: Default

	#"Please fill out this field" message should be displayed if the password is empty
	@UPGN-809
	Scenario Outline: Empty password
		When User enter "<email>" to the emailInput
		And User clicks LoginButton
		Then User verify that -Please fill out this field.- message appeared
		    
		    Examples:
		    |email                 	 |
		    |salesmanager5@info.com  |
		    |salesmanager87@info.com |
		    |salesmanager105@info.com|
		    |posmanager5@info.com    |
		    |posmanager56@info.com   |
		    |posmanager155@info.com  |