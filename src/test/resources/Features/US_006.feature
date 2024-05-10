@HS @6
Feature: US_006 As a user, I want to be able to see all the categories on the site under the Categories heading.
  Background: Category icon should be visible and active in the home page navbar. Men/Women/Junior headings should be visible and active.
    * Launch the app
    * Verify access to "homepage"
    * Verify that "Category" is visible
    * Verify that "Category" is active
    * Click on the "Category"
    * Verify that "Men" is visible
    * Verify that "Men" is active
    * Verify that "Women" is visible
    * Verify that "Women" is active
    * Verify that "Juniors" is visible
    * Verify that "Juniors" is active
  @HS @6 @601
  Scenario: TC_01 Men Filter icons must be active.
    * Click on the "Men"
    * Verify that filtering icon is visible
    * Click filtering icon
    * Verify that "Sort By" is visible
    * Verify that "Sort By" is active
    * Verify that "Brands" is visible
    * Verify that "Brands" is active
    * Verify that "size" is visible
    * Verify that "size" is active
    * Verify that "color" is visible
    * Verify that "color" is active
  @HS @6 @602
  Scenario: TC_02 Women Filter icons must be active.
    * Click on the "Women"
    * Verify that filtering icon is visible
    * Click filtering icon
    * Verify that "Sort By" is visible
    * Verify that "Sort By" is active
    * Verify that "Brands" is visible
    * Verify that "Brands" is active
    * Verify that "size" is visible
    * Verify that "size" is active
    * Verify that "color" is visible
    * Verify that "color" is active
  @HS @6 @603
  Scenario: TC_03 Junior Filter icons must be active.
    * Click on the "Juniors"
    * Verify that filtering icon is visible
    * Click filtering icon
    * Verify that "Sort By" is visible
    * Verify that "Sort By" is active
    * Verify that "Brands" is visible
    * Verify that "Brands" is active
    * Verify that "size" is visible
    * Verify that "size" is active
    * Verify that "color" is visible
    * Verify that "color" is active