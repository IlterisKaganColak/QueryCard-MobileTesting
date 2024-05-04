Feature: US_010 As a user, I would like to be able to see the categories and products of the Men menu on the home page.

  Background:
    * Launch the app
    * Click on the "Profile"

  Scenario: [TC_01>US_010] Tested that Men category window should be visible and active in the home page body section
    * Verify that "Men" is visible

  Scenario: [TC_02>US_010] Tested that adding to cart is possible on the products on the men category page.
    * Click on the "Men"
#    ilk ürüne tıkla
    * Click on the "286,554"
#    black seçeneğini seç
    * Click on the "120,1700"
    * scroll "1" time roller
    * Click on the "Add To Cart"
    * Verify that "Success Product added to cart" is visible



  Scenario: [TC_03>US_010] Tested that adding to wishlist is possible on the products on the men category page.


  click Men button on homepage
  click the first product
  select "black" color option
  scroll "1" time roller
  verify product can be added to wishlist


  Scenario: [TC_04>US_010] Tested that viewing is possible on the products on the men category page.


  click Men button on homepage
  click the first product
  verify product can be viewed


  Scenario: [TC_05>US_010] Tested that Filtering icons is visible


  click Men button on homepage
  verify filtering icon is visible


  Scenario: [TC_06>US_010] Tested that Sort by filtering icon is active


  click Men button on homepage
  click filtering icon
  verify "sortby" filter is active


  Scenario: [TC_07>US_010] Tested that Brands filtering icon is active


  click Men button on homepage
  click filtering icon
  verify "brands" filter is active



  Scenario: [TC_08>US_010] Size filtering icon is active


  click Men button on homepage
  click filtering icon
  verify "size" filter is active


  Scenario: [TC_09>US_010] Color filtering icon is active


  click Men button on homepage
  click filtering icon
  verify "color" filter is active