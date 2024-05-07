package Page;


import hooks.Base;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import static org.junit.Assert.assertTrue;
import static utilities.Driver.getAppiumDriver;

public class HomePage extends Base {
    public HomePage() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);

    }
    @AndroidFindBy(xpath= "(//*[@class='android.widget.ImageView'])[1]")
    public  WebElement queryCardLogoElement;
   // @AndroidFindBy(xpath = "(//android.widget.ImageView[1])[1]")
   // public  WebElement queryCardLogoElement;
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

    public void LogoGorunurTest() {

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertTrue(queryCardLogoElement.isDisplayed());
    }


    public void SearchBoxGorunurlukClickTest() {
        assertTrue(searchBoxElement.isDisplayed());
        searchBoxElement.click();
    }

    public void profileImageViewClickTest() {
        assertTrue(profileImageView.isDisplayed());
        profileImageView.click();
    }

    public void signInClick() {
        assertTrue(signInButton.isDisplayed());
        signInButton.click();
    }

    public void setShoppingCartElementGurunurlukTest() {
        assertTrue(signInButton.isDisplayed());


    }
}
