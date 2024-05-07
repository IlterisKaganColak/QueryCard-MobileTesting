package Page;


import hooks.Base;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import static org.junit.Assert.assertTrue;
import static utilities.Driver.getAppiumDriver;

public class HomePage extends Base {
   public HomePage(){
       PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()),this);

    }
    @AndroidFindBy(xpath = "(//android.widget.ImageView[1])[1]")
    public static WebElement queryCardLogoElement;
    @AndroidFindBy (xpath = "(//android.widget.ImageView[1])[2]")
    private static WebElement searchBoxElement;
    @AndroidFindBy (accessibility = "Sign In")
    private static WebElement signInButton;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Profile']")
    private static WebElement profileImageView;

    @AndroidFindBy (accessibility = "Categories")
    public static WebElement labelCategories;
    @AndroidFindBy(accessibility = "Juniors")
    private static WebElement juniorsCategory;

    public static void LogoGorunurTest(){

            try {
               Thread.sleep(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            assertTrue(queryCardLogoElement.isDisplayed());
        }


    public static void SearchBoxGorunurlukClickTest(){
        assertTrue(searchBoxElement.isDisplayed());
        searchBoxElement.click();
    }
    public static void profileImageViewClickTest(){
        assertTrue(profileImageView.isDisplayed());
        profileImageView.click();
    }
    public static void signInClick(){
        assertTrue(signInButton.isDisplayed());
        signInButton.click();
    }



}
