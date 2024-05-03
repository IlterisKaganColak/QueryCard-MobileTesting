@017
Feature: US_017 As a registered user, I want to change the password on my dashboard page.

  Background:
    * Launch the app
    * Click on the "profile"

    Scenario: TC_01 The Change Password link on the Control Panel appears and must be active.
    * Verify that "Change Password" is visible
    * Verify that "Change Password" is active

    Scenario: TC_02 On the Change Password page, Old password, New password,
    Confirm password text boxes and Save Change button appear and must be active.
     * Click on the "Change Password"
     * Verify that "Old Password" is visible
     * Verify that "New Password" is visible
     * Verify that "Confirm Password" is visible
     * Verify that "Save Change" is visible
     * Verify that "Old Password" is active
     * Verify that "New Password" is active
     * Verify that "Confirm Password" is active
     * Verify that "Save Change" is active









