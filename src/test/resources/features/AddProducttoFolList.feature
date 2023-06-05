Feature: User work on the Kategoriler Module
  User Story:
    1.Verify that user can choose Cep Telefonu.

  Background: User is on Akakce.com home page.
    Given user is on the home page.

    Scenario: Verify that user can add product to follow list.
      When user searches iphone on search textbox.
      And user clicks searchButton.
      And user clicks first iphone14.
      And user scrolls down the page.
      And user clicks Takip Et Button.
      And user goes to Takip Listem Page.
      Then user verify that the product is added to Takip Listem page.