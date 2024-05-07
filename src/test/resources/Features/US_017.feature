@17
Feature: US_017 As a registered user, I want to change the password on my dashboard page.

  Background:
    * Launch the app
    * Registered user logs in by using "zehraEmail" and "zehraPassword" information
    * User waits for 1 seconds
    * Click on the "Profile"

    Scenario: TC_01 The Change Password link on the Control Panel appears and must be active.
    * Verify that "Change Password" is visible
    * Verify that "Change Password" is active

    Scenario: TC_02 On the Change Password page, Old password, New password,
    Confirm password text boxes and Save Change button appear and must be active.
     * Click on the "Change Password"
     * Verify that "Old Password" is visible
     * Verify that "New Password" is visible
     * Verify that "Confirm Password" is visible
     * User waits for 1 seconds
     * Verify that "Save Change" is visible
     * Verify that "Old Password" is active
     * Verify that "New Password" is active
     * Verify that "Confirm Password" is active
     * Verify that "Save Change" is active

    Scenario: TC_03 Changes made must be saved successfully
      * Click on the Change Password
      * Click on the "1010,1747"
      * Click on the "Save Changes"
      #* Verify that  message is visible

    Scenario: TC_04 Negative senario

      * Click on the "Change Password"
      * Enter the "old" password
      * Enter the "wrong new" password
      * Enter the "wrong confirm" password
      * Click on the "1010,1747"
      * User waits for 1 seconds
      * Click on the "Save Changes"
     # * Verify that error message is visible







