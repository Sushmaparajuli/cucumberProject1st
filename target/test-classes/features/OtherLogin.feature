@OtherFeature @Regression
Feature: Techfios login functionality validation

@Scenario2 @Smoke
Scenario: Other scenario - User should be able to login with valid credential
Given User is on techfios login page
When User enters username as "demo1@techfios.com"
When User enters password as "abc123"
When User clicks on signin button

Then User should land on dashboard page

@Scenario3
Scenario: Other scenario - User should be able to login with valid credential
Given User is on techfios login page
When User enters username as "demo@techfios.com"
When User enters password as "abc124"
When User clicks on signin button

Then User should land on dashboard page
