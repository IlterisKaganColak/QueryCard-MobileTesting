
@13
Feature: US_013 As a registered user, I would like to have a dedicated dashboard page on the site to check my actions and settings on the site.

  Background:
    * Launch the app

     Scenario: TC_01 Profile icon should be visible and active on the home page.
       * Verify that the "profile" is visible
       * Verify that the "profile" is active

     Scenario: TC_02 Clicking on the Profile icon should go to the dashboard page
      * Click on the "profile"
      * Verify that it is access to the "Dashboard page"

     Scenario: TC_03 On the Dashboard page, summary information boards should be visible for the user under the My Account heading.
      * Click on the "profile"
      * Verify that the "My Account" is visible
      * Click on the "My Account"
      * Verify that "summary information boards" are visible

     Scenario: TC_04 My Account page should display the user's order history.
      * Click on the "profile"
      * Click on the "My Account"
      * Verify that "order history" is visible

