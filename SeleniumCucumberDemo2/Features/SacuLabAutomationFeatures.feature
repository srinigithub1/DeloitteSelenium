@RegressionSuiteTag
Feature: Validating Suace Lab Appication
  I want to use this template for my feature file

  @SacuLabTestSuite
  Scenario: Validating Login Funcaaitonalionality in SauceLab app
    Given I opened Chrome Bowser with App url
    And checked title of the page for Home page verfication
    When I enter username
    And I enter password
    And click Login button in SuaceLab App home page
    Then I validate prodducts page
    And click Logout button
    And close Browser

  @SacuLabTestSuite
  Scenario Outline: Data DrivenTest for Login
    Given I opened Chrome Bowser with App url
    And checked title of the page for Home page verfication
    When I want to check uname "<uname>" with multiple values
    And   I want to check password"<pwd>" with multiple values
    Then I validate prodducts page for Neative and postive Test data
		And close Browser
    Examples: 
      | uname | pwd  | 
      | Manal |  abc | 
      | Tamim |  xyz | 
      | Augustin |  123 | 
