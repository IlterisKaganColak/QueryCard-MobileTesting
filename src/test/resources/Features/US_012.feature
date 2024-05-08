

Feature: US_012 As a user, I would like to be able to see the categories and products of the Women menu on the home page.



  Background:
    * Registered user logs in by using "yusufEmail" and "yusufPassword" information

  @[TC_01>US_012]
   Scenario:TC_01 Women category window should be displayed in the body section of the home page.
    * Launch the app
    * Click on the "Category"
    * Verify that "Women" is visible

  @[TC_02>US_012]
    Scenario:The products on the Women category page should be able to perform actions (add to cart, add to favorites list and view).

      * Launch the app
      * Click on the "Category"
      * Click on the "Women"
      # white seçeneğini seç
      * Click on the "130,1336"
      * Click on the "Add To Cart"
      * Verify that "Success Product added to cart" is visible
  @[TC_03>US_012]