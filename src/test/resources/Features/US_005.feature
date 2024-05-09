@HS @5
Feature: US_004 As a registered user, I would like to have a page in my Dashboard where I can view my shopping history
  Background:
    * Launch the app
    * Verify access to "homepage"
    * Verify that "Profile" is visible
    * Verify that "Profile" is active
    * Click on the "Profile"
  @501
  Scenario: TC_01 Profile link should be visible on the home page and redirect to the SıgnIn page
    * Verify that "Sing In To See Your Info" is visible
  @502
  Scenario: TC_02 SignIn button must be visible and active on the login page.
    * Verify that "Sign In" is visible
    * Verify that "Sign In" is active
    * Click on the "Sign In"
    * Verify that the Sign In button is visible and active on the login page
  @503
  Scenario: TC_03 SignIn button must be visible and active on the login page.
    * Verify that "Sign In" is visible
    * Verify that "Sign In" is active
    * Click on the "Sign In"
    * Verify that "Remember me" is visible
    * Verify that "Remember me" is active
    * Verify that "Remember me" is selected
  @504
  Scenario: TC_04 You should be able to access the Forgot Password page from the Login page.
    * Verify that "Sign In" is visible
    * Verify that "Sign In" is active
    * Click on the "Sign In"
    * Verify that "Forgot Password" is visible
    * Verify that "Forgot Password" is active
    * Click on the "Forgot Password"
    * Verify that "Get OTP" is visible
  @505
  Scenario: TC_05 It should be possible to switch from the Login page to the Register page.
    * Verify that "Sign In" is visible
    * Verify that "Sign In" is active
    * Click on the "Sign In"
    * Verify that "Sign Up" is visible
    * Verify that "Sign Up" is active
    * Click on the "Sign Up"
    * Verify that "Let's create your account" is visible
  @506
  Scenario: TC_06 Error messages should be displayed when entering invalid information in the login form and clicking the signIn button.
    * Verify that "Sign In" is visible
    * Verify that "Sign In" is active
    * Click on the "Sign In"
    * Verify that "*Use Email Instead" is visible
    * Verify that "*Use Email Instead" is active
    * Click on the "*Use Email Instead"
    * Try to log in by using "invalidEmail" and "Password" information
    * Click on the "Sign In"
    * Verify that Error message is visible


