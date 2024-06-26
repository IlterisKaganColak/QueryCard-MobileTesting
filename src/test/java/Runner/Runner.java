package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber.json",},
        features = "src/test/resources/Features",
        glue = {"stepdefinitions" , "hooks"},

        tags = "@[TC_04>US_014]",

        dryRun = false
)
public class Runner {
}