package Page;

import hooks.Base;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.util.List;

import static utilities.Driver.getAppiumDriver;

public class ProfilePage extends Base {
    public ProfilePage() {PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);}

    @AndroidFindBy (accessibility = "Change Password Password Updated Successfully")
    public WebElement changePassMessage;
    @AndroidFindBy (xpath = "//*[@class='android.widget.EditText']")
    public List<WebElement> emailPasswordTextBoxes;
    @AndroidFindBy (xpath = "(//*[@class='android.widget.ImageView'])[2]")
    public WebElement shoppingHistory;
    @AndroidFindBy (xpath = "(//*[@class='android.view.View'])[19]")
    public WebElement firstProductMostPopularHomepage;
    @AndroidFindBy (xpath = "(//*[@class='android.widget.ImageView'])[13]")
    public WebElement cartIconProductDetailsPage;
    @AndroidFindBy(xpath = "//*//android.widget.EditText[1]")
    public WebElement fullNameTextbox;
    @AndroidFindBy(xpath = "//*//android.widget.EditText[2]")
    public WebElement eMailTextbox;
    @AndroidFindBy(xpath = "//*//android.widget.EditText[2]")
    public WebElement phoneTextbox;
    @AndroidFindBy(xpath = "//*//android.widget.EditText[3]")
    public WebElement passwordTextbox;
    @AndroidFindBy (xpath = "(//*[@class=\"android.widget.ImageView\"])[11]")
    public WebElement cartIcon;
    @AndroidFindBy (xpath = "(//*[@class=\"android.widget.ImageView\"])[13]")
    public WebElement cartIconRight;
    @AndroidFindBy (xpath =  "(//*[@class=\"android.widget.ImageView\"])[2]")
    public WebElement productQtyUpIcon;
    @AndroidFindBy (xpath =  "(//*[@class=\"android.widget.ImageView\"])[1]")
    public WebElement productQtyDownIcon;
    @AndroidFindBy (xpath =  "(//*[@class=\"android.widget.ImageView\"])[2]")
    public WebElement productQtyUpIcon1;
    @AndroidFindBy (xpath =  "(//*[@class=\"android.widget.ImageView\"])[9]")
    public WebElement productQtyDownIcon1;
    @AndroidFindBy (xpath = "(//*[@class=\"android.widget.ImageView\"])[10]")
    public WebElement productRemoveIcon;
    @AndroidFindBy(xpath = "(//*[@content-desc='Sign Up'])[2]")
    public WebElement signUpButton;


    public void signIn(String validEmail,String validPassword) throws InterruptedException {
        Thread.sleep(10000);
        //Profile butonuna tıklar
          ReusableMethods.clickWithCoordinates(977,1722);
        Thread.sleep(3000);
        //Sign In butonuna tıklar
          ReusableMethods.clickWithCoordinates(800,552);//789
       Thread.sleep(3000);
        //*Use Email Instead yazısına tıklar
        ReusableMethods.clickElement("*Use Email Instead");
       // ReusableMethods.clickWithCoordinates(855,546); //551
        Thread.sleep(2000);
        //Email textbox ına tıklar
        emailPasswordTextBoxes.get(0).click();
        Thread.sleep(2000);
        //Geçerli email girilir
        emailPasswordTextBoxes.get(0).sendKeys(ConfigReader.getProperty(validEmail));
        Thread.sleep(1000);
        //Password textbox ına tıklar
        emailPasswordTextBoxes.get(1).click();
        Thread.sleep(3000);
        //Geçerli password girilir
        emailPasswordTextBoxes.get(1).sendKeys(ConfigReader.getProperty(validPassword));
        //Klavye kapatılır
        ReusableMethods.clickWithCoordinates(991,1707);
        Thread.sleep(3000);
        //Sign In butonuna tıklar
        ReusableMethods.clickWithCoordinates(532,1127);
        Thread.sleep(3000);
    }



    public void changePassword() throws InterruptedException {
        var el1 = driver.findElement(AppiumBy.accessibilityId("Change Password"));
        el1.click();
        var el2 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]"));
        el2.click();
        el2.sendKeys("Query.2904");
        var el3 = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[2]"));
        el3.click();
        el3.sendKeys("123123");
        var el4 = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[3]"));
        el4.click();
        el4.sendKeys("123123");
        Thread.sleep(3000);


    }

public void forgotPassword(){

    var el6 = driver.findElement(AppiumBy.accessibilityId("Forgot Password"));
    el6.click();
    var el7 = driver.findElement(AppiumBy.accessibilityId("*Use Email Instead"));
    el7.click();
    var el8 = driver.findElement(AppiumBy.className("android.widget.EditText"));
    el8.click();
    el8.sendKeys(ConfigReader.getProperty("zehraEmail"));
    var el9 = driver.findElement(AppiumBy.accessibilityId("Get OTP"));
    el9.click();
    var el10 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
    el10.click();
    el10.sendKeys("Query.2904");
    var el11 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
    el11.click();
    el11.sendKeys("Query.2904");
    var el12 = driver.findElement(AppiumBy.accessibilityId("Submit"));
    el12.click();


}

    public void isVisibleTextbox() throws InterruptedException {
        Thread.sleep(1000);
        element = driver.findElement(AppiumBy.className("android.widget.EditText"));
        Thread.sleep(1000);
        Assert.assertTrue(element.isDisplayed());
    }
    public void isEnableTextbox() throws InterruptedException {
        element = driver.findElement(AppiumBy.className("android.widget.EditText"));
        Thread.sleep(1000);
        Assert.assertTrue(element.isEnabled());

    }



}