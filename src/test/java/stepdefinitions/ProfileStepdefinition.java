package stepdefinitions;

import hooks.Base;
import io.cucumber.java.en.Given;
import utilities.ReusableMethods;

public class ProfileStepdefinition extends Base {
    //simge
    @Given("Registered user logs in by using {string} and {string} information")
    public void registered_user_logs_in_by_using_and_information(String validEmail, String validPassword) throws InterruptedException {
        profilePage.signIn(validEmail,validPassword);
    }
    @Given("Click on the {string}")
    public void click_on_the(String clickItem) throws InterruptedException {
        ReusableMethods.clickElement(clickItem);
    }

    @Given("Verify that {string} is visible")
    public void verify_that_is_visible(String elementText) throws InterruptedException {
        ReusableMethods.isVisible(elementText);
    }
    @Given("Verify that {string} is active")
    public void verify_that_is_active(String elementText) throws InterruptedException {
        ReusableMethods.isEnable(elementText);
    }
    @Given("Click on the Profile")
    public void click_on_the_profile() throws InterruptedException {
        profilePage.loginAndDashboard();
    }

}
