@017
Feature: US_017 As a registered user, I want to change the password on my dashboard page.

  Background:
    * Launch the app
    * Click on the "profile"

    Scenario: TC_01 The Change Password link on the Control Panel appears and must be active.
    * Verify that the "Change Password" is visible
    * Verifies that the "Change Password" is active

    Scenario: TC_02 On the Change Password page, Old password, New password,
    Confirm password text boxes and Save Change button appear and must be active.
     * Click on the "Change Password"
     * Verify that the "Old Password" is visible
     * Verify that the "New Password" is visible
     * Verify that the "Confirm Password" is visible
     * Verify that the "Save Change" is visible
     * Verify that the "Old Password" is active
     * Verify that the "New Password" is active
     * Verify that the "Confirm Password" is active
     * Verify that the "Save Change" is active









