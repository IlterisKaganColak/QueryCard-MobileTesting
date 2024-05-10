package utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class Driver {
    private Driver() {
    }

    private static AppiumDriver driver;

    public static AppiumDriver getAppiumDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("platformName")) {
                case "Android":
                    UiAutomator2Options options = new UiAutomator2Options();
                    options.setPlatformName("Android").setAutomationName("UiAutomator2");
//                    options.setApp("C:/querycart1.0.apk");
                    options.setAppPackage("com.inilabs.shopking");
                    options.setAppActivity("com.inilabs.shopking.MainActivity");
                    options.setUdid("emulator-5554");
                    options.setNoReset(false);
                    options.setNewCommandTimeout(Duration.ofMinutes(20));
                   try {
                        driver = new AndroidDriver(
                             new URL("http://0.0.0.0:4723/"), options
                     );
                 } catch (MalformedURLException e) {
                     throw new RuntimeException(e);
                 }
                    break;
                case "IOS":
                    break;
                default:
                    throw new RuntimeException("Desteklenmeyen Platform");
            }
        }
        return driver;
    }
    public static void quitAppiumDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
