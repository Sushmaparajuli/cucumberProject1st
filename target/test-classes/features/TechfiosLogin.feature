@TechfiosLoginFeature @Regression
Feature: Techfios login functionality validation

  @Scenario1 @Smoke
  Scenario: User should be able to login with valid credential
    Given User is on techfios login page
    When User enters username as "demo@techfios.com"
    When User enters password as "abc123"
    When User clicks on signin button
    Then User should land on dashboard page
    Then User clicks on bankcash button
    
    Then User clicks on newaccount button
    Then User enters accounttitle as "AccountBysushmaParajuli123"
    Then User enters description as "Cucumber Project" 
    Then User enters initialbalance as "a500" 
    Then User enters accountnumber as "p5622707489" 
    Then User enters contactperson as "Durga Devi"
    Then User enters Phone as "n5622607489" 
    Then User enters internetbankingURL as"https://www.youtube.com/watch?v=qTidULSs_Gs&list=PL264cAp_4FgV_Gb0Q8lqSrE1US1P-eQBA"
    Then User clicks on submit button
    Then User should be able to validate account created successfully
