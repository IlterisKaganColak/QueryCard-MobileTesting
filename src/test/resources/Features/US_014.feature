Feature: US_014 As a registered user, I would like to have a page on the site where I can manage my address information


  Background:
    * Sign in user enters email inbox "yusufEmail" than enter password inbox "yusufPassword"  sign in profile


  @[TC_01>US_014]
  Scenario:Profile icon should be visible and active on the home page.

    * Click on the "Profile"
    * Click on the "Address"
    * Verify that "Address" is visible

  @[TC_02>US_014]
  Scenario:Profile icon should be visible and active on the home page.
    * Launch the app
    * Click on the "Profile"
    * Click on the "Address"
    * Verify that "Address" is visible

  @[TC_03>US_014]
  Scenario:Profile icon should be visible and active on the home page.
    * Launch the app
    * Click on the "Profile"
    * Click on the "Address"
    * Verify that "Address" is visible

  @[TC_04>US_014]
  Scenario:Registered addresses should be visible, editable and deleteable on the Address page

    * Launch the app
    * Click on the "Profile"
    * Click on the "Address"
    * Click red button , delete ikon from first adress
    * Verify that  Success Adress Deleted Successfully message is visible

  @[TC_05>US_014]
  Scenario:New address records should be added

    * Launch the app
    * Click on the "Profile"
    * Click on the "Address"
    * Click on the "Add New Address"
    * Fills in information
