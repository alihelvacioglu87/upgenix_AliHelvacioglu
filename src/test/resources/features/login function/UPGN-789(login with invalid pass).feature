Feature: Default

	#"Wrong login/password" message should be displayed for invalid credentials (valid username-invalid password)
  @UPGN-789
  Scenario Outline: Login function with invalid password
    When User enters "<valid userName>" to userNameInput
    And User enters "<invalid password>" to passwordInput
    And User clicks LoginButton
    Then User should see -Wrong login-password- message

    Examples:
      |valid userName             |invalid password|
      |salesmanager5@info.com     |invalidPassword |
      |salesmanager87@info.com    |invalidPassword |
      |salesmanager105@info.com   |invalidPassword |
      |posmanager5@info.com       |invalidPassword |
      |posmanager56@info.com      |invalidPassword |
      |posmanager155@info.com     |invalidPassword |
