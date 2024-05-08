Feature: US_021 As a registered user, I want to have a payment page where I can pay for my orders that I control.

  Background:

    * Registered user logs in by using "bytEmail" and "Password" information
    * Wait 4 second
    # 2. product
    * Click on the "797,1344"
    * Wait 2 second
    # Size
    * Click on the "S"
    # Quantity
    * Click on the "140,518"
    * Click on the "Add To Cart"
    # Shopping cart button
    * Wait 2 second
    #* Verify that "980,1700" is visible
    * Click on the "980,1700"
    #* Verify that "Proceed to Checkout" is visible
    * Wait 2 second
    * Click on the "Proceed to Checkout"
    * Wait 2 second
    # Shipping Adress
    #* Verify that "540,540"is visible
    * Click on the "540,540"
    * Wait 2 second
    #* Verify that "Save and Pay" is visible
    * Click on the "Save & Pay"
    * Wait 2 second
    * Click on the "Stripe"
    * Wait 2 second
    #* Verify that "Confirm Order" is visible
    #* Verify that "Confirm Order" is active
    * Click on the "Confirm Order"

  @211
  Scenario: TC_01 On the Payment Information page, the payment method must be selected under the
  Select Payment Method menu heading and the Confirm order button must be visible and active.

  @212
  Scenario Outline:
    # Card Number area
    * Verify that "206,477" is visible
    * Click on the "206,477"
    * Wait 20 second
    * Enter valid <Card Number>, <Card Date>, <CVC Code> and <ZIP Code>
    * Verify that "Confirm" is visible
    * Click on the "Confirm"
    * Verify that "Thank you for your order" is visible
    Examples:
      | Card Number       | Card Date | CVC Code | ZIP Code |
      | 4242424242424242 | 1229      | 333      | 12345    |

  @213
  Scenario:
    * Click on the "Card Number"
    #* Enter valid "Card Numer", "Card Date", "CVC Code" and "ZIP Code"
    * Verify that "Confirm" is visible
    * Click on the "Confirm"
    #* Verify that "Succesfull Payment" message is visible
    * Verify that "Go to order details" is visible
    * Click on the "Go to order details"
    * Verify that "Order History" is visible
    #* Select first choice and click
    * Verify that "Order Details and invoice" is visible


  @214
  Scenario:
    * Click on the "Card Number"
    #* Enter valid "Card Numer", "Card Date", "CVC Code" and "ZIP Code"
    * Verify that "Confirm" is visible
    * Click on the "Confirm"
    * Verify that "Go to shopping" is visible
    * Click on the "Go to shopping"
    * Verify that "Main page" is visible



