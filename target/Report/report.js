$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/Login.feature");
formatter.feature({
  "name": "validate the login functionality of facebook page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "validate the login valid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@yellow"
    }
  ]
});
formatter.step({
  "name": "user should input valid username and invaliD password",
  "rows": [
    {
      "cells": [
        "person",
        "colour",
        "kit"
      ]
    },
    {
      "cells": [
        "vijay",
        "udhya",
        "harish"
      ]
    },
    {
      "cells": [
        "baru",
        "yash",
        "suthir"
      ]
    },
    {
      "cells": [
        "jhon",
        "loshan",
        "daniel"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.userShouldInputValidUsernameAndInvaliDPassword(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should print the title of page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_should_print_the_title_of_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should print current url of my page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.userShouldPrintCurrentUrlOfMyPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should navigate to incorrect credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_should_navigate_to_incorrect_credential_page()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: check the credentials\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.StepDefinition.LoginStepDefinition.user_should_navigate_to_incorrect_credential_page(LoginStepDefinition.java:48)\r\n\tat ✽.user should navigate to incorrect credential page(file:src/test/resources/FeatureFiles/Login.feature:25)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});