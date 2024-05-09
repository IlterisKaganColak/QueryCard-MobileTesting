package Page;

import hooks.Base;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import static org.junit.Assert.*;
import static utilities.Driver.getAppiumDriver;
import static utilities.ReusableMethods.*;

public class ProfilePage extends Base {
    public ProfilePage() {PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);}
    @AndroidFindBy (xpath = "(//*[@class='android.widget.EditText'])[1]")
    public WebElement emailTextBox;
    @AndroidFindBy (xpath = "(//*[@class='android.widget.EditText'])[2]")
    public WebElement passwordTextBox;
    @AndroidFindBy (xpath = "(//*[@class='android.widget.ImageView'])[2]")
    public WebElement shoppingHistory;
    @AndroidFindBy (xpath = "(//*[@class='android.view.View'])[21]")
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
    @AndroidFindBy (xpath = "(//*[@class=\"android.widget.ImageView\"])[10]")
    public WebElement productRemoveIcon;
    @AndroidFindBy(xpath = "(//*[@content-desc='Sign Up'])[2]")
    public WebElement signUpButton;
    @AndroidFindBy (xpath = "(//*[@class='android.widget.ImageView'])[2]")
    public WebElement editIcon;
    @AndroidFindBy (xpath = "(//*[@class='android.view.View'])[12]")
    public WebElement addressCountryDDM;
    @AndroidFindBy (xpath = "(//*[@class='android.view.View'])[13]")
    public WebElement addressStateDDM;
    @AndroidFindBy (xpath = "(//*[@class='android.view.View'])[12]")
    public WebElement addressCityDDM;
    @AndroidFindBy (xpath = "(//*[@class='android.widget.EditText'])[1]")
    public WebElement addressNameTextbox;
    @AndroidFindBy (xpath = "(//*[@class='android.widget.EditText'])[2]")
    public WebElement addressEmailTextbox;
    @AndroidFindBy (xpath = "(//*[@class='android.widget.EditText'])[3]")
    public WebElement addressPhoneTextbox;
    @AndroidFindBy (xpath = "(//*[@class='android.widget.EditText'])[2]")
    public WebElement addressZipCodeTextbox;
    @AndroidFindBy (xpath = "(//*[@class='android.widget.EditText'])[3]")
    public WebElement addressStreetAddressTextbox;
    @AndroidFindBy (xpath = "(//*[@class='android.widget.ImageView'])[4]")
    public WebElement addressSelection;
    public void signIn(String validEmail,String validPassword) throws InterruptedException {
        Thread.sleep(1000);
        clickWithCoordinates(977,1722);                                    //Profile butonuna tıklar
        Thread.sleep(3000);
       // clickElement("Sign In");                                            //Sign In butonuna tıklar
        Thread.sleep(1000);
        clickElement("*Use Email Instead");                                 //*Use Email Instead yazısına tıklar
        Thread.sleep(1000);
        emailTextBox.click();                                                    //Email textbox ına tıklar
        Thread.sleep(2000);
        emailTextBox.sendKeys(ConfigReader.getProperty(validEmail));             //Geçerli email girilir
        Thread.sleep(1000);
        passwordTextBox.click();                                                 //Password textbox ına tıklar
        Thread.sleep(3000);
        passwordTextBox.sendKeys(ConfigReader.getProperty(validPassword));       //Geçerli password girilir
        clickWithCoordinates(991,1707);                                    //Klavye kapatılır
        Thread.sleep(3000);
        clickWithCoordinates(532,1127);                                    //Sign In butonuna tıklar
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
    public void isVisibleTextbox() throws InterruptedException {
        Thread.sleep(1000);
        element = driver.findElement(AppiumBy.className("android.widget.EditText"));
        Thread.sleep(1000);
        assertTrue(element.isDisplayed());
    }
    public void isEnableTextbox() throws InterruptedException {
        element = driver.findElement(AppiumBy.className("android.widget.EditText"));
        Thread.sleep(1000);
        assertTrue(element.isEnabled());
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
            case "Email with validEmail" :
                profilePage.eMailTextbox.click();
                profilePage.phoneTextbox.sendKeys(faker.internet().emailAddress());
                break;
            case "Password with validPassword" :
                profilePage.passwordTextbox.click();
                profilePage.passwordTextbox.sendKeys(faker.internet().password(8,12,true,true,true));
                break;
            case "Password with 6DigitValidPassword" :
                profilePage.passwordTextbox.click();
                profilePage.passwordTextbox.sendKeys("1234.A" + Keys.RETURN);
                clickWithCoordinates(991, 1707);
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
            case "Email with invalidEmail" :
                profilePage.eMailTextbox.click();
                profilePage.eMailTextbox.sendKeys("invalid");
                break;
            case "Password with invalidPassword" :
                profilePage.passwordTextbox.click();
                profilePage.passwordTextbox.sendKeys(faker.internet().password(6,6,true,true,true));
                break;
        }
    }
    public void updateAddress(String update) throws InterruptedException {
       if (update.equals("Edit")){
           editIcon.click();
       }
        Thread.sleep(4000);
     addressNameTextbox.click();
     addressNameTextbox.clear();
     addressNameTextbox.sendKeys(faker.name().fullName());
     addressEmailTextbox.click();
     addressEmailTextbox.clear();
     addressEmailTextbox.sendKeys(faker.internet().emailAddress());
     addressPhoneTextbox.click();
     addressPhoneTextbox.clear();
     addressPhoneTextbox.sendKeys(faker.phoneNumber().cellPhone());
     addressCountryDDM.click();
     driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"" + "Algeria" + "\")")).click();
     Thread.sleep(2000);
     addressStateDDM.click();
     driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"" + "Adrar Province" + "\")")).click();
     Thread.sleep(2000);
     slideWithCoordinatesUpToDown();
     Thread.sleep(2000);
     addressCityDDM.click();
     driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"" + "Adrar" + "\")")).click();
     Thread.sleep(2000);
     addressZipCodeTextbox.click();
     addressZipCodeTextbox.clear();
     addressZipCodeTextbox.sendKeys(faker.address().zipCode());
     addressStreetAddressTextbox.click();
     addressStreetAddressTextbox.clear();
     addressStreetAddressTextbox.sendKeys(faker.address().streetAddress());
     slideWithCoordinatesUpToDown();
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
            case "Email" :
                assertTrue(profilePage.eMailTextbox.isDisplayed());
                assertTrue(profilePage.eMailTextbox.isEnabled());
                break;
            case "Password" :
                assertTrue(profilePage.passwordTextbox.isDisplayed());
                assertTrue(profilePage.passwordTextbox.isEnabled());
                break;
        }
    }
}