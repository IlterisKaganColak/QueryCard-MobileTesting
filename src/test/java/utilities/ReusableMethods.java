package utilities;
import hooks.Base;
import io.appium.java_client.*;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import static utilities.Driver.getAppiumDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Arrays;
public class ReusableMethods extends Base {
    public static void scrollWithUiScrollableAndClick(String elementText) throws InterruptedException {
        boolean flag=true;
        do{
          try {
              element = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"" + elementText + "\")"));
              element.click();
              flag=false;
          } catch (Exception e) {
              if (elementText.equals("Women")){
                  slideWithCoordinatesLeftToRight();
              }else slideWithCoordinatesUpToDown();

          }}while(flag);

        Thread.sleep(1000);
    }
    public static void scrollToElementWithText(String text) throws InterruptedException {
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(description(\""+text+"\"))"));
        Thread.sleep(1000);
    }
    public static void clickElement(String text) throws InterruptedException {
        if (text.contains(",")){
        String[] arr = text.split(",");
            clickWithCoordinates(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
            Thread.sleep(1000);
        }
        else {
            scrollWithUiScrollableAndClick(text);
             Thread.sleep(1000);
        }
    }

    public static void clickWithCoordinates(int x, int y) {
        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var tapPoint = new Point(x, y);
        var tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint.x, tapPoint.y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(new Pause(finger, Duration.ofMillis(50)));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        getAppiumDriver().perform(Arrays.asList(tap));
    }
    public static void slideWithCoordinatesUpToDown() {
        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var start = new Point(481, 1039);
        var end = new Point (481, 400);
        var swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), start.getX(), start.getY()));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000),
                PointerInput.Origin.viewport(), end.getX(), end.getY()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
    }
    public static void slideWithCoordinatesLeftToRight() {
        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var start = new Point(936, 760);
        var end = new Point (224, 756);
        var swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), start.getX(), start.getY()));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000),
                PointerInput.Origin.viewport(), end.getX(), end.getY()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
    }
    public static void isVisible(String text) throws InterruptedException {
        boolean flag=true;
        do{
            try {
                element = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"" + text + "\")"));
                Assert.assertTrue(element.isDisplayed());
                flag=false;
            } catch (Exception e) {
                slideWithCoordinatesUpToDown();

            }}while(flag);

        Thread.sleep(1000);
    }
    public static void isEnable(String text) throws InterruptedException {
        boolean flag=true;
        do{
            try {
                element = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"" + text + "\")"));
                Assert.assertTrue(element.isEnabled());
                flag=false;
            } catch (Exception e) {
                slideWithCoordinatesUpToDown();

            }}while(flag);
        Thread.sleep(1000);
    }
    public static void backToPreScreen(){
        driver.navigate().back();
    }
    public static void enterText(WebElement element, String text, boolean needClear) {
        waitToBeClickable(element, Duration.ofSeconds(10));
        if (needClear) {
            element.clear();
        }
        element.sendKeys(text);
    }
    public static void waitToBeClickable(WebElement element, Duration timeout) {
        WebDriverWait wait = new WebDriverWait(getAppiumDriver(), timeout);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}







