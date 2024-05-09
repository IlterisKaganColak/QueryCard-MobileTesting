Feature: US_009 As a user, I want to be able to access detailed information about the product I have selected on the page

  Background:
    * Launch the app

  Scenario: TC_01 It should be possible to go to the page of the selected product from the home page, and when you go to the product page,
  the Details, Videos, Reviews, Shipping & Returns titles should appear and be active.


    * Click on the first product
    * Verify that "Details" is visible
    * Verify that "Details" is active
    * Verify that "Videos" is visible
    * Verify that "Videos" is active
    * Verify that "Review" is visible
    * Verify that "Review" is active
    * Verify that "Shipping & Return" is visible
    * Verify that "Shipping & Return" is active

  Scenario: TC_02 Selected products should be added to the wishlist list from the wishlist /favorite button.
    * Wait 5 second
    * Click on the "797,1344"
    #* Click on the first product
    * Click on the "Details"
    * Verify that "Product Details" is visible

  Scenario: TC_03 When clicking the Videos button, the Product Videos title and product videos should be displayed

    * Click on the first product
    * Click on the "Videos"
    * Verify that "Product Videos" is visible

  Scenario:TC_04 When the Review button is clicked, the Review title and reviews of the product should be displayed
    * Click on the first product
    * Click on the "Review"
    * Verify that "Product Reviews" is visible

  Scenario:TC_05 When the Shipping&Return button is clicked, the Shipping&Return heading and the shipping and return conditions of the product should be displayed
    * Click on the first product
    * Click on the "Shipping & Return"
    * Verify that "Shipping & Return" is visible