Feature:As a registered user, I want to have a cart on the site and I want to be able to manage these cart operations
  Background:
    * Launch the app
    @senaryo
  Scenario: urun satin alma
#Calistirmadan once sign in methodundaki clickElement("Sign In"); methodunu yoruma almayi unutma!!!!
    * Wait for 2000 miliseconds
    * Click on the first product in the Most Popular list
    * Click on the "Favorite"
    * Registered user logs in by using "simgeEmail" and "Password" information
    * Wait for 2000 miliseconds
      #Annesi için elbise
    * Click on the first product in the Most Popular list
    * Wait for 2000 miliseconds
    * Click on the "S"
    * Click on the "Add To Cart"
    * Navigate to the previous page
    * Click on the "Men"
      #Murat Hoca için adidas ayakkabı
    * Click on the second product in the men page
    * Click on the "White"
    * Click on the "Add To Cart"
    * Navigate to the previous page
      #Ahmet Hoca için deri çanta
    * Slide small
    * Slide small
    * Slide small
    * Click on the eighth product in the men page
    * Click on the "Black"
    * Click on the "Add To Cart"
    * Navigate to the previous page
      #Emre Hoca için deri çanta
    * Slide small
    * Slide small
    * Slide small
    * Click on the eleventh product in the men page
    * Click on the "Black"
    * Click on the "Add To Cart"
    * Navigate to the previous page
      #Recep Hoca için saat
    * Slide small
    * Slide small
    * Slide small
    * Slide small
    * Click on the fourteenth product in the men page
    * Click on the "Brown"
    * Click on the "Add To Cart"
    * Navigate to the previous page
    * Navigate to the previous page
   # * Slide categories
    * Click on the "Women"
      #Dilan Hoca için ayakkabı
    * Click on the third product in the women page
    * Click on the "White"
    * Click on the "Add To Cart"
    * Navigate to the previous page
      #Özge Hoca için parka
    * Slide small
    * Slide small
    * Slide small
    * Slide small
    * Click on the eleventh product in the women page
    * Click on the "S"
    * Click on the "Add To Cart"
    * Click on the Cart icon in product details page
    * Click on the "Proceed to Checkout"





   # * Click on the "Men"
    * Wait for 4000 miliseconds
#    favoriye eklemek için minik kalbe tıkla
    * Click on the "Favorite"
   # * Click on the favorite icon
    * Wait for 7000 miliseconds
#    geri ikonuna tıkla
    * Navigate to the previous page
    #* Click on the "45,130"
    * Wait for 3000 miliseconds
    * Click on the "Wishlist"
    * Wait for 5000 miliseconds
   # * Verify that first product listing is visible
    * Click on the first product
#    ilk ürüne tıkla
#    * Click on the "286,554"
#    renk seçeneğini seç
    * Click on the "120,1700"
    * Wait for 2000 miliseconds
    * Slide small
    * Wait for 2000 miliseconds
   # * Scroll and click to "Add To Cart"
    * Click on the "Add to Cart"
#    ürün detay sayfasının içinde sayfanın sağındaki cart iconu testi
#    sağdaki cart icon tıkla
    * Click on the "979,1692"
    * Wait for 3000 miliseconds
   # * Verify that first product listing is visible
#     Click on the cart icon
    * Click on the "542,1654"
    * Wait for 3000 miliseconds
   # * Verify that "Proceed to Checkout" is visible
   # * Verify that "Proceed to Checkout" is active
    * Click on the "Proceed to Checkout"
#     "adres seç minik kutucuğuna tıkla
    * Click on the "95,501"
#     "save shipping address as a billing address" tıkla
    * Click on the "73,852"
    * Click on the "Save & Pay"