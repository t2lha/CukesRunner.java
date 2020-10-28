@Test
  Feature: User needs reach every aspects of the website

    Scenario: User account login

      When user is on the main page
      Then user clicks to the login button
      Then user enters email
      Then user enters password
