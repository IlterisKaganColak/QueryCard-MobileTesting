package utilities;
import com.google.common.collect.ImmutableMap;
import hooks.Base;
import io.appium.java_client.*;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import static utilities.Driver.getAppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.Date;
import java.util.List;



public class ReusableMethods extends Base {
    public static void scrollWithUiScrollableAndClick(String elementText) throws InterruptedException {
        boolean flag=true;
        do{
          try {
              element = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"" + elementText + "\")"));
              element.click();
              flag=false;
          } catch (Exception e) {
                  slideWithCoordinatesUpToDown();

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
        var start = new Point(526, 1346);
        var end = new Point (535, 833);
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
        Thread.sleep(1000);
        element = getAppiumDriver().findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\""+text+"\")"));
        Thread.sleep(1000);
        Assert.assertTrue(element.isDisplayed());
    }
    public static void isEnable(String text) throws InterruptedException {
        element = getAppiumDriver().findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"" + text + "\")"));
        Thread.sleep(1000);
        Assert.assertTrue(element.isEnabled());

    }

    public static void wait(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }





    //YEDEKLER ---------------    İhtiyaç halinde buradan alıp düzenleyip kullanabilirsiniz              !!!!!!!!!!!!!!!
    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getAppiumDriver();

        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/target/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }


    /*
     * Element gorunene kadar kodlari bekletir
     * @param element beklenilecek elementin locate
     * @param timeout ne kadar sure beklenilecegi int olarak verilir
     */

        public static void waitToBeClickable(WebElement element, Duration timeout) {
            WebDriverWait wait = new WebDriverWait(getAppiumDriver(), timeout);
            wait.until(ExpectedConditions.elementToBeClickable(element));
        }
        public static void waitToBeVisible(WebElement element, Duration timeout) {
            WebDriverWait wait = new WebDriverWait(getAppiumDriver(), timeout);
            wait.until(ExpectedConditions.visibilityOf(element));
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

        public static void enterText(WebElement element, String text) {
            tapOn(element);
            wait(10);
            element.sendKeys(text);
        }



    public static boolean isElementMultiple(String text, int sayi) {
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


    /*
     * elementi listin icine alıp, listin boyutunu olcer. list bos ise true dondurecek.scrollForMobile() ile kullanilir
     * @param element element locate yazilmali
     * @return true yada false doner
     */
    private static boolean isElementNotEnabled(WebElement element) throws MalformedURLException {
        List<WebElement> elements = Driver.getAppiumDriver().findElements((By) element);
        boolean enabled;
        if (elements.size() < 1) enabled = true;
        else enabled = false;
        return enabled;
    }

    /*
     * bu metot ile aranan bir texti iceren elemente scroll yapilir
     * @param textFromOutSide aranan text degeridir
     */
    public static void scrollTo(String textFromOutSide) throws MalformedURLException {
        AppiumBy.ByAndroidUIAutomator permissionElement = new AppiumBy.ByAndroidUIAutomator("new UiScrollable" +
                "(new UiSelector().scrollable(true).instance(0)." +
                "scrollIntoView(new UiSelector()" + ".textMatches(\"" + textFromOutSide + "\").instance(0)");
        getAppiumDriver().findElement(permissionElement);
    }

    public static void enterText(WebElement element, String text, boolean needClear) {
        waitToBeClickable(element, Duration.ofSeconds(10));
        if (needClear) {
            element.clear();
        }
        element.sendKeys(text);
    }


    public static void backToPreScreen(){
        getAppiumDriver().navigate().back();
    }

    /*
     * Bu metot ile toast message(kaybolan mesaj)'in ustunde yazan mesaj alinir ve string olarak doner
     * @return string olarak doner
     */
    public static String getToastMessage() {
        String toastMessage= getAppiumDriver().findElement(By.xpath("//android.widget.Toast")).getAttribute("name");
        return toastMessage;
    }

    /*
     * bu metot ile locate verilen elemente double click yapilir
     * @param driver yerine AndroidDriver objesi verilir
     * @param element double click yapilacak elementinid turunden locate'i verilecek
     */
    public static void doubleClick(AndroidDriver driver, WebElement element){
        driver.executeScript("mobile: doubleClickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId()
        ));
    }
    /**
     * bu metot ile text degeri verilen elemente kadar sayfa kaydirilir
     * @param driver yerine AndroidDriver objesi verilir
     * @param text yerine elementin text degeri verilir
     */

}







