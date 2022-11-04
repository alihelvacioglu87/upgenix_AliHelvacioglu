Feature: Default

	#User should see the password in bullet signs by default while typing (like ****)
	@UPGN-811
	Scenario Outline: Bullet Sign
		When User enter "<password>" to the passwordInput
		Then User verifies that entered password shown as bullet sign

		Examples:
			|password    |
			|salesmanager|
			|salesmana	 |
			|sales		 |
			|posmanager  |
			|posmana  	 |
			|pos	 	 |