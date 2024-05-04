package Page;

import hooks.Base;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

import static utilities.Driver.getAppiumDriver;

public class ProfilePage extends Base {
    public ProfilePage() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);
    }

    @AndroidFindBy(className = "android.widget.EditText")
    public List<WebElement> emailPasswordTextBoxList;



    public void clickAndSendKeys(String info) throws InterruptedException {
        if (info.contains("Email")){
            profilePage.emailPasswordTextBoxList.get(0).click();
            Thread.sleep(1000);
            profilePage.emailPasswordTextBoxList.get(0).sendKeys(ConfigReader.getProperty(info));
        } else if (info.contains("Password")) {
            profilePage.emailPasswordTextBoxList.get(1).click();
            Thread.sleep(1000);
            profilePage.emailPasswordTextBoxList.get(1).sendKeys(ConfigReader.getProperty(info));
            ReusableMethods.clickWithCoordinates(991,1707);
        }
        else System.out.println("Hatali info girdiniz!!!");
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
         el3.sendKeys("123456");
         var el4 = driver.findElement(AppiumBy.xpath("(//android.view.View[@content-desc=\"Sign In\"])[2]"));
         el4.click();
         var el5 = driver.findElement(AppiumBy.accessibilityId("Profile"));
         el5.click();
     }

    public void changePassword() throws InterruptedException {
        var el1 = driver.findElement(AppiumBy.accessibilityId("Change Password"));
        el1.click();
        var el2 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]"));
        el2.click();
        el2.sendKeys("123456");
        var el3 = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[2]"));
        el3.click();
        el3.sendKeys("123123");
        var el4 = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[3]"));
        el4.click();
        el4.sendKeys("123123");
        Thread.sleep(3000);

      //  var el5 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View"));
        //el5.click();
        //var el6 = driver.findElement(AppiumBy.accessibilityId("Save Changes"));
       // el6.click();
    }






}