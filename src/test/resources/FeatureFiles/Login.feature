
Feature: validate the login functionality of facebook page
Background:
#Given user should launch the chrome browser and load the url

Scenario: validate the login invalid username and invalid password

When user should input invalid username and invalid password
And user should print the title of page
And user should click the login button
And user should print current url of my page
Then user should navigate to incorrect credential page

Scenario: validate the login valid username and invalid password

When user should input valid username and invaliD password
#2D Map
|person|colour|kit|
|vijay|udhya|harish|
|arun890|yash|suthir|
|jhon|loshan|arun|
And user should print the title of page
And user should click the login button
And user should print current url of my page
Then user should navigate to incorrect credential page

Scenario Outline: validate the login invalid username and valid password
When user should input invalid username "<Fruits>"and valid password"<Colours>"
And user should print the title of page
And user should click the login button
And user should print current url of my page
Then user should navigate to incorrect credential page
 Examples:
          |Fruits|Colours|
          |ORANGE|SAFFRON|
          |GRAPES|GREEN|