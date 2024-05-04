Feature: US_015 As a registered user, I would like to have a page in my Dashboard where I can view my shopping history

  Background:
    * Click on the "Profile"
    * Click on the "Sign In"
    * Click on the "*Use Email Instead"
    * "simgeEmail" is entered
    * "Password" is entered
    * Click on the "532,1131"


  Scenario: TC_01 Order History menu item should be visible and active in Dashboard sideBar

     * Click on the "Profile"
     * Verify that "Order History" is visible
     * Verify that "Order History" is active
