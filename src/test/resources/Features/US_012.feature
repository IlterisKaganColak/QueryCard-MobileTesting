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

  @[TC_04>US_012]
    Scenario:The products on the Women category page should be able to perform actions (add to cart, add to favorites list and view).
    * Launch the app
    * Click on the "Category"
    * Click on the "Women"
      # white seçeneğini seç
    * Click on the "130,1336"
    * Click on the "Favorite"
    * Verify that "Success Product added to cart" is visible

  @[TC_05>US_012]
  Scenario: Filtering icons should be visible and work correctly

    * Click on the "Women"
    * Click filtering icon
    * Verify that "Brands" is visible
    * Verify that "Brands" is active
    * Click on the "Brands"
    * Click on the "73,531"
    * Verify that filtering icon is visible

  @[TC_06>US_012]
  #BUG
  Scenario:  Tested that Brands filtering icon is active

    * Click on the "Women"
    * Click filtering icon
    * Verify that "Brands" is visible
    * Verify that "Brands" is active
    * Click on the "Brands"
    * Click on the "73,531"
    * Verify that filtering icon is visible

  @[TC_07>US_012]

  Scenario: [TC_09>US_010] Color filtering icon is active

    * Click on the "Women"
    * Click filtering icon
    * Verify that "color" is visible
    * Verify that "color" is active
    * Click on the "70,1190"
    * Verify that filtering icon is visible
