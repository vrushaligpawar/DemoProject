Feature: Login Scenarios

Scenario Outline: verify login using valid userId and Password

Given User has valid URL for application
When User enters UserID and PassWord and User clicks on Login button
Then User verifies login is successful

Examples:
|UserID|
|abc|
|Password|
|xyx|
