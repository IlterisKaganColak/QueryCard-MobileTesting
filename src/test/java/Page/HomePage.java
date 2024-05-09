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
    @AndroidFindBy(accessibility = "Categories")
    public  WebElement labelCategories;
    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Adidas 3-Stripes Cushioned Crew Socks\n" + "0 (0  Reviews)\n" + "$15.00\"]/android.widget.ImageView"  )
    public WebElement favoriteIcon;
    @AndroidFindBy (xpath = "(//*[@class=\"android.view.View\"])[10]")
    public WebElement ilkUrun;
    @AndroidFindBy (xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView")
    public WebElement filteringIcon;
    @AndroidFindBy(xpath= "(//*[@class='android.view.View'])[14]")
    public  WebElement thirdProductWomenPage;
    @AndroidFindBy(xpath= "(//*[@class='android.view.View'])[16]")
    public  WebElement eleventhProductWomenPage;
    @AndroidFindBy(xpath= "(//*[@class='android.view.View'])[12]")
    public  WebElement secondProductMenPage;
    @AndroidFindBy(xpath= "(//*[@class='android.view.View'])[16]")
    public  WebElement eighthProducMenPage;
    @AndroidFindBy(xpath= "(//*[@class='android.view.View'])[18]")
    public  WebElement fourteenthProducMenPage;
    @AndroidFindBy(xpath= "(//*[@class='android.view.View'])[11]")
    public  WebElement eleventhProductMenPage;

    public void logoVisibilityTest(){
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
