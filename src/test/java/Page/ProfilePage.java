package Page;

import hooks.Base;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.getAppiumDriver;
import static utilities.ReusableMethods.*;

public class ProfilePage extends Base {
    public ProfilePage() {PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);}

    @AndroidFindBy (accessibility = "Change Password Password Updated Successfully")
    public WebElement changePassMessage;
    @AndroidFindBy (xpath = "(//*[@class='android.widget.EditText'])[1]")
    public WebElement emailTextBox;
    @AndroidFindBy (xpath = "(//*[@class='android.widget.EditText'])[2]")
    public WebElement passwordTextBox;
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
        Thread.sleep(1000);
        //Profile butonuna tıklar
        clickWithCoordinates(977,1722);
        Thread.sleep(1000);
        //Sign In butonuna tıklar
        clickElement("Sign In");
        //*Use Email Instead yazısına tıklar
        clickElement("*Use Email Instead");
        Thread.sleep(1000);
        //Email textbox ına tıklar
        emailTextBox.click();
        Thread.sleep(2000);
        //Geçerli email girilir
        emailTextBox.sendKeys(ConfigReader.getProperty(validEmail));
        Thread.sleep(1000);
        //Password textbox ına tıklar
        passwordTextBox.click();
        Thread.sleep(3000);
        //Geçerli password girilir
        passwordTextBox.sendKeys(ConfigReader.getProperty(validPassword));
        //Klavye kapatılır
        clickWithCoordinates(991,1707);
        Thread.sleep(3000);
        //Sign In butonuna tıklar
        clickWithCoordinates(532,1127);
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

    public void fillInTextbox(String textboxName, String value) {
        switch (textboxName + " with " + value){
            case "Name with validName" :
                profilePage.fullNameTextbox.click();
                profilePage.fullNameTextbox.sendKeys(faker.name().fullName());
                break;
            case "Phone with validPhone" :
                profilePage.phoneTextbox.click();
                profilePage.phoneTextbox.sendKeys(faker.phoneNumber().cellPhone());
                break;
            case "Password with validPassword" :
                profilePage.passwordTextbox.click();
                profilePage.passwordTextbox.sendKeys(faker.internet().password(8,12,true,true,true));
                break;
            case "Name with blankName" :break;
            case "Phone with blankPhone" :break;
            case "Password with blankPassword" :break;
            case "Name with invalidName" :
                profilePage.fullNameTextbox.click();
                profilePage.fullNameTextbox.sendKeys(faker.name().fullName());
                break;
            case "Phone with invalidPhone" :
                profilePage.phoneTextbox.click();
                profilePage.phoneTextbox.sendKeys("555"+faker.numerify("###"));
                break;
            case "Password with invalidPassword" :
                profilePage.passwordTextbox.click();
                profilePage.passwordTextbox.sendKeys(faker.internet().password(6,6,true,true,true));
                break;
        }
    }
    public void textBoxIsVisibleAndEnabled(String textBoxName) {
        switch (textBoxName) {
            case "Name" :
                assertTrue(profilePage.fullNameTextbox.isDisplayed());
                assertTrue(profilePage.fullNameTextbox.isEnabled());
                break;
            case "Phone" :
                assertTrue(profilePage.phoneTextbox.isDisplayed());
                assertTrue(profilePage.phoneTextbox.isEnabled());
                break;
            case "Password" :
                assertTrue(profilePage.passwordTextbox.isDisplayed());
                assertTrue(profilePage.passwordTextbox.isEnabled());
                break;
        }
    }
}