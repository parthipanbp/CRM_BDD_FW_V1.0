Feature: Free CRM login Feature 

@test
Scenario: Launch and Login CRM Application 
Given user is already on Login Page 
When title of login page is Free CRM
Then I should login into the application 

And close the applciation