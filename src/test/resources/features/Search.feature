Feature: User work on the Kategoriler Module
  User Story:
    1.Verify that user can choose Cep Telefonu.

  Background: User is on Akakce.com home page.
    Given user is on the home page.

    Scenario: Verify that user can choose Mobile Phone.
      When user clicks Kategoriler Module Button.
      And user clicks Elektronik SubModule Button.
      And user clicks Cep Telefonu Submodule Button.
      Then user verify the Url is correct.