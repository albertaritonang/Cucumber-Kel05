Feature: Test for Gaol Production (http://127.0.0.1:8000)

  Scenario: Test Registrasi with Valid Credentials
    Given open chrome and start application
    When I fills all required fields
    And I click the create account button