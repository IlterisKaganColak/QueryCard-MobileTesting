package stepdefinitions;

import Page.HomePage;
import hooks.Base;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import static utilities.Driver.getAppiumDriver;

public class HomePageStepdefinition extends Base {



    @Given("Launch the app")
    public void launch_the_app() throws InterruptedException {
    Thread.sleep(1000);
    }

    @Given("Verify access to {string}")
    public void verify_access_to(String page) {
        Assert.assertTrue(homePage.labelCategories.isDisplayed());
    }

    @Given("Verify that the Site Logo is visible")
    public void verify_that_the_site_logo_is_visible() throws InterruptedException {
        Thread.sleep(1000);
        homePage.LogoGorunurTest();
    }
    //Simge

}
