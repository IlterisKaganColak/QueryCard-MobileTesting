package hooks;

import Page.HomePage;
import Page.ProfilePage;
import com.github.javafaker.Faker;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import utilities.Driver;

import java.sql.Date;
import java.util.Random;


public abstract class Base {
    public static String email, password, name;
    public static int id;
    public static double sub_total;
    public static Date date;
    public static Random random;
    public static Faker faker ;
    public static UiAutomator2Options options;
    public static AppiumDriver driver;
    public static DesiredCapabilities desiredCapabilities;
    public static HomePage homePage;
    public static ProfilePage profilePage;
    public static WebElement element;
    public static Actions actions;

    public static void initialize() {
        faker = new Faker();
        random = new Random();
        profilePage = new ProfilePage();
        homePage = new HomePage();
        desiredCapabilities = new DesiredCapabilities();
        driver = Driver.getAppiumDriver();
        actions = new Actions(driver);
    }

}