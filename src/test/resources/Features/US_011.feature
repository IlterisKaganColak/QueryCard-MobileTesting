Feature: US_011 As a user, I would like to be able to see the categories and products of the Juniors menu on the home page.

  Background:
   #* Launch the app

  Scenario: TC_01 Juniors category window should be displayed in the main page body.
    # * Verify access to "homepage"
    # * Click on the _categoryButton_
    # * Verify that the _juniorCategoryButton_ is visible

  Scenario: TC_02 The Juniors category page should be able to perform actions on the products (add to cart and view).
    # * Click on the _juniorCategoryButton_
    # * Click on a product
    # * Click on color button
    # * Click on minus button
    # * Click on Add to Cart button
    # * Verify that the Success message is visible

  Scenario: TC_03 In the Juniors category page, user should be able to add products to favorites list.
    #     BUG_01
    # Expected : Favorite button should be active.
    # Actual : Favorite button is NOT active.
    # Description : When clicked on the Favorite Button, Sign In page opens.
    #               User can not add products to favorites list without registering the site.

  Scenario: TC_04 Filtering icons should be visible and active
    # * Verify that the "filterIcon" is visible
    # * Verify that "filterIcon" is active
    # * Verify that the "filterSortingPage" is visible

