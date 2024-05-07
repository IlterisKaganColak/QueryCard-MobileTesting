@HS
Feature: US_004 As a registered user, I would like to have a page in my Dashboard where I can view my shopping history
  Background:
    * Launch the app
    * Verify access to "homepage"
    * Verify that "Profile" is visible
    * Verify that "Profile" is active
    * Click on the "Profile"
  @04/01
  Scenario: TC_01 The profile icon should be visible and active at the bottom bar of the home page.
    * Verify that "Sing In To See Your Info" is visible
  @04/02
  Scenario: TC_02 The signUp button should be visible on the left side of the Register page.
    * Verify that "Sign Up" is visible
    * Verify that "Sign Up" is active
  @04/03
  Scenario: TC_03 SignUp button should be visible and active under the SignUp form.
    * Verify that "Sign Up" is visible
    * Verify that "Sign Up" is active
    * Click on the "Sign Up"
    * Verify that "Sign Up" is visible
    * Verify that "Sign Up" is active
  @04/04
  Scenario: TC_04 The SignUp form must have fields (Firstname, Email or Phone, Password) that cannot be left blank.
    * Verify that "Sign Up" is visible
    * Verify that "Sign Up" is active
    * Click on the "Sign Up"
    * Verify that "Sign Up" is visible
    * Verify that "Sign Up" is active
    * Verify that "Name" is visible
    * Verify that "Phone" is visible
    * Verify that "Password" is visible
    * Verify that "*Use Email Instead" is visible
    * Verify that "*Use Email Instead" is active
    * Click on the "*Use Email Instead"
#  Scenario: TC_05 The SignUp form must have fields (Firstname, Email or Phone, Password) that cannot be left blank.
#    * Verify that "Sign Up" is visible
#    * Verify that "Sign Up" is active
#    * Click on the "Sign Up"
#    * Verify that "Sign Up" is visible
#    * Verify that "Sign Up" is active
#    * Click on the "Sign Up"
#  Scenario: TC_06 The SignUp form must have fields (Firstname, Email or Phone, Password) that cannot be left blank.
#    * Verify that "Sign Up" is visible
#    * Verify that "Sign Up" is active
#    * Click on the "Sign Up"
#    * Verify that "Sign Up" is visible
#    * Verify that "Sign Up" is active
#    * Click on the "Sign Up"