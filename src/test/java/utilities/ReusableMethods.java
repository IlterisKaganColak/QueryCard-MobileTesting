package utilities;
import hooks.Base;
import io.appium.java_client.*;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import static utilities.Driver.getAppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
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


  //  static AndroidDriver<AndroidElement> driver=Driver.getAppiumDriver();
    public static void koordinatTiklamaMethodu(int x,int y) throws InterruptedException {
        TouchAction action=new TouchAction((PerformsTouchActions) getAppiumDriver());
        action.press(PointOption.point(x,y)).release().perform();
        Thread.sleep(1000);
    }

    public static void scrollWithUiScrollableAndClick(String elementText) throws InterruptedException {
     element = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\""+elementText+"\")"));
     if (element.isEnabled()){
     element.click();}
        Thread.sleep(1000);
    }
    public static void clickElement(String text) throws InterruptedException {
        String[] arr = text.split(",");

        if (arr.length==2){
            clickWithCoordinates(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
        }
        else scrollWithUiScrollableAndClick(arr[0]);

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
    public static void isVisible(String text) throws InterruptedException {
        element = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\""+text+"\")"));
        Thread.sleep(1000);
        Assert.assertTrue(element.isDisplayed());
    }
    public static void isEnable(String text) throws InterruptedException {
        element = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\""+text+"\")"));
        Thread.sleep(1000);
        Assert.assertTrue(element.isEnabled());
    }

}
