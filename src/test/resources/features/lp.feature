Feature:
Application login check for Facebook


Scenario Outline:
Home page default login with valid credentials.
Given user launch the facebook webb application
When user enters the valid username and balid password
And user needs clic the login button
Then verify user is naviagting to homepage or not