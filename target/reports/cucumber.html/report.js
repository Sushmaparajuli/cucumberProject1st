$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/TechfiosLogin.feature");
formatter.feature({
  "name": "Techfios login functionality validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@TechfiosLoginFeature"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to login with valid credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TechfiosLoginFeature"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Scenario1"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "User is on techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_is_on_techfios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_enters_username_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password as \"abc123\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_enters_password_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on signin button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefination.userClicksOnSigninButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefination.userShouldLandOnDashboardPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on bankcash button",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_clicks_on_bankcash_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on newaccount button",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefination.userClicksOnNewAccountButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters accounttitle as \"AccountBysushmaParajuli\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_enters_accounttitle_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters description as \"My First Cucumber Project\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_enters_discription_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters initialbalance as \"a500\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_enters_initialbalance_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters accountnumber as \"p5622707489\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_enters_accountnumber_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters contactperson as \"Durga Devi\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_enters_contactperson_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Phone as \"n5622607489\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_enters_phone_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters internetbankingURL as\"https://www.youtube.com/watch?v\u003dqTidULSs_Gs\u0026list\u003dPL264cAp_4FgV_Gb0Q8lqSrE1US1P-eQBA\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_enters_internetbankingURL_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_clicks_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_should_be_able_to_validate_account_created_successfully()"
});
formatter.result({
  "status": "passed"
});
});