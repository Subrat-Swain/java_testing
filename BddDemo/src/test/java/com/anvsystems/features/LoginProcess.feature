Feature:Authentication and Authorization Feature
	
	This functionality deals with employee login and logout related activities
	
Scenario: Positive Scenario Valid Login Credentials
		Given I enter username "sample_username"
		And I enter passowrd "sample_password"
		And I click on Login button
		Then I should be redirected to Homepage
		
		Scenario: Negative Scenario Invalid Login Credentials
		Given I enter invalid username
		And I enter invalid password
		And I click on Login button
		Then I should get authentication error page