package stepdefinitions;
import Page.ProfilePage;
import hooks.Base;
import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import utilities.ConfigReader;

import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;


public class ProfileStepdefinition extends Base {
    //simge
    @Given("Registered user logs in by using {string} and {string} information")
    public void registered_user_logs_in_by_using_and_information(String validEmail, String validPassword) throws InterruptedException {
        profilePage.signIn(validEmail, validPassword);
    }

    @Given("User waits for {int} seconds")
    public void user_waits_for_seconds(int sn) throws InterruptedException {
       Thread.sleep(sn * 1000);
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
    @Given("Click on the first product in the Most Popular list")
    public void click_on_the_first_product_in_the_most_popular_list() {
        profilePage.floralDress.click();
    }
    @Given("Click on the Cart icon in product details page")
    public void click_on_the_cart_icon_in_product_details_page() {
      profilePage.cartIconProductDetailsPage.click();
    }




      @Given("Send {string} to eMail textbox")
    public void Send_to_eMail_textbox(String yenimail) throws InterruptedException {
        enterText(profilePage.eMailTextbox,yenimail, true);
    }
    @Given("Verify that cart icon is visible")
    public void verify_that_cart_icon_is_visible() throws InterruptedException {
        assertTrue(profilePage.cartIcon.isDisplayed());
    }
    @Given("Verify that cart icon right is visible")
    public void verify_that_cart_icon_right_is_visible() throws InterruptedException {
        assertTrue(profilePage.cartIconRight.isDisplayed());
    }
    @Given("Verify that cart icon is enabled")
    public void verify_that_cart_icon_is_enabled() throws InterruptedException {
        assertTrue(profilePage.cartIcon.isEnabled());
    }
    @Given("Verify that cart icon right is enabled")
    public void verify_that_cart_icon_right_is_enabled() throws InterruptedException {
        assertTrue(profilePage.cartIconRight.isEnabled());
    }
    @Given("Click on the cart icon")
    public void click_on_the_cart_icon(){
        profilePage.cartIcon.click();
    }
    @Given("Click on the cart right icon")
    public void click_on_the_cart_right_icon(){
        profilePage.cartIconRight.click();
    }
    @Given("Click on the remove icon")
    public void click_on_the_remove_icon(){
        profilePage.productRemoveIcon.click();
    }
    @Given("Click on the product qty up icon")
    public void click_on_the_product_qty_up_icon() throws InterruptedException {
        profilePage.productQtyUpIcon.click();
        wait(2);
    }
    @Given("Click on the product qty down icon")
    public void click_on_the_product_qty_down_icon() throws InterruptedException {
        profilePage.productQtyDownIcon.click();
        wait(2);
    }
    @Given("Wait for {int} miliseconds")
    public void wait_for_miliseconds(int milisecond) throws InterruptedException {
        Thread.sleep(milisecond);
    }
    @Given("Slide small")
    public void slide_small() throws InterruptedException {
       slideWithCoordinatesUpToDown();
    }





    //===================ZD===========

    @Given("Click on the Change Password")
    public void click_on_the_change_password() throws InterruptedException {
        profilePage.changePassword();
    }

    @Given("Verify that Change Password message is visible")
     public void verify_that_change_password_mesagge_is_visible() throws InterruptedException {
        wait(3);
        assertTrue(profilePage.changePassMessage.getText().contains("Change Password"));

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

    @Given("Enter the wrong {string}")
    public void enter_the_wrong(String wrongPass) {
        if (wrongPass.equals("123")) {
            var el3 = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[2]"));
            el3.click();
            el3.sendKeys(wrongPass);
        }else {
            var el4 = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[3]"));
            el4.click();
            el4.sendKeys(wrongPass);
        }
    }
    @Given("Enter the {string} password")
    public void enter_the_password(String old) throws InterruptedException {

        var el2 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]"));
        el2.click();
        el2.sendKeys(old);
    }


    @Given("Verify that the page does not appear to have changed")
    public void verify_that_the_page_does_not_appear_to_have_changed() {

    }
    @Given("Verify that error message is visible")
    public void verify_that_error_mesagge_is_visible() throws InterruptedException {
       wait(3);
        assertTrue(profilePage.changePassMessage.getText().contains("Change Password"));

    }

    @When("Verify that the Sign Up button is visible under the SignUp form")
    public void verifyThatSignUpButtonIsVisibleUnderTheSignUpForm() {
        assertTrue(profilePage.signUpButton.isDisplayed());
    }

    @When("Verify that the Sign Up button is active")
    public void verifyThatTheSignUpButtonIsActive() {
        assertTrue(profilePage.signUpButton.isEnabled());
    }

    @When("Verify that Name textBox is visible and enabled")
    public void verifyThatNameTextBoxIsVisibleAndEnabled() {
        assertTrue(profilePage.fullNameTextbox.isDisplayed());
        assertTrue(profilePage.fullNameTextbox.isEnabled());
    }

    @When("Verify that Phone textBox is visible and enabled")
    public void verifyThatPhoneTextBoxIsVisibleAndEnabled() {
        assertTrue(profilePage.phoneTextbox.isDisplayed());
        assertTrue(profilePage.phoneTextbox.isEnabled());
    }

    @When("Verify that Password textBox is visible and enabled")
    public void verifyThatPasswordTextBoxIsVisibleAndEnabled() {
        assertTrue(profilePage.passwordTextbox.isDisplayed());
        assertTrue(profilePage.passwordTextbox.isEnabled());
    }

    @When("Fill in {string} textbox with {string}")
    public void fillInTextbox(String textboxName, String value) {
        switch (textboxName + " with " + value){
            case "Name with validName" :
                profilePage.fullNameTextbox.click();
                profilePage.fullNameTextbox.sendKeys(faker.name().fullName());
                break;
            case "Phone with validPhone" :
                profilePage.phoneTextbox.click();
                profilePage.phoneTextbox.sendKeys(faker.phoneNumber().cellPhone());
                break;
            case "Password with validPassword" :
                profilePage.passwordTextbox.click();
                profilePage.passwordTextbox.sendKeys(faker.internet().password(8,12,true,true,true));
                break;
            case "Name with blankName" :break;
            case "Phone with blankPhone" :break;
            case "Password with blankPassword" :break;
            case "Name with invalidName" :
                profilePage.fullNameTextbox.click();
                profilePage.fullNameTextbox.sendKeys(faker.name().fullName());
                break;
            case "Phone with invalidPhone" :
                profilePage.phoneTextbox.click();
                profilePage.phoneTextbox.sendKeys("555"+faker.numerify("###"));
                break;
            case "Password with invalidPassword" :
                profilePage.passwordTextbox.click();
                profilePage.passwordTextbox.sendKeys(faker.internet().password(6,6,true,true,true));
                break;
        }
    }

    @When("Click on the Sign Up button")
    public void clickOnTheSignUpButton() {
        profilePage.signUpButton.click();
    }

    @When("Fill in {string} textbox with invalid phone number")
    public void fillInTextboxWithInvalidPhoneNumberLessThanDigit(String arg0, int arg1) {
    }
}