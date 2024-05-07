
@13
Feature: US_013 As a registered user, I would like to have a dedicated dashboard page on the site to check my actions and settings on the site.

  Background:
    * Launch the app

  Scenario: TC_01 Profile icon should be visible and active on the home page.
       * Verify that "Profile" is visible
       * Verify that "Profile" is active

     Scenario: TC_02 Clicking on the Profile icon should go to the dashboard page
      * Click on the Profile
      * Click on the "Profile"
      * Verify that "My Account" is visible

     Scenario: TC_03 On the Dashboard page, summary information boards should be visible for the user under the My Account heading.
      * Click on the Profile
      * Click on the "Profile"
      * Verify that "My Account" is visible
      * Click on the "My Account"
      * Verify that "Total Orders" is visible
      * Verify that "Total Completed" is visible
      * Verify that "Total Returnd" is visible
      * Verify that "Wallet Balance" is visible
      * Verify that "Order History" is visible



