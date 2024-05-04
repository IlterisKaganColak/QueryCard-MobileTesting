package stepdefinitions;

import hooks.Base;
import io.cucumber.java.en.Given;
import utilities.ReusableMethods;

public class ProfileStepdefinition extends Base {
    //simge
    @Given("Click on the {string}")
    public void click_on_the(String clickItem) throws InterruptedException {
        Thread.sleep(1000);
        ReusableMethods.clickElement(clickItem);
    }
    @Given("{string} is entered")
    public void is_entered(String validInfo) throws InterruptedException {
        profilePage.signIn(validInfo);
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
