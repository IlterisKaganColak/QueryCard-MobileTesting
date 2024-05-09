Feature: As a registered user, I want to have a favorite products page on the site and I want to be able to manage this page.

Background:
  * Registered user logs in by using "zelihaEmail" and "Password" information

  Scenario: [TC_01>US_023] Tested that The categories icon is visible and active on the homepage

    * Verify that "Category" is visible
    * Verify that "Category" is active

  Scenario: [TC_02>US_023] Tested that on the page selected from the Categorie subheadings, the favorite icon is visible and active on the products, the desired product is added to the favorite list

    * Click on the "Category"
    * Click on the "Men"
    * Click on the favorite icon
    * Verify that "Add Added to wishlist" is visible

  Scenario: [TC_03>US_023] Tested that wishlist icon is visible and active on the homepage

    * Verify that "Wishlist" is visible
    * Verify that "Wishlist" is active


  Scenario: [TC_04>US_023] Tested that The desired product is removed from the wishlist page

    * Click on the "Wishlist"
    * Click on the favorite icon
    * Verify that "Add Added to wishlist" is visible