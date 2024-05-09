Feature: US_016 As a registered user, I would like to have a page on the site where I can select and manage my address information before completing the payment.

  Background:
    * Launch the app
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

  Scenario: TC_02 Shipping address information, edit button and add button should be displayed when Delivery button is clicked
    * Click on the first product in the Most Popular list
    * Click on the "S"
    * Click on the "Add To Cart"
    * Click on the Cart icon in product details page
    * Click on the "Proceed to Checkout"
    * Verify that "Edit" is visible
    * Verify that "Edit" is active
    * Verify that "Add" is visible
    * Verify that "Add" is active
@16
  Scenario: TC_03 Shipping address information should be edited
    * Click on the first product in the Most Popular list
    * Click on the "S"
    * Click on the "Add To Cart"
    * Click on the Cart icon in product details page
    * Click on the "Proceed to Checkout"
    * Click on the "Edit"
    * Edit address information in the update address page
    * Click on the "Update Address"
    * Verify that "Address" is visible
