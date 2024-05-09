package Page;

import hooks.Base;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static utilities.Driver.getAppiumDriver;

public class WishlistPage extends Base {
    public WishlistPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);
    }
    @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[8]")
    public WebElement firstProductWishlistPage;
}
