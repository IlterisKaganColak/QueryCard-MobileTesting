package Page;

import hooks.Base;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static utilities.Driver.getAppiumDriver;

public class WishlistPage extends Base {
    public WishlistPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);
    }
}
