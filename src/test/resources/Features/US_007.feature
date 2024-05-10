@HS @7
Feature: US_007 As a user, I would like to have a page where I can follow the latest products on the site where I shop.
  Background:
    * Launch the app
    * Verify access to "homepage"
  @HS @7 @701
  Scenario: TC_01 Most Popular menu title should be visible on the home page.
    * Verify that "Most Popular" is visible
    * Verify that "Most Popular" is active
  @HS @7 @702
  Scenario: TC_02 See All icon should be visible and active
    * Verify that "See All" is visible
    * Verify that "See All" is active
  @HS @7 @703
  Scenario: TC_03 Current products should be listed under Most Popular
    * Verify that "See All" is visible
    * Verify that "See All" is active
    * Click on the "See All"
    * Verify Current products listed under Most Popular
  @HS @7 @704
  Scenario: TC_04 Clicking the back button should return to the homepage
    * Verify that "See All" is visible
    * Verify that "See All" is active
    * Click on the "See All"
    * Navigate to the previous page
    * Verify access to "homepage"