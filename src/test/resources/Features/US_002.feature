
Feature: US_002 As a user, I would like to have easy links in the bottom bar of the home page so that I can easily perform internal site operations.

  Background:
  Launch the app

  Scenario: TC_01 Easy links (Home, Category, Wishlist, Cart, Profile) should be displayed at the bottom bar of the site.

    * Verify that "Home" is visible
    * Verify that "Category" is visible
    * Verify that "Cart" is visible
    * Verify that "Profile" is visible

  Scenario: TC_02 Easy links (Home, Category, Wishlist, Cart, Profile) should redirect to the relevant page.

    * Click on the "Home"
    * Verify that "Home" is active
    * Click on the "Category"
    * Click on the "Wishlist"
    * Click on the "Cart"
    * Click on the "Profile"

