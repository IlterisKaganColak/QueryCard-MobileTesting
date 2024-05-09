
Feature: US_015 As a registered user, I would like to have a page in my Dashboard where I can view my shopping history

  Background:
    * Launch the app
    * Registered user logs in by using "simgeEmail" and "Password" information

  Scenario: TC_01 Order History menu item should be visible and active in Dashboard sideBar
    * Click on the "Profile"
    * Verify that "Order History" is visible
    * Verify that "Order History" is active

  Scenario: TC_02 Shopping history viewing icon should be active on Order History page.
    * Click on the "Profile"
    * Click on the "Order History"
    * Verify that Shopping History Display Icon is visible
    * Verify that Shopping History Display Icon is active

  Scenario: TC_03 Order invoice should be accessible from Order History list
    * Click on the "Profile"
    * Click on the "Order History"
    * Click on the Shopping History Display
    * Verify that "Download Receipt" is visible
    * Verify that "Download Receipt" is active

  Scenario: TC_04 Order should be canceled from Order History list
    * Click on the "Profile"
    * Click on the "Order History"
    * Click on the Shopping History Display
    * Verify that "Cancel Order" is visible
    * Verify that "Cancel Order" is active