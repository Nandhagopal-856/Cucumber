Feature:
Application login check for Facebook

Background:
Given user launch the facebook webb application

Scenario:
Home page default login with valid credentials.

When user enters the valid username and balid password
And user needs clic the login button
Then verify user is naviagting to homepage or not

Scenario Outline:
When user enters the valid "<username>" and balid "<password>"
And user needs clic the login button
Then verify user is naviagting to homepage or not


Examples:
|username|password|
|aabbcc|abc@123|
|112233|56789|
