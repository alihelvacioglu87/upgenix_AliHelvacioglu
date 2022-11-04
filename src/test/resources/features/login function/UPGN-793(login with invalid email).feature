Feature: Default

	#"Wrong login/password" message should be displayed for invalid credentials (invalid username-valid password)
	@UPGN-793
	Scenario Outline: Login Function with invalid username
		When User enters "<invalid userName>" to userNameInput
		And User enters "<valid password>" to passwordInput
		And User clicks LoginButton
		Then User should see -Wrong login-password- message
		
		Examples:
		|invalid userName           |valid password	 |
		|salesmanager4@info.com     |salesmanager    |
		|salesmanager@info.com      |salesmanager    |
		|salesmanager106@info.com   |salesmanager    |
		|posmanager4@info.com       |posmanager      |
		|invalidName@info.com       |posmanager      |
		|posmanager@info.com        |posmanager      |
		|posmanager156@info.com     |posmanager      |