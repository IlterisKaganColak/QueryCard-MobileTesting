
Feature: US_019 As a registered user, I want to be able to log out of the system securely

  Background:
    *  Registered user logs in by using "zelihaEmail" and "Password" information

  Scenario: [TC_01>US_010] Tested that Logout link should be visible and active in the dashboard sidebar when clicking on the profile icon

    * Click on the "Profile"
    * Verify that "Logout" is visible
    * Verify that "logout" is active