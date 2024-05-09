Feature: US_016 As a registered user, I would like to have a page on the site where I can select and manage my address information before completing the payment.

  Background:
    * Launch the app
    * Registered user logs in by using "simgeEmail" and "Password" information


  Scenario: TC_01 Delivery button should be visible and active on the Shipping Information page
    * Click on the first product in the Most Popular list
    * Click on the "S"
    * Click on the "Add To Cart"
    * Click on the Cart icon in product details page
    * Click on the "Proceed to Checkout"
    * Verify that "Delivery" is visible
    * Verify that "Delivery" is active
    * Click on the "Delivery"
    * Verify that "Shipping Address" is visible

  Scenario: TC_02 Pick Up button should be visible and active on the Shipping Information page
    * Click on the first product in the Most Popular list
    * Click on the "S"
    * Click on the "Add To Cart"
    * Click on the Cart icon in product details page
    * Click on the "Proceed to Checkout"
    * Verify that "Pick Up" is visible
    * Verify that "Pick Up" is active
    * Click on the "Pick Up"
    * Verify that "Order Summary" is visible

  Scenario: TC_03 Shipping address information, edit button and add button should be displayed when Delivery button is clicked
    * Click on the first product in the Most Popular list
    * Click on the "S"
    * Click on the "Add To Cart"
    * Click on the Cart icon in product details page
    * Click on the "Proceed to Checkout"
    * Verify that "Edit" is visible
    * Verify that "Edit" is active
    * Verify that "Add" is visible
    * Verify that "Add" is active

  Scenario: TC_04 Shipping address information should be edited
    * Click on the first product in the Most Popular list
    * Click on the "S"
    * Click on the "Add To Cart"
    * Click on the Cart icon in product details page
    * Click on the "Proceed to Checkout"
    * Click on the "Edit"
    * "Edit" address information in the update address page
    * Click on the "Update Address"
    * Verify that "Address" is visible

  Scenario: TC_05 Shipping address information should be added
    * Click on the first product in the Most Popular list
    * Click on the "S"
    * Click on the "Add To Cart"
    * Click on the Cart icon in product details page
    * Click on the "Proceed to Checkout"
    * Click on the "Add"
    * "Add" address information in the update address page
    * Click on the "Add Address"
    * Verify that "Shipping Address" is visible

  Scenario: TC_06 Order summary should be displayed under Order Summary
    * Click on the first product in the Most Popular list
    * Click on the "S"
    * Click on the "Add To Cart"
    * Click on the Cart icon in product details page
    * Click on the "Proceed to Checkout"
    * Slide small
    * Slide small
    * Verify that "Order Summary" is visible

  Scenario: TC_07 Save & Pay button should be visible and active
    * Click on the first product in the Most Popular list
    * Click on the "S"
    * Click on the "Add To Cart"
    * Click on the Cart icon in product details page
    * Click on the "Proceed to Checkout"
    * Slide small
    * Slide small
    * Verify that "Save & Pay " is visible
    * Verify that "Save & Pay " is active

  Scenario: TC_08 Save & Pay button test
    * Click on the first product in the Most Popular list
    * Click on the "S"
    * Click on the "Add To Cart"
    * Click on the Cart icon in product details page
    * Click on the "Proceed to Checkout"
    * Select the address
    * Slide small
    * Slide small
    * Click on the "Save & Pay"
    * Verify that "Payment Information" is visible

