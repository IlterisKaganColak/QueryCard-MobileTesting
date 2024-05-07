package stepdefinitions;

import Page.HomePage;
import hooks.Base;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.ReusableMethods;

import java.net.MalformedURLException;

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


    @Given("Scroll and click to {string}")
    public void scroll_and_click_to(String string) throws MalformedURLException, InterruptedException {
        ReusableMethods.wait(5);
        ReusableMethods.scrollWithUiScrollableAndClick(string);
    }
    @Given("Click on the favorite icon")
    public void Click_on_the_favorite_icon() {
        homePage.favoriteIcon.click();
    }
    @Given("Verify that first product listing is visible")
    public void verify_that_first_product_listing_is_visible() throws InterruptedException {
        Assert.assertTrue(homePage.ilkUrun.isDisplayed());    }
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
        Assert.assertTrue(homePage.filteringIcon.isDisplayed());
    }
    @Given("Click on the first brand checkbox")
    public void Click_on_the_first_brand_checkbox(){

    }








}
