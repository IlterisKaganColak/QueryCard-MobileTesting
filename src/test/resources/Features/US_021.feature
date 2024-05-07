Feature: US_021 As a registered user, I want to have a payment page where I can pay for my orders that I control.

  Background:

    * Registered user logs in by using "bytEmail" and "Password" information

  @21
  Scenario: TC_01 On the Payment Information page, the payment method must be selected under the
  Select Payment Method menu heading and the Confirm order button must be visible and active.

    * Wait 2 second
    # 2. product
    * Click on the "797,1344"
    # Size
    * Click on the "620,1630"
    # Quantity
    * Scroll and click to "140,518"
    * Click on the "290,720"
    * Verify that "Success Product added to cart" is visible
    #* Verify that "Product added to card" message is visible
    #* Verify that "Shopping cart" button is visible
    #* Click on "Shopping cart" button
    #* Verify that "Proceed to Checkout" button is visible
    #* Click on the Proceed to Checkout" button
    #* Verify that "Shipping Addres" area is visible
    #* Click on the "Shipping Addres" area
    #* Verify that "Save and Pay" button is visible
    #* Click on the "Save and Pay" button
    #* Click on the "Stripe" button
    #* Verify that "Confirm Order" button is visible and active
    #* Click on the "Confirm Order" button
