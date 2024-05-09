package stepdefinitions;
import hooks.Base;
import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import static org.junit.Assert.*;
import static utilities.ReusableMethods.*;
public class Stepdefinitions extends Base {
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
        profilePage.firstProductMostPopularHomepage.click();
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
    @Given("Enter the wrong new password")
    public void enter_the_wrong_new_password() {
        var el1 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)"));
        el1.click();
        el1.sendKeys("123");
    }
    @Given("Enter the wrong confirm password")
    public void enter_the_wrong_confirm_password() {
            var el2 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)"));
            el2.click();
            el2.sendKeys("123");
        }
    @Given("Enter the old password")
    public void enter_the_password() throws InterruptedException {

        var el2 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]"));
        el2.click();
        el2.sendKeys("Query.2904");
    }
    @Given("Verify that the page does not appear to have changed")
    public void verify_that_the_page_does_not_appear_to_have_changed() {
    }
    @Given("Verify that error message is visible")
    public void verify_that_error_mesagge_is_visible() throws InterruptedException {
       wait(3);
        var el4 = driver.findElement(AppiumBy.accessibilityId("Password is short"));
        assertTrue(el4.isDisplayed());
    }
    @When("Verify that the Sign Up button is visible under the SignUp form")
    public void verifyThatSignUpButtonIsVisibleUnderTheSignUpForm() {
        assertTrue(profilePage.signUpButton.isDisplayed());
    }
    @When("Verify that the Sign Up button is active")
    public void verifyThatTheSignUpButtonIsActive() {
        assertTrue(profilePage.signUpButton.isEnabled());
    }
    @When("Verify that {string} textBox is visible and enabled")
    public void verifyTextBoxIsVisibleAndEnabled(String textBoxName) {
        profilePage.textBoxIsVisibleAndEnabled(textBoxName);
    }
    @When("Fill in {string} textbox with {string}")
    public void fillIn_TextBox_with(String textboxName, String value){
        profilePage.fillInTextbox(textboxName,value);
    }
    @When("Click on the Sign Up button")
    public void clickOnTheSignUpButton() {
        profilePage.signUpButton.click();
    }
    @When("Fill in {string} textbox with invalid phone number")
    public void fillInTextboxWithInvalidPhoneNumberLessThanDigit(String arg0, int arg1) {
    }
    @Given("Launch the app")
    public void launch_the_app() throws InterruptedException {
        Thread.sleep(1000);
    }
    @Given("Verify access to {string}")
    public void verify_access_to(String page) {
        assertTrue(homePage.labelCategories.isDisplayed());
    }
    @Given("Verify that the Site Logo is visible")
    public void verify_that_the_site_logo_is_visible() throws InterruptedException {
        Thread.sleep(1000);
        homePage.logoVisibilityTest();
    }
    //Simge
    @Given("Click on the first product in Wishlist Page")
    public void click_on_the_first_product_in_wishlist_page() {
        wishlistPage.firstProductWishlistPage.click();
    }
    @Given("Navigate to the previous page")
    public void navigate_to_the_previous_page() {
        backToPreScreen();
    }
    @Given("Click on the favorite icon")
    public void Click_on_the_favorite_icon() {
        homePage.favoriteIcon.click();
    }
    @Given("Verify that first product listing is visible")
    public void verify_that_first_product_listing_is_visible() throws InterruptedException {
        assertTrue(homePage.ilkUrun.isDisplayed());    }
    @Given("Click on the first product")
    public void click_on_the_first_product(){
        homePage.ilkUrun.click();
    }
    @Given("Click filtering icon")
    public void Click_filtering_icon(){
        homePage.filteringIcon.click();
    }
    @Given("Verify that filtering icon is visible")
    public void Verify_that_filtering_icon_is_visible(){
        assertTrue(homePage.filteringIcon.isDisplayed());
    }
    @Given("Click on the first brand checkbox")
    public void Click_on_the_first_brand_checkbox(){

    }
    @Given("Wait {int} second")
    public void wait_second(int wait) throws InterruptedException {
        Thread.sleep(wait);
    }
    @Given("Enter valid {int}, {int}, {int} and {int}")
    public void enter_valid_and(int cardNumber, int cardDate, int cvcCode, int zipCode) {
        actions.sendKeys(String.valueOf(cardNumber))
                .sendKeys(String.valueOf(cardDate))
                .sendKeys(String.valueOf(cvcCode))
                .sendKeys(String.valueOf(zipCode))
                .perform();
    }
    @Given("Click on the third product in the women page")
    public void click_on_the_third_product_in_the_women_page() {
        homePage.thirdProductWomenPage.click();
    }
    @Given("Click on the eleventh product in the women page")
    public void click_on_the_eleventh_product_in_the_women_page() {
        homePage.eleventhProductWomenPage.click();
    }
    @Given("Click on the second product in the men page")
    public void click_on_the_second_product_in_the_men_page() {
        homePage.secondProductMenPage.click();
    }
    @Given("Click on the eighth product in the men page")
    public void click_on_the_eighth_product_in_the_men_page() {
        homePage.eighthProducMenPage.click();
    }
    @Given("Click on the fourteenth product in the men page")
    public void click_on_the_fourteenth_product_in_the_men_page() {
        homePage.fourteenthProducMenPage.click();
    }
    @Given("Click on the eleventh product in the men page")
    public void click_on_the_eleventh_product_in_the_men_page() {
        homePage.eleventhProductMenPage.click();
    }
    @Given("Edit address information in the update address page")
    public void edit_address_information_in_the_update_address_page() throws InterruptedException {
       profilePage.updateAddress();
    }

}