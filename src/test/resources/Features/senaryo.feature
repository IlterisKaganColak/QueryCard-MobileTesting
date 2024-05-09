Feature:As a registered user, I want to have a cart on the site and I want to be able to manage these cart operations
  Background:
    * Launch the app
    @senaryo
  Scenario: urun satin alma
#Calistirmadan once sign in methodundaki clickElement("Sign In"); methodunu yoruma almayi unutma!!!!
    * Wait for 1000 miliseconds
    * Click on the first product in the Most Popular list
    * Click on the "Favorite"
    * Registered user logs in by using "simgeEmail" and "Password" information
    * Wait for 1000 miliseconds
      #Annesi için elbise
    * Click on the first product in the Most Popular list
    * Wait for 4000 miliseconds
    * Slide small
    * Wait for 2000 miliseconds
    * Click on the "S"
    * Wait for 1000 miliseconds
    * Click on the "Add To Cart"
    * Navigate to the previous page
    * Click on the "Men"
      #Murat Hoca için adidas ayakkabı
    * Click on the second product in the men page
    * Wait for 2000 miliseconds
    * Click on the "White"
    * Click on the "Add To Cart"
    * Navigate to the previous page
      #Ahmet Hoca için deri çanta
    * Slide small
    * Slide small
    * Slide small
    * Click on the eighth product in the men page
    * Wait for 2000 miliseconds
    * Click on the "Black"
    * Click on the "Add To Cart"
    * Navigate to the previous page
      #Emre Hoca için puffer ceket
    * Slide small
    * Slide small
    * Click on the eleventh product in the men page
    * Wait for 2000 miliseconds
    * Click on the "M"
    * Click on the "Add To Cart"
    * Navigate to the previous page
      #Recep Hoca için saat
    * Slide small
    * Click on the fourteenth product in the men page
    * Wait for 2000 miliseconds
    * Click on the "Brown"
    * Click on the "Add To Cart"
    * Navigate to the previous page
    * Navigate to the previous page
   # * Slide categories
    * Click on the "Women"
      #Dilan Hoca için ayakkabı
    * Click on the third product in the women page
    * Wait for 2000 miliseconds
    * Click on the "White"
    * Click on the "Add To Cart"
    * Navigate to the previous page
      #Özge Hoca için parka
    * Slide small
    * Slide small
    * Slide small
    * Slide small
    * Slide small
    * Click on the eleventh product in the women page
    * Wait for 2000 miliseconds
    * Click on the "S"
    * Click on the "Add To Cart"
    * Click on the Cart icon in product details page
    * Wait for 2000 miliseconds
    * Click on the "Proceed to Checkout"

