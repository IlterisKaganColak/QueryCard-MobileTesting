package Page;

import hooks.Base;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.ReusableMethods;
import java.util.List;
import static utilities.Driver.getAppiumDriver;

public class ProfilePage extends Base {
    public ProfilePage() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);
    }

    @AndroidFindBy(className = "android.widget.EditText")
    public List<WebElement> emailPasswordTextBoxList;

    public void signIn(String validEmail,String validPassword) throws InterruptedException {
        //Profile butonuna tıklar
        ReusableMethods.clickWithCoordinates(977,1722);
        Thread.sleep(1000);
        //Sign In butonuna tıklar
        ReusableMethods.clickWithCoordinates(789,598);
        Thread.sleep(1000);
        //*Use Email Instead yazısına tıklar
        ReusableMethods.clickWithCoordinates(855,551);
        Thread.sleep(1000);
        //Email textbox ına tıklar
        ReusableMethods.clickWithCoordinates(132,642);
        Thread.sleep(1000);
        //Geçerli email girilir
        profilePage.emailPasswordTextBoxList.get(0).sendKeys(ConfigReader.getProperty(validEmail));
        //Password textbox ına tıklar
        ReusableMethods.clickWithCoordinates(173,870);
        Thread.sleep(1000);
        //Geçerli password girilir
        profilePage.emailPasswordTextBoxList.get(1).sendKeys(ConfigReader.getProperty(validPassword));
        //Klavye kapatılır
        ReusableMethods.clickWithCoordinates(991,1707);
        Thread.sleep(1000);
        //Sign In butonuna tıklar
        ReusableMethods.clickWithCoordinates(532,1127);
        Thread.sleep(1000);
    }

     public void loginAndDashboard() throws InterruptedException {
         ReusableMethods.clickElement("Profile");
         var el1 = driver.findElement(AppiumBy.accessibilityId("Sign In"));
         el1.click();
         var el2 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]"));
         el2.click();
         el2.sendKeys("1231231");
         var el3 = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[2]"));
         el3.click();
         el3.sendKeys("123123");
         var el4 = driver.findElement(AppiumBy.xpath("(//android.view.View[@content-desc=\"Sign In\"])[2]"));
         el4.click();
         var el5 = driver.findElement(AppiumBy.accessibilityId("Profile"));
         el5.click();
     }

}