
Feature: US_015 As a registered user, I would like to have a page in my Dashboard where I can view my shopping history

  Background:
    * Launch the app
    * Registered user logs in by using "simgeEmail" and "Password" information

  @US15
  Scenario: TC_01 Order History menu item should be visible and active in Dashboard sideBar

     * Click on the "Profile"
     * Verify that "Order History" is visible
     * Verify that "Order History" is active

  Scenario: TC_02 Shopping history viewing icon should be active on Order History page.

    * Click on the "Profile"
    * Click on the "Order History"
    * Verify that Shopping History Display Icon is visible
    * Verify that Shopping History Display Icon is active

