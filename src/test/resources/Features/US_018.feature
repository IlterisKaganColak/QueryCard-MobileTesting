Feature: US_010 As a registered user, I want to edit my profile info on my dashboard page.

  Background:
    * Registered user logs in by using "zelihaEmail" and "Password" information


  Scenario: [TC_01>US_018] Tested that Edit Profile link is visible and active on Dashboard page

    * Click on the "Profile"
    * Verify that "Edit Profile" is visible
    * Verify that "Edit Profile" is active

  Scenario: [TC_02>US_018] Tested that Full Name info is editable

    * Click on the "Profile"
    * Click on the "Edit Profile"
    # isim textbox una tıkla
    * Click on the "408,515"
    * Send "Ömer Yiğit" to full name textbox
    # klavyeyi kapat
    * Click on the "1000,1718"
    * Click on the "Save Changes"
    * Wait for 1000 miliseconds
    * Verify that "PROFILE_UPDATE" is visible


  Scenario: [TC_03>US_018] Tested that email info is editable

    * Click on the "Profile"
    * Click on the "Edit Profile"
    # Email textbox una tıkla
    * Click on the "700,744"
    * Send "zeliha@querycart.com" to eMail textbox
    # klavyeyi kapat
    * Click on the "1000,1718"
    * Click on the "Save Changes"
    * Wait for 1000 miliseconds
    * Verify that "PROFILE_UPDATE" is visible



  Scenario: [TC_04>US_018] Tested that phone number info is editable

    * Click on the "Profile"
    * Click on the "Edit Profile"
#  verify that phone number info can be edited

  Scenario: [TC_05>US_018] Tested that phone number info is editable

    * Click on the "Profile"
    * Click on the "Edit Profile"
#  verify that phone number info can be edited

  Scenario: [TC_06>US_018] Tested that phone number info is not editable with non-digit character
  (negative test)

    * Click on the "Profile"
    * Click on the "Edit Profile"
#  verify that phone number info can not be edited with not-digit character


  Scenario: [TC_07>US_018] Tested that email info is not editable with non-digit character
  (negative test)

    * Click on the "Profile"
    * Click on the "Edit Profile"
    # Email textbox una tıkla
    * Click on the "700,744"
    * Send "zelihaquerycart.com" to eMail textbox
    # klavyeyi kapat
    * Click on the "1000,1718"
    * Click on the "Save Changes"
    * Wait for 0 second
    * Verify that "PROFILE_UPDATE" is visible



