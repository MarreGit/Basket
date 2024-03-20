Feature: Register Account

  Scenario: Enter account information verified

    Given I enter day of birth "11/11/1999"
    And I enter firstname "Kalle"
    And I enter lastname "Karlsson"
    And I enter email "a3@asd.com"
    And I confirm email "a3@asd.com"
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
    And I enter No lastname "Karlsson"
    And I enter email "a1@asd.com"
    And I confirm email "a1@asd.com"
    And I enter password "password"
    And I confirm password "password"
    And I tick Account confirmation I have read "tick"
    And I tick Account confirmation I am aged "tick"
    And I tick Code of ethics "tick"
    When I click Confirm and join "clickconfirm"
    Then I confirm account no surname"nolastname"


  Scenario: Enter account information password do not match

    Given I enter day of birth "11/11/1999"
    And I enter firstname "Kalle"
    And I enter lastname "Karlsson"
    And I enter email "a1@asd.com"
    And I confirm email "a1@asd.com"
    And I enter password "password"
    And I confirm password No match "password"
    And I tick Account confirmation I have read "tick"
    And I tick Account confirmation I am aged "tick"
    And I tick Code of ethics "tick"
    When I click Confirm and join "clickconfirm"
    Then I confirm account password dont match"passworddonotmatch"


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
    And I tick Code of ethics Not ticked "tick"
    When I click Confirm and join ""
    Then I confirm account terms not valid "termsnotvalid"

