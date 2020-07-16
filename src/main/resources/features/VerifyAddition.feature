Feature: Verify Addition

Scenario: Check two positive int addition
    Given 10 and 20
    When calling add
    Then the result should be 30
    When calling multiply
    Then the result should be 200