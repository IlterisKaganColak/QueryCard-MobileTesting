package Page;

import hooks.Base;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

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
        }
        else System.out.println("Hatali info girdiniz!!!");
    }









}