@HS
Feature: US_004 As a registered user, I would like to have a page in my Dashboard where I can view my shopping history
  Background:
    * Launch the app
    * Verify access to "homepage"
  Scenario: TC_01 The profile icon should be visible and active at the bottom bar of the home page.
    * Verify that "Profile" is visible
    * Verify that "Profile" is active
    * Click on the "Profile"
