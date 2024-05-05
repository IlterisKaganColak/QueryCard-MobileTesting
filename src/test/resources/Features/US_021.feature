Feature: US_021 As a registered user, I want to have a payment page where I can pay for my orders that I control.

  Background:
    * Launch the app
@21
  Scenario: TC_01 On the Payment Information page, the payment method must be selected under the
  Select Payment Method menu heading and the Confirm order button must be visible and active.

    * Click on the "Profile,"
    * Click on the "Sign In,"
    * Click on the "*Use Email Instead,"
    * "bytEmail" is entered
    * "Password" is entered
    * Click on the "518,1057"
    * Click on the "Profile,"
    * Verify that "Order History" is visible
    * Verify that "Order History" is active

