@20
Feature: US_020 As a registered user, when I forget my password, I want to create a new password and log in

  Background:
      * Launch the app
      * Click on the "Profile"
      * Click on the "Sign In"

    Scenario: TC_01 On the login page, the Forgot Password link should be visible and active
      * Verify that "Forgot Password" is visible
      * Verify that "Forgot Password" is active

    Scenario: TC_02 The textbox must be visible and accessible on the Forgot Password page
              that opens when the Forgot Password link is clicked.
      * Click on the "Forgot Password"
      * Verify that email textbox is visible
      * Verify that email textbox is active

    Scenario: TC_03 Get OTP button must be visible and active.Back to sign in button must be visible and active
      * Click on the "Forgot Password"
      * Verify that "Get OTP" is visible
      * Verify that "Get OTP" is active
      * Verify that "Back to sign in" is visible
      * Verify that "Back to sign in" is active

    Scenario: TC_04 New Password, Confirm Password text boxes should be visible
              and active on the Reset Password page Submit button should be visible and active,
              and when the valid password is entered, it should switch to the homepage.

      * Click on the "Forgot Password"
      * Click on the "*Use Email Instead"
      * Registered email is entered
      * Click on the "Get OTP"
      * Verify that "New Password" is visible
      * Verify that "Confirm Password" is visible
      * Verify that "Submit" is visible
      * Verify that "New Password" is active
      * Verify that "Confirm Password" is active
      * Verify that "Submit" is active
      * Enter the new password
      * Enter the Confirm password
      * Click on the "Submit"
     # * Verify that "Success" is visible

    Scenario: TC_05 Negative senario
      * Click on the "Forgot Password"
      * Click on the "*Use Email Instead"
      * Registered email is entered
      * Click on the "Get OTP"
      * Enter the "wrong new" password
      * Enter the "wrong confirm" password
      * Click on the "Submit"
      #* Verify that the page does not appear to have changed

      Scenario:
        * Click on the Forgot Password