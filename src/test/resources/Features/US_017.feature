@17
Feature: US_017 As a registered user, I want to change the password on my dashboard page.

  Background:
    * Launch the app

  Scenario: TC_01 The Change Password link on the Control Panel appears and must be active.
    * Registered user logs in by using "zehraEmail" and "zehraPassword" information
    * User waits for 1 seconds
    * Click on the "Profile"
    * Verify that "Change Password" is visible
    * Verify that "Change Password" is active

  Scenario: TC_02 On the Change Password page, Old password, New password,
  Confirm password text boxes and Save Change button appear and must be active.
    * Registered user logs in by using "zehraEmail" and "zehraPassword" information
    * User waits for 1 seconds
    * Click on the "Profile"
    * Click on the "Change Password"
    * Verify that "Old Password" is visible
    * Verify that "New Password" is visible
    * Verify that "Confirm Password" is visible
    * User waits for 1 seconds
    * Verify that "Save Changes" is visible
    * Verify that "Old Password" is active
    * Verify that "New Password" is active
    * Verify that "Confirm Password" is active
    * Verify that "Save Changes" is active

  Scenario: TC_03 Changes made must be saved successfully
    * Registered user logs in by using "zehraEmail" and "zehraPassword" information
    * User waits for 1 seconds
    * Click on the "Profile"
    * Click on the Change Password
    * Click on the "1010,1747"
    * Click on the "Save Changes"
      #* Verify that  message is visible

  Scenario Outline: TC_04 Negative senario
    * Registered user logs in by using "zehraEmail" and "zehraOldPassword" information
    * User waits for 1 seconds
    * Click on the "Profile"
    * Click on the "Change Password"
    * Enter the "<old>" password
    * Enter the wrong "<new password>"
    * Enter the wrong "<confirm password>"
    * Click on the "1010,1747"
    * User waits for 1 seconds
    * Click on the "Save Changes"
     # * Verify that error message is visible
    Examples:
      | old    | new password | confirm password |
      | 123456 | 123          | 123              |







