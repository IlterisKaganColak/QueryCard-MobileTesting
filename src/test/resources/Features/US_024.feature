Feature:As a registered user, I want to have a cart on the site and I want to be able to manage these cart operations

  Background:
    * Registered user logs in by using "zelihaEmail" and "Password" information

  Scenario: [TC_01>US_024] Tested that cart icon is visible and active on the homepage

#    sayfanın ortasındaki cart iconu testi
    * Verify that cart icon is visible
    * Verify that cart icon is enabled

  Scenario: Tested that cart icon is visible and active on the homepage

#    ürün detay sayfasının içinde sayfanın sağındaki cart iconu testi
    * Verify that cart icon right is visible
    * Verify that cart icon right is enabled

  Scenario: [TC_02>US_024] Tested that on the Shopping Cart page, products added to the cart is displayed

    * Click on the cart icon
#   * Click on the cart right icon
    * Verify that first product listing is visible
#    urun sayisi arttir
#   * Click on the product qty up icon

#    urun sayisi azalt
#   * Click on the product qty down icon


  Scenario: [TC_03>US_024] Tested that on the Shopping Cart page, products added to the cart can be deleted

    * Click on the cart icon
    * Verify that first product listing is visible
    * Click on the remove icon
# ürünün silindiğine dair bir tost mesajı çıkmadığı için silinme testi manual yapıldı

  Scenario: [TC_04>US_024] Tested that subtotal information is visible

    * Click on the cart icon
    * Verify that "subtotal" is visible
    * Verify that "$" is visible

  Scenario: [TC_05>US_024] Tested that prooceed to Checkout button is visible and active and redirect to the checkout page

    * Click on the cart icon
    * Verify that "Proceed to Checkout" is visible
    * Verify that "Proceed to Checkout" is active
    * Click on the "Proceed to Checkout"
    # "adres seç minik kutucuğuna tıkla
    * Click on the "95,501"
    # "save shipping address as a billing address" tıkla
    * Click on the "73,852"
    * Click on the "Save & Pay"


  Scenario: [TC_06>US_024] Tested that If there are no items left in the cart, return to shopping (Go to Shopping button must be visible and active)

    * Click on the cart icon
    * Verify that "Go to Shopping" is visible
    * Verify that "Go to Shopping" is active


