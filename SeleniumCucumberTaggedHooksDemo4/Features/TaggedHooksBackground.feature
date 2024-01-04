Feature: Test Tagged Hooks

  @SmokeTest
  Scenario: This is First Scenario
    Given this is the first step
    When this is the second step
    Then this is the third step

  @RegressionTest
  Scenario: This is Second Scenario
    Given this is the first step
    When this is the second step
    Then this is the third step

  @RegressionTest
  Scenario: This is Third Scenario
    Given this is the first step
    When this is the second step
    Then this is the third step
