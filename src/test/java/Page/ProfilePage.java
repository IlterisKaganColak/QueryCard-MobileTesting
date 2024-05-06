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
import static utilities.Driver.getAppiumDriver;

public class ProfilePage extends Base {
    public ProfilePage() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);
    }

    @AndroidFindBy (accessibility = "Change Password Password Updated Successfully")
    public WebElement changePassMessage;

    public  void signIn(String validEmail, String validPassword) throws InterruptedException {
        Thread.sleep(1000);
        //Profile butonuna tıklar
        ReusableMethods.clickWithCoordinates(977,1722);
        Thread.sleep(3000);
        //Sign In butonuna tıklar
        ReusableMethods.clickWithCoordinates(789,598);
        Thread.sleep(3000);
        //*Use Email Instead yazısına tıklar
        ReusableMethods.clickWithCoordinates(855,551);
        Thread.sleep(3000);
        //Email textbox ına tıklar
        var el15 = getAppiumDriver().findElement(AppiumBy.className("android.widget.EditText"));
        el15.click();
        Thread.sleep(3000);
        //Geçerli email girilir
        el15.sendKeys(ConfigReader.getProperty(validEmail));
        Thread.sleep(1000);
        //Password textbox ına tıklar
        var el16 = getAppiumDriver().findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[2]"));
        el16.click();
        Thread.sleep(3000);
        //Geçerli password girilir
        el16.sendKeys(ConfigReader.getProperty(validPassword));
        //Klavye kapatılır
        ReusableMethods.clickWithCoordinates(991,1707);
        Thread.sleep(3000);
        //Sign In butonuna tıklar
        ReusableMethods.clickWithCoordinates(532,1127);
        Thread.sleep(3000);
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
        el2.sendKeys("Query.2904");
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