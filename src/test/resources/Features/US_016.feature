Feature: US_016 As a registered user, I would like to have a page on the site where I can select and manage my address information before completing the payment.

  Background:
    * Launch the app
    * Click on the "Profile"
    * Click on the "Sign In"
    * Registered user logs in by using "simgeEmail" and "Password" information


  Scenario: TC_01 Delivery, Pick Up buttons should be visible and active on the Shipping Information page

    * Click on the first product in the Most Popular list
    * Click on the "S"
    * Click on the "Add To Cart"
    * Click on the Cart icon in product details page
    * Click on the "Proceed to Checkout"
    * Verify that "Delivery" is visible
    * Verify that "Delivery" is active
    * Verify that "Pick Up" is visible
    * Verify that "Pick Up" is active

