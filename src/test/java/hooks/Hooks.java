package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import static utilities.Driver.*;

public class Hooks {
    @Before
    public void startUp() throws InterruptedException {
     Base.initialize();
     getAppiumDriver();
     Thread.sleep(5000);
    }
    @After
    public void tearDown(Scenario scenario) throws InterruptedException {
        final byte[] screenshot = ((TakesScreenshot) getAppiumDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png", "screenshots");
        }
        quitAppiumDriver();
    }
}
