package stepdefinitions;

import Page.HomePage;
import hooks.Base;
import io.cucumber.java.en.Given;
import org.junit.Assert;

import static utilities.Driver.getAppiumDriver;

public class HomePageStepdefinition extends Base {


 /*   @Given("Kullanici driver ayarlamalari yapar")
    public void kullanici_driver_ayarlamalari_yapar() {
        getAppiumDriver();

    }*/
    @Given("Kullanici anasayfada oldugunu dogrular")
    public void kullanici_anasayfada_oldugunu_dogrular() throws InterruptedException {
        homePage.LogoGorunurTest();
      //  ReusableMethods.koordinatTiklamaMethodu(300,500);
      //  ReusableMethods.ekranKaydirmaMethodu(300,160,300,500,300);
    }

    @Given("Profile ikonuna tıklar")
    public void profile_ikonuna_tıklar() throws InterruptedException {
        Thread.sleep(4000);
       homePage.profileImageViewClickTest();
    }
    @Given("Uyeligini acamak icin sıgn In butonuna tıklar.")
    public void uyeligini_acamak_icin_sign_in_butonuna_tıklar() throws InterruptedException {
        Thread.sleep(3000);
        homePage.signInClick();
    }
    @Given("Launch the app")
    public void launch_the_app() {
        getAppiumDriver();
    }

    @Given("Verify access to {string}")
    public void verify_access_to(String page) {
        Assert.assertTrue(homePage.labelCategories.isDisplayed());
    }

    @Given("Verify that the {string} is visible")
    public void verify_that_the_is_visible(String element) {
        homePage.LogoGorunurTest();
    }
}
