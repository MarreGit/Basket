Feature: Register Account

  Scenario: Enter account information verified

    Given I enter day of birth "11/11/1999"
    And I enter firstname "Kalle"
    And I enter lastname "Karlsson"
    And I enter email "a12@asd.com"
    And I confirm email "a12@asd.com"
    And I enter password "password"
    And I confirm password "password"
    And I tick Account confirmation I have read "tick"
    And I tick Account confirmation I am aged "tick"
    And I tick Code of ethics "tick"
    When I click Confirm and join "clickconfirm"
    Then I confirm account "Your Basketball England Membership Number is:"

  Scenario: Enter account information no surname

    Given I enter day of birth "11/11/1999"
    And I enter firstname "Kalle"
    And I enter No lastname ""
    And I enter email "a1@asd.com"
    And I confirm email "a1@asd.com"
    And I enter password "password"
    And I confirm password "password"
    And I tick Account confirmation I have read "tick"
    And I tick Account confirmation I am aged "tick"
    And I tick Code of ethics "tick"
    When I click Confirm and join "clickconfirm"
    Then I confirm account no surname"Last Name is required"


  Scenario: Enter account information password do not match

    Given I enter day of birth "11/11/1999"
    And I enter firstname "Kalle"
    And I enter lastname "Karlsson"
    And I enter email "a1@asd.com"
    And I confirm email "a1@asd.com"
    And I enter password "password"
    And I confirm password No match ""
    And I tick Account confirmation I have read "tick"
    And I tick Account confirmation I am aged "tick"
    And I tick Code of ethics "tick"
    When I click Confirm and join "clickconfirm"
    Then I confirm account password dont match"Confirm Password is required"


  Scenario: Enter account information terms not valid

    Given I enter day of birth "11/11/1999"
    And I enter firstname "Kalle"
    And I enter lastname "Karlsson"
    And I enter email "a1@asd.com"
    And I confirm email "a1@asd.com"
    And I enter password "password"
    And I confirm password "password"
    And I tick Account confirmation I have read "tick"
    And I tick Account confirmation I am aged "tick"
    And I tick Code of ethics Not ticked ""
    When I click Confirm and join ""
    Then I confirm account terms not valid "You must confirm that you have read, understood and agree to the Code of Ethics and Conduct"

