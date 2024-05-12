package Page;

import hooks.Base;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.gl.Cando;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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
    @AndroidFindBy(accessibility = "(8 Products Found)")
    public WebElement mostPopularProducts;
    @AndroidFindBy(accessibility = "Profile")
    public WebElement profileButton;
    @AndroidFindBy(accessibility = "Sign In")
    public WebElement signInButton;
    @AndroidFindBy(xpath= "//android.view.View[@content-desc=\"*Use Email Instead\"]") //for use email sign In
    public WebElement UseEmailInsteade;
    @AndroidFindBy(xpath= "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]")
    public  WebElement emailTextBox;
    @AndroidFindBy(xpath= "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]")
    public  WebElement passwordTextBox;
    @AndroidFindBy(xpath= "(//android.view.View[@content-desc=\"Sign In\"])[2]")
    public  WebElement LastSignInButton;
    @AndroidFindBy(accessibility = "Delete")    //Are u sure you want to delete?
    public WebElement deleteButton;
    @AndroidFindBy(accessibility = "Success\n" + "Address Deleted Successfully!")
    public WebElement adressDeleteSuccesfullyMessage;
    @AndroidFindBy(accessibility = "Add New Address")
    public WebElement addNewAddressButton;
    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.View/android.widget.EditText[1]")
    public WebElement fullNameTextBox;
    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.View/android.widget.EditText[2]")
    public WebElement emailAddressTextbox;  //for adress  email
   @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"+1201\"]")
   public List<WebElement> dropdownAddressTel;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Country\"]")
    public List<WebElement> dropdownCountry;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"State\"]")
    public List<WebElement> dropdownState;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"City\"]")
    public List<WebElement> dropdownCity;
    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.View/android.widget.EditText[1]")
    public WebElement zipCodeTextBox;
    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.View/android.widget.EditText[2]")
    public WebElement streetAddressTextBox;
    // 732 , 558
    @AndroidFindBy(accessibility = "Add Address")
    public WebElement addAdressButton;









    public void logoVisibilityTest(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertTrue(queryCardLogoElement.isDisplayed());
    }

}
