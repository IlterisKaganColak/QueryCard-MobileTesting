**THINGS TO CONSIDER NAMING**

**_Locate Naming_**

X = Name of the item.

| Element Type  | Variable name |
|---------------|---------------|
| Button        | XButton       |
| Logo          | logoX         |
| Icon          | iconX         |
| Text          | labelX        |
| Drop Down     | dropDownX     |
| Radio Button  | radioButtonX  | 
| Check Box     | checkBoxX     |
| Box           | XBox          |
| Table Column  | columnX       |
| Table Row     | rowX          |
| Any Image     | imageX        |
| Product Image | imageProductX |
| Links         | linkX         |

Note: Make sure it is a camel case.

**_Feature Naming_**

Sample= US_001.feature
    
    Feature: US_014-As a user, I would like to have various functions in the home page body section to make shopping easier.

        @Murat @US_014-TC_001
        Scenario: TC_001-The user should be able to see the all products listed in the 'Best Deals' body section.

        Given User goes to "https://qa.buysellcycle.com".


        -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        **THINGS TO CONSIDER ON GITHUB**

**_PULL OPERATION_**

1- Perform "git pull" on the Main branch.

2- Switch to our own branch and perform "git merge main" operation.

**_COMMIT OPERATION_**

1- Use git add with the modified file path! (Sample: git add src)

2- git commit -m "MM.DD.YY/name-2" (Sample: git commit -m "03.28.24/Yusuf-3")

3- git push

Note: Before each operation, make sure you are not on the main branch. 

If changes are required on the main branch or if any encountered errors need resolution, communicate with the lead.
While adding to Github, never use git add .!


-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

**GENERAL FEATURE STEPS**

**_User Sign In Steps_**

User goes to the buysellcyle homepage.

User clicks on the Log In button and displays the sign in page.

User clicks on the Email address or phone box and enters a valid "email".

User clicks on the Password box and enters a valid "password".

User clicks on the Sign In button.

User displays the user dashboard page.

User closes the page.

**_Admin Sign In Steps_**

Admin goes to the admin login page.

Admin clicks on the Email address or phone box and enters a valid "email".

Admin clicks on the Password box and enters a valid "password".

Admin clicks on the Sign In button.

Admin displays the admin dashboard page.

Admin closes the page.

**_Other Useful Steps_** 

User waits for 1 second(s).

