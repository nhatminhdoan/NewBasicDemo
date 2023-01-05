package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(tags = "", features = "src/test/resources/features/Employee.feature",
glue = "StepDefinitions",
monochrome = true,
dryRun = false,
plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			})
    
public class CucumberRunnerTests {

}
