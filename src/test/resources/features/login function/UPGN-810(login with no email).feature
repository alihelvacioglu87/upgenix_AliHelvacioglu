Feature: Default

	#"Please fill out this field" message should be displayed if username is empty
	@UPGN-810
	Scenario Outline: Login Funct. Empty email
		When User enter "<password>" to the passwordInput
		And User clicks LoginButton
		Then User verify that -Please fill out this field.- message appeared at email input box
		    
		    Examples:
				|password    |
				|salesmanager|
				|salesmanager|
				|salesmanager|
				|posmanager  |
				|posmanager  |
				|posmanager  |