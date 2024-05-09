Feature:As a registered user, I want to have a cart on the site and I want to be able to manage these cart operations
  Background:
    * Launch the app
    @senaryo
  Scenario Outline: urun satin alma
  #Calistirmadan once sign in methodundaki clickElement("Sign In"); satirini yoruma almayi unutma!!!!
    * Wait for 1000 miliseconds
    * Click on the first product in the Most Popular list
    * Click on the "Favorite"
    * Registered user logs in by using "simgeEmail" and "Password" information
    * Wait for 1000 miliseconds
      #Annesi için elbise
    * Click on the first product in the Most Popular list
    * Wait for 2000 miliseconds
    * Slide small
    * Wait for 2000 miliseconds
    * Click on the "S"
    * Wait for 1000 miliseconds
    * Click on the "Add To Cart"
    * Navigate to the previous page
    * Click on the "Men"
    * Wait for 3000 miliseconds
      #Murat Hoca ve Nevzat Hoca için adidas ayakkabı
    * Click on the second product in the men page
    * Wait for 2000 miliseconds
    * Click on the "White"
    * Click on the "Add To Cart"
    * Click on the "Add To Cart"
    * Navigate to the previous page
      #Ahmet Hoca için deri çanta
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
    * Click on the "Women"
    * Wait for 2000 miliseconds
      #Dilan Hoca için ayakkabı
    * Click on the third product in the women page
    * Wait for 2000 miliseconds
    * Click on the "White"
    * Wait for 1000 miliseconds
    * Click on the "Add To Cart"
    * Navigate to the previous page
      #Özge Hoca ve Elif Hoca için parka
    * Slide small
    * Slide small
    * Slide small
    * Slide small
    * Click on the eleventh product in the women page
    * Wait for 2000 miliseconds
    * Click on the "S"
    * Click on the "Add To Cart"
    * Click on the "Add To Cart"
    * Click on the Cart icon in product details page
    * Wait for 2000 miliseconds
    * Click on the "Proceed to Checkout"
    * Select the address
    * Slide small
    * Slide small
    * Click on the "Save & Pay"
    * Click on the "Stripe"
    * Wait for 2000 miliseconds
    * Click on the "Confirm Order"
    * Wait for 4000 miliseconds
    * Click on the card element
    * Wait for 2000 miliseconds
    * Enter valid "<Card Number>", "<Card Date>", "<CVC Code>" and "<ZIP Code>"
    * Wait for 2000 miliseconds
    * Click on the Confirm Button
    * Wait for 3000 miliseconds
      Examples:
        | Card Number       | Card Date | CVC Code | ZIP Code |
        | 4242424242424242  |  1229     | 333      | 12345    |



