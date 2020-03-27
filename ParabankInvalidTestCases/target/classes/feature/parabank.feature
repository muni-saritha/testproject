@Invalid_Billpay_And_Messagetocustomer
Feature: ParaBank Website

   @tc_01
    Scenario: To check that the application is InValid bill pay  due to invalid accountno
    
     Given the user launch the chrome browser
     When the user open the Parabank Login Page
     Then the user login to the account
     And the user fills the details of the bill pay
     And submit the bill pay and close the browser
     
     @tc_02
    Scenario: To check that the application is InValid bill pay when mandatoryfield is left blank
    
     Given  user launch the chrome browser
     When  user open the Parabank Login Page
     Then  user login to the account
     And  user left one of the mandatoryfield of the bill pay
     And Submit the bill pay and close the browser
     
     
     @tc_03
    Scenario: To check that the application is InValid bill pay due to invalid amount
    
    Given  user launches  chrome browser
     When  User open the Parabank Login 
     Then the User login to the account
     And  User gave invalid amount
     And Submit bill pay and close  browser
     
     @tc_04
    Scenario: To check that the application is InValid bill pay because phone no field is left blank
    
     Given  user Launch the Chrome browser
     When  User open the Parabank Login Page
     Then  User login to the account
     And  User left phone no field of the bill pay
     And Submit bill pay and close the browser
     
     @tc_05
    Scenario: To check that the application is InValid mssgtocstmr because one field is left blank
    
    Given the user launchs the chrome browser
     When the user open the Parabank HomePage
     Then the user opens the msg and left the details 
     And send the message to customer care
     
    
     
     
     
   