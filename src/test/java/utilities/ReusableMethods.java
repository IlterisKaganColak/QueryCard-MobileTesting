package utilities;
import com.google.common.collect.ImmutableMap;
import hooks.Base;
import io.appium.java_client.*;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.ActionOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import static java.time.Duration.ofMillis;
import static java.util.Collections.singletonList;
import static utilities.Driver.getAppiumDriver;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Array;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;



public class ReusableMethods extends Base {
    public static void clickWithCoordinates(int x, int y) {
        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var tapPoint = new Point(x, y);
        var tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint.x, tapPoint.y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(new Pause(finger, Duration.ofMillis(50)));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap));
    }
    public static void enterText(WebElement element, String text) {
        tapOn(element);
        wait(10);
        element.sendKeys(text);
    }

  //  static AndroidDriver<AndroidElement> driver=Driver.getAppiumDriver();
    public static void koordinatTiklamaMethodu(int x,int y) throws InterruptedException {
        TouchAction action=new TouchAction((PerformsTouchActions) getAppiumDriver());
        action.press(PointOption.point(x,y)).release().perform();
        Thread.sleep(1000);
    }

    public static void scrollWithUiScrollableAndClick(String elementText) throws InterruptedException {
      //  AndroidDriver driver = (AndroidDriver)  Driver.getAppiumDriver();
      //  element = driver.findElement(AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + elementText + "\"))");
      //  element = driver.findElement(By.xpath("//*[@text='" + elementText + "']"));
     element = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\""+elementText+"\")"));
     element.click();
        Thread.sleep(1000);
    }
    public static void countOfElement(String text,int x,int y) throws InterruptedException {
        String  arr[] = new String[3];
        for (int i=0;i<3;i++){
            arr[i]= Arrays.toString(text.split(","));
        }

        String clickItem= text.replaceAll("\\D","");
        int countElementFound ;
        List<WebElement> mobileElementList = Driver.getAppiumDriver().findElements(By.xpath("//android.widget.TextView[@text='" + text + "']"));
        if (mobileElementList.size()>1){

            clickWithCoordinates(Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
        }
        else scrollWithUiScrollableAndClick(text);

    }
    public static void scrollWithUiScrollable(String elementText) {
        AndroidDriver driver = (AndroidDriver)  getAppiumDriver();
     //   driver.findElement(AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + elementText + "\"))"));

    }

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot)Driver.getAppiumDriver();

        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/target/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }

    public static void ekranKaydirmaMethodu(int xPress,int yPress,int wait,int xMove,int yMove){
        TouchAction action=new TouchAction<>((PerformsTouchActions) getAppiumDriver());
        action.press(PointOption.point(xPress,yPress))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(wait)))
                .moveTo(PointOption.point(xMove,yMove))
                .release()
                .perform();
    }
    public static void wait(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static boolean isElementPresent(String text) {
        boolean elementFound = false;
        List<WebElement> mobileElementList = Driver.getAppiumDriver().findElements(By.xpath("//android.widget.TextView[@text='" + text + "']"));
        for (WebElement el : mobileElementList) {
            if (el.getText().equals(text)) {
                waitToBeVisible(el, Duration.ofSeconds(10));
                if (el.isDisplayed()) {
                    elementFound = true;
                }
            }
        }
        return elementFound;
    }
    public static void tapOn(WebElement element) {
        waitToBeClickable(element, Duration.ofSeconds(10));
        element.click();
    }
    public static void waitToBeVisible(WebElement element, Duration timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getAppiumDriver(), timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static void waitToBeClickable(WebElement element, Duration timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getAppiumDriver(), timeout);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static boolean isElementMultiple(String text,int sayi) {
        boolean elementFound = false;
        List<WebElement> mobileElementList = Driver.getAppiumDriver().findElements(By.xpath("//android.widget.TextView[@text='" + text + "']"));

        for (WebElement el : mobileElementList) {
            if (el.getText().equals(text)) {
                waitToBeVisible(el, Duration.ofSeconds(10));
                if (el.isDisplayed()) {
                    elementFound = true;
                }
            }
        }
        return elementFound;
    }

}
