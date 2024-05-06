package stepdefinitions;

import Page.HomePage;
import hooks.Base;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import static utilities.Driver.getAppiumDriver;

public class HomePageStepdefinition extends Base {

    @Given("Kullanici anasayfada oldugunu dogrular")
    public void kullanici_anasayfada_oldugunu_dogrular() {
        HomePage.LogoGorunurTest();

    }

    @Given("Profile ikonuna tıklar")
    public void profile_ikonuna_tıklar() throws InterruptedException {
        Thread.sleep(4000);
       HomePage.profileImageViewClickTest();
    }
    @Given("Uyeligini acamak icin sıgn In butonuna tıklar.")
    public void uyeligini_acamak_icin_sign_in_butonuna_tıklar() throws InterruptedException {
        Thread.sleep(3000);
        HomePage.signInClick();
    }
    @Given("Launch the app")
    public void launch_the_app() throws InterruptedException {
        Thread.sleep(1000);
        getAppiumDriver();
        Thread.sleep(3000);

    }

    @Given("Verify access to {string}")
    public void verify_access_to(String page) {
        Assert.assertTrue(HomePage.labelCategories.isDisplayed());
    }

    @Given("Verify that the Site Logo is visible")
    public void verify_that_the_site_logo_is_visible() throws InterruptedException {
        Thread.sleep(1000);
        HomePage.LogoGorunurTest();
    }
    //Simge

}
