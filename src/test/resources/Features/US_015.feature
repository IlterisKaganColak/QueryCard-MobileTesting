Feature: US_015 As a registered user, I would like to have a page in my Dashboard where I can view my shopping history

  Background:
    * Launch the app

  Scenario: TC_01 Order History menu item should be visible and active in Dashboard sideBar

     * Click on the "Profile" in homepage
     * Click on the "Sign In" in login page
     * Click on the "Use Email" in sign in
     * "Valid email" is entered
     * "Valid password" is entered
     * Click on the "Sign In" in sign in page
     * Click on the "Profile" in homepage
     * Verify that "Order History" is visible in profile page
     * Verify that "Order History" is active in profile page
