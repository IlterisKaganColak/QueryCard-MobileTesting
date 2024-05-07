package Page;


import hooks.Base;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.*;
import static utilities.Driver.getAppiumDriver;

public class HomePage extends Base {
    public HomePage() {PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);}
    @AndroidFindBy(xpath= "(//*[@class='android.widget.ImageView'])[1]")
    public  WebElement queryCardLogoElement;
    @AndroidFindBy(xpath = "(//android.widget.ImageView[1])[2]")
    private  WebElement searchBoxElement;
    @AndroidFindBy(accessibility = "Sign In")
    private  WebElement signInButton;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Profile']")
    private  WebElement profileImageView;
    @AndroidFindBy(accessibility = "Categories")
    public  WebElement labelCategories;
    @AndroidFindBy(xpath = "(//*[@class='android.view.View']")
    private  WebElement shoppingCartElement;
    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Adidas 3-Stripes Cushioned Crew Socks\n" + "0 (0  Reviews)\n" + "$15.00\"]/android.widget.ImageView"  )
    public WebElement favoriteIcon;
    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Adidas 3-Stripes Cushioned Crew Socks\n" + "0 (0  Reviews)\n" + "$15.00\"]")
    public WebElement ilkUrun;
    @AndroidFindBy (xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView")
    public WebElement filteringIcon;
    @AndroidFindBy(accessibility = "Juniors")
    private static WebElement juniorsCategory;



    public void logoVisibleTest(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertTrue(queryCardLogoElement.isDisplayed());
    }
    public void logoLocateTest(){
        x=48;
        y=63;
        assertEquals(expectedLocation,homePage.queryCardLogoElement.getLocation());
    }

}
