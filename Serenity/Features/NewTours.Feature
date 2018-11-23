#Author: jose_restrepo82131@elpoli.edu.co

@LoginFeature
Feature: Login en new tours

  @GoodLogin
  Scenario: Login in new tours
    Given The new tours page
    When I fill the user and password field
    And Click the submit button
    Then I acces to a new page
