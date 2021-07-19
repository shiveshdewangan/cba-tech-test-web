package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/Features/CovidGame.feature"},
        glue = "StepDefinitions",
        dryRun = false,
        tags = "@regression",
        plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/cucumber.json"},
        monochrome = true,
        format = {"html:format"})

public class Runner {
}