@HS @04
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
    * Verify that "Let's create your account" is visible
    * Verify that the Sign Up button is visible under the SignUp form
    * Verify that the Sign Up button is active
  @04/04
  Scenario: TC_04 The SignUp form must have fields (Firstname, Email or Phone, Password) that cannot be left blank.
    * Verify that "Sign Up" is visible
    * Verify that "Sign Up" is active
    * Click on the "Sign Up"
    * Verify that "Let's create your account" is visible
    * Verify that "Name" textBox is visible and enabled
    * Fill in "Name" textbox with "validName"
    * Verify that "Phone" textBox is visible and enabled
    * Fill in "Phone" textbox with "validPhone"
    * Verify that "Password" textBox is visible and enabled
    * Fill in "Password" textbox with "blankPassword"
    * Click on the Sign Up button
    * Verify that "Passord is required" is visible
  @04/05
  Scenario: TC_05 The SignUp form must have fields (Firstname, Email or Phone, Password) that cannot be left blank.
    * Verify that "Sign Up" is visible
    * Verify that "Sign Up" is active
    * Click on the "Sign Up"
    * Verify that "Let's create your account" is visible
    * Verify that "Name" textBox is visible and enabled
    * Fill in "Name" textbox with "validName"
    * Verify that "Phone" textBox is visible and enabled
    * Fill in "Phone" textbox with "blankPhone"
    * Verify that "Password" textBox is visible and enabled
    * Fill in "Password" textbox with "validPassword"
    * Click on the "Sign Up"
    * Verify that "This field is required" is visible
  @04/06
  Scenario: TC_06 The SignUp form must have fields (Firstname, Email or Phone, Password) that cannot be left blank.
    * Verify that "Sign Up" is visible
    * Verify that "Sign Up" is active
    * Click on the "Sign Up"
    * Verify that "Let's create your account" is visible
    * Verify that "Name" textBox is visible and enabled
    * Fill in "Name" textbox with "blankName"
    * Verify that "Phone" textBox is visible and enabled
    * Fill in "Phone" textbox with "validPhone"
    * Verify that "Password" textBox is visible and enabled
    * Fill in "Password" textbox with "validPassword"
    * Click on the "Sign Up"
    * Verify that "This field is required" is visible
  @04/07
  Scenario: TC_07 In order to register with phone number, it must be mandatory to enter at least 7 digit number.
    * Verify that "Sign Up" is visible
    * Verify that "Sign Up" is active
    * Click on the "Sign Up"
    * Verify that "Let's create your account" is visible
    * Verify that "Name" textBox is visible and enabled
    * Verify that "Phone" textBox is visible and enabled
    * Verify that "Password" textBox is visible and enabled
    * Fill in "Name" textbox with "validName"
    * Fill in "Phone" textbox with "invalidPhone"
    * Fill in "Password" textbox with "validPassword"
    * Click on the "Sign Up"
    * Verify that "Let's create your account" is visible
  @04/08
  Scenario: TC_08 In order to register with phone number, it must be mandatory to enter at least 7 digit number.
    * Verify that "Sign Up" is visible
    * Verify that "Sign Up" is active
    * Click on the "Sign Up"
    * Verify that "Let's create your account" is visible
    * Verify that "Name" textBox is visible and enabled
    * Verify that "Phone" textBox is visible and enabled
    * Verify that "Password" textBox is visible and enabled
    * Fill in "Name" textbox with "validName"
    * Fill in "Phone" textbox with "validPhone"
    * Fill in "Password" textbox with "validPassword"
    * Click on the "Sign Up"
    * Verify that "Sign In" is visible



