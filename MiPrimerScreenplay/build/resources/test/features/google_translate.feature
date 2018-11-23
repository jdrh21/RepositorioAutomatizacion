#Author: jose_restrepo82131@elpoli.edu.co

Feature: Google translate
  As a web user
  I want to use Google translate
  To translate words between different lenguges

  Scenario: Translate from English to Spanish
    Given that susan wants to translate a word
    When she translates the word cheese from English to Spanish
    Then she should see the word queso in the screen