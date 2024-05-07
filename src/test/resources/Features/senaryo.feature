Feature:As a registered user, I want to have a cart on the site and I want to be able to manage these cart operations
  Background:
    * Launch the app
  Scenario: urun satin alma

    * Wait for 2000 miliseconds
    * Click on the "Men"
#    favoriye eklemek için minik kalbe tıkla
    * Click on the favorite icon
    * Registered user logs in by using "zelihaEmail" and "Password" information
    * Click on the "Men"
    * Wait for 4000 miliseconds
#    favoriye eklemek için minik kalbe tıkla
    * Click on the favorite icon
    * Wait for 7000 miliseconds
#    geri ikonuna tıkla
    * Click on the "45,130"
    * Wait for 3000 miliseconds
    * Click on the "Wishlist"
    * Wait for 5000 miliseconds
    * Verify that first product listing is visible
    * Click on the first product
#    ilk ürüne tıkla
#    * Click on the "286,554"
#    renk seçeneğini seç
    * Click on the "120,1700"
    * Wait for 2000 miliseconds
    * Slide small
    * Wait for 2000 miliseconds
    * Scroll and click to "Add To Cart"
#    ürün detay sayfasının içinde sayfanın sağındaki cart iconu testi
#    sağdaki cart icon tıkla
    * Click on the "979,1692"
    * Wait for 3000 miliseconds
    * Verify that first product listing is visible
#     Click on the cart icon
    * Click on the "542,1654"
    * Wait for 3000 miliseconds
    * Verify that "Proceed to Checkout" is visible
    * Verify that "Proceed to Checkout" is active
    * Click on the "Proceed to Checkout"
#     "adres seç minik kutucuğuna tıkla
    * Click on the "95,501"
#     "save shipping address as a billing address" tıkla
    * Click on the "73,852"
    * Click on the "Save & Pay"