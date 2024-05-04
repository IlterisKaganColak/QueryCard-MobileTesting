
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
      * Verify that "textbox" is visible
      * Verify that "textbox" is active

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
      * Click on the "use email instead"
      * Registered email is entered
      * Click on the "Get OTP"
      * Verify that "New Password" is visible
      * Verify that "Confirm Password" is visible
      * Verify that "Submit" is visible
      * Verify that "New Password" is active
      * Verify that "Confirm Password" is active
      * Verify that "Submit" is active
      * Enter the new password(at least 6 characters) into the new password textbox.
      * Re-enter the new password in the Confirm password text box.
      * Click on the "Submit"
      * Verify that "successfully" is visible

    Scenario: TC_05 Negative senario
      * Click on the "Forgot Password"
      * Click on the "use email instead"
      * Registered email is entered
      * Click on the "Get OTP"
      * Enter the new password(up to 5 characters) into the new password textbox.
      * Re-enter the new password in the Confirm password text box.
      * Click on the "Submit"
      * It appears that the page has not changed