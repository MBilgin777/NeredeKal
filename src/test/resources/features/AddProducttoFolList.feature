Feature: User work on the Searching Hotel
  User Story:
    1.Verify that user can choose one of Antalya Hotels.

  Background: User is on neredekal.com home page.
    Given user is on the home page.

    Scenario: Verify that user can choose first Antalya Hotels whiches are listed by search.
      When user writes the name of city to textbox.
      And user clicks Antalya Otelleri.
      And user chooses check in date.
      And user choses check out date.
      And user choses two adults and one child five years.
      And user clicks search Button.
      And user clicks checkover Button of the first Hotel.
      Then user verify that the page of the hotel is opened in new tab.