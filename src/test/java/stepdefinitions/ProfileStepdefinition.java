package stepdefinitions;

import hooks.Base;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.backgroundservice.BackgroundService;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.time.Duration;

import static utilities.ReusableMethods.waitToBeClickable;

public class ProfileStepdefinition extends Base {
    //simge
    @Given("Click on the {string}")
    public void click_on_the(String clickItem) throws InterruptedException {

        ReusableMethods.countOfElement(clickItem);

    }
    @Given("{string} is entered")
    public void is_entered(String validInfo) throws InterruptedException {
        profilePage.clickAndSendKeys(validInfo);

    }

    @Given("Verify that {string} is visible")
    public void verify_that_is_visible(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Verify that {string} is active")
    public void verify_that_is_active(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
