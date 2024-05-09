@zs
Feature: US_010 As a user, I would like to be able to see the categories and products of the Men menu on the home page.

  Background:
    * Launch the app

  Scenario: [TC_01>US_010] Tested that Men category window should be visible and active in the home page body section
    * Verify that "Men" is visible

  Scenario: [TC_02>US_010] Tested that adding to cart is possible on the products on the men category page.
    * Click on the "Men"
    #    ilk ürüne tıkla
    * Click on the "286,554"
    #    black seçeneğini seç
    * Click on the "120,1700"
    * Scroll and click to "Add To Cart"
    * Verify that "Success Product added to cart" is visible

  Scenario: [TC_03>US_010] Tested that adding to wishlist is possible on the products on the men category page.

    * Click on the "Men"
    #    favoriye eklemek için minik kalbe tıkla
    * Click on the favorite icon
    * Registered user logs in by using "zelihaEmail" and "Password" information
    * Click on the "Wishlist"
    * Verify that first product listing is visible

  Scenario: [TC_04>US_010] Tested that viewing is possible on the products on the men category page.

    * Click on the "Men"
    * Click on the first product
    * Verify that first product listing is visible

  Scenario: [TC_05>US_010] Tested that Filtering icons is visible

    * Click on the "Men"
    * Verify that filtering icon is visible

  Scenario: [TC_06>US_010] Tested that Sort by filtering icon is active

    * Click on the "Men"
    * Click filtering icon
    #    * Verify that sort by icon is active
    * Verify that "Sort By" is visible
    * Verify that "Sort By" is active
    * Click on the "Sort By"
    #    newest seçeneğini seç
    * Click on the "103,435"
    * Verify that filtering icon is visible

#BUG
  Scenario: [TC_07>US_010] Tested that Brands filtering icon is active

    * Click on the "Men"
    * Click filtering icon
    * Verify that "Brands" is visible
    * Verify that "Brands" is active
    * Click on the "Brands"
    #    ilk marka seçeneğini seç
    * Click on the "73,531"
    * Verify that filtering icon is visible

#BUG
  Scenario: [TC_08>US_010] Size filtering icon is active

    * Click on the "Men"
    * Click filtering icon
    * Verify that "size" is visible
    * Verify that "size" is active
    #    s beden seçeneğini seç
    * Click on the "73,702"
    #    ürün sayfasına gittiğini kontrol etmek için
    * Verify that filtering icon is visible

#BUG
  Scenario: [TC_09>US_010] Color filtering icon is active

    * Click on the "Men"
    * Click filtering icon
    * Verify that "color" is visible
    * Verify that "color" is active
    #    black seçeneğini seç
    * Click on the "70,1190"
    #    ürün sayfasına gittiğini kontrol etmek için
    * Verify that filtering icon is visible