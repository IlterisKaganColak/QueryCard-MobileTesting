Feature: US_003 As a user, I want to be able to shop without registering on the site

  Background:
   #* Launch the app

  Scenario: TC_01 Products and product features should be visible on the homepage
    #* Verify access to "homepage"
    #* Verify that {string} is visible --> _products and product features are visible on the homepage

  Scenario: TC_02 Size/color and quantity features of the selected product must be selectable
    #* Click on the "anyProductFromTheHomePage"
    #* Verify that "sizeButton" is active
    #* Verify that "colorButton" is active
    #* Verify that "quantityButton" is active

  Scenario: TC_03 Add to Card button must be visible and active on the product detail page
    #* Verify that the "addToCartButton" is visible
    #* Verify that "addToCartButton" is active
    #* Verify that the "confirmationMessage" is visible

  Scenario: TC_04 Price, quantity, and subtotal information of the product added to the cart should be visible
    #* Verify that the "shoppingBagIcon" is visible
    #* Verify that "shoppingBagIcon" is active
    #* Click on the "shoppingBagIcon"
    #* Verify that the "shoppingCartPage" is visible
    #* Verify that the "price" is visible
    #* Verify that the "quantity" is visible
    #* Verify that the "subTotalInfo" is visible

  Scenario: TC_05 Proceed to Checkout button must be visible and active
    #     BUG_01
    # Proceed To Checkout button is not active.
  Scenario: TC_06 Shipping address information should be addable and editable
    #     BUG_02
    # Proceed To Checkout button is not active.
  Scenario: TC_07 Save & Pay button should be visible and active
    #     BUG_03
    # Proceed To Checkout button is not active.
  Scenario: TC_08 Select payment method and complete the order
    #     BUG_04
    # Proceed To Checkout button is not active.
  Scenario: TC_09 The status and invoice of the order placed must be visible
    #     BUG_05
    # Proceed To Checkout button is not active.
