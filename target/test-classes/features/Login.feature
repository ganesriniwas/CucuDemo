Feature: Login page validations

Scenario: Non registered user should not be allowed to login
Given user is on Home page
When user logins with email "ganesriniwas@yahoo.com" and password "666666"
Then user should not be able to login
