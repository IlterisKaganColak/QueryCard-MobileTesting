package stepdefinitions;

import hooks.Base;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.ReusableMethods;

public class ProfileStepdefinition extends Base {
    //simge
    @Given("Click on the {string}")
    public void click_on_the(String clickItem) throws InterruptedException {
        ReusableMethods.clickElement(clickItem);
    }
    @Given("{string} is entered")
    public void is_entered(String validInfo) throws InterruptedException {
        profilePage.clickAndSendKeys(validInfo);
    }
    @Given("Verify that {string} is visible")
    public void verify_that_is_visible(String elementText) throws InterruptedException {
        ReusableMethods.isVisible(elementText);
    }
    @Given("Verify that {string} is active")
    public void verify_that_is_active(String elementText) throws InterruptedException {
        ReusableMethods.isEnable(elementText);
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
    @Given("Verify that successfully message is visible")
    public void verify_that_successfully_mesagge_is_visible() throws InterruptedException {
       Assert.assertTrue(ReusableMethods.getToastMessage().contains("successfully"));
    }

}
