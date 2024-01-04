Feature: Login to HRM Application 
 
Background: 
   Given User is on HRMLogin page "https://opensource-demo.orangehrmlive.com/"
  
   @ValidCredentials
   Scenario: Login with valid credentials
      
    When User enters username as "Admin" and password as "admin123"
    Then User should be able to login sucessfully and new page open
     
