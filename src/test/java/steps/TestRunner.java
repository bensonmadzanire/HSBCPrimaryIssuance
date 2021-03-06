package steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/features"}, glue = { "steps"},
               monochrome = true,
               tags ="@Loginfeature"
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
