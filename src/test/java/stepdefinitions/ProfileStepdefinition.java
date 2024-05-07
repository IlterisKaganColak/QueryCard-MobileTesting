package stepdefinitions;
import Page.ProfilePage;
import hooks.Base;
import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.*;

public class ProfileStepdefinition extends Base {
    //simge
    @Given("Registered user logs in by using {string} and {string} information")
    public void registered_user_logs_in_by_using_and_information(String validEmail, String validPassword) throws InterruptedException {
        profilePage.signIn(validEmail, validPassword);
    }

    @Given("Click on the {string}")
    public void click_on_the(String clickItem) throws InterruptedException {
      clickElement(clickItem);
    }

    @Given("Verify that {string} is visible")
    public void verify_that_is_visible(String elementText) throws InterruptedException {
        scrollToElementWithText(elementText);
        isVisible(elementText);
    }

    @Given("Verify that {string} is active")
    public void verify_that_is_active(String elementText) throws InterruptedException {
        scrollToElementWithText(elementText);
        isEnable(elementText);
    }
    @Given("Verify that Shopping History Display Icon is visible")
    public void verify_that_shopping_history_display_ıcon_is_visible() {
       profilePage.shoppingHistory.isDisplayed();
    }

    @Given("Verify that Shopping History Display Icon is active")
    public void verify_that_shopping_history_display_ıcon_is_active() {
       profilePage.shoppingHistory.isEnabled();
    }
    @Given("Click on the Shopping History Display")
    public void click_on_the_shopping_history_display() {
       profilePage.shoppingHistory.click();
    }




    @Given("Wait for {int} second")
    public void wait_for_second(int second) throws InterruptedException {
        ReusableMethods.wait(second);
    }
    @Given("Send {string} to eMail textbox")
    public void Send_to_eMail_textbox(String yenimail) throws InterruptedException {

        ReusableMethods.enterText(profilePage.eMailTextbox,yenimail, true);

    }



    //===================ZD===========
    @Given("Click on the Profile")
    public void click_on_the_profile() throws InterruptedException {
        profilePage.loginAndDashboard();
    }

    @Given("Click on the Change Password")
    public void click_on_the_change_password() throws InterruptedException {
        profilePage.changePassword();
    }

    @Given("Verify that Change Password message is visible")
     public void verify_that_change_password_mesagge_is_visible() throws InterruptedException {
        wait(3);
        Assert.assertTrue(profilePage.changePassMessage.getText().contains("Change Password"));

    }

    @Given("Verify that email textbox is visible")
    public void verify_that_email_textbox_is_visible() throws InterruptedException {
        profilePage.isVisibleTextbox();
    }

    @Given("Verify that email textbox is active")
    public void verify_that_email_textbox_is_active() throws InterruptedException {
        profilePage.isEnableTextbox();
    }

    @Given("Click on the Save Changes")
    public void click_on_the_save_changes() throws InterruptedException {
        scrollToElementWithText("Save Changes");
       clickElement("Save Changes");
    }

    @Given("Click on the Forgot Password")
    public void click_on_the_forgot_password()  {
        profilePage.forgotPassword();
    }

    @Given("Registered email is entered")
    public void registered_email_is_entered() {
        var el8 = driver.findElement(AppiumBy.className("android.widget.EditText"));
        el8.click();
        el8.sendKeys(ConfigReader.getProperty("zehraEmail"));
    }

    @Given("Enter the new password")
    public void enter_the_new_password() {
        var el10 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
        el10.click();
        el10.sendKeys("Query.2904");
    }

    @Given("Enter the Confirm password")
    public void enter_the_confirm_password() {
        var el11 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
        el11.click();
        el11.sendKeys("Query.2904");
    }
    @Given("Enter the wrong old password")
    public void enter_the_wrong_old_password() {
        var el2 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]"));
        el2.click();
        el2.sendKeys("123123");
    }
    @Given("Enter the wrong new password")
    public void enter_the_wrong_new_password() {
        var el3 = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[2]"));
        el3.click();
        el3.sendKeys("123");
    }
    @Given("Enter the wrong Confirm password")
    public void enter_the_wrong_confirm_password() throws InterruptedException {
        var el4 = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[3]"));
        el4.click();
        el4.sendKeys("123");
        Thread.sleep(3000);
    }

    @Given("Verify that the page does not appear to have changed")
    public void verify_that_the_page_does_not_appear_to_have_changed() {

    }
    @Given("Verify that error message is visible")
    public void verify_that_error_mesagge_is_visible() throws InterruptedException {
       wait(3);
        Assert.assertTrue(profilePage.changePassMessage.getText().contains("Change Password"));

    }





}