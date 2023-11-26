@sanity
Feature: validate the login functionality of facebook page
Scenario: validate the login invalid username and invalid password
#Given user should launch chrome and load url
When user should click forgotten button link
And user should input invalid mobile number
And user should click the search button
Then user should navigate to recover page