Feature: Default

  #Background:
#		#@UPGN-724
  #Scenario: User goes to the "https://qa.upgenix.net/web/login/"
  #  When user goes to the "https://qa.upgenix.net/web/login/"
  #  Then user verify that title is "Login | Best solution for startups"
		

	#1-Users can log in with valid credentials
    # (We have 5 types of users but will test only 2 user: PosManager, SalesManager)
  @UPGN-725
  Scenario Outline: Login with valid credentials
    When User enter "<email>" to the emailInput
    And User enter "<password>" to the passwordInput
    And User clicks LoginButton
    Then User verify the title is "#Inbox - Odoo"
    Examples:

      | email                    | password     |
      | salesmanager5@info.com   | salesmanager |
      | salesmanager87@info.com  | salesmanager |
      | salesmanager105@info.com | salesmanager |
      | posmanager5@info.com     | posmanager   |
      | posmanager56@info.com    | posmanager   |
      | posmanager155@info.com   | posmanager   |