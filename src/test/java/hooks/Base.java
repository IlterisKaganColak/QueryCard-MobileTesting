package hooks;

import Page.HomePage;
import Page.ProfilePage;
import Page.WishlistPage;
import com.github.javafaker.Faker;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import utilities.Driver;

import java.sql.Date;
import java.util.Random;


public abstract class Base {
    public static String password;
    public static Random random;
    public static Faker faker ;
    public static AppiumDriver driver;
    public static DesiredCapabilities desiredCapabilities;
    public static HomePage homePage;
    public static ProfilePage profilePage;
    public static WishlistPage wishlistPage;
    public static WebElement element;
    public static int x, y;
    public static Point expectedLocation;
    public static Actions actions;

    public static void initialize() {
        faker = new Faker();
        random = new Random();
        profilePage = new ProfilePage();
        wishlistPage = new WishlistPage();
        homePage = new HomePage();
        desiredCapabilities = new DesiredCapabilities();
        driver = Driver.getAppiumDriver();
        actions = new Actions(driver);
        expectedLocation = new Point(x,y);
    }

}