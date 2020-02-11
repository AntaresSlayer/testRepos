import cucumber.api.CucumberOptions;

@CucumberOptions(
        features ="src/test/java/feature/GoogleSearchTest.feature",
        glue = {"src/test/java/stepDefinition"},
        plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json","html:target/cucumber-reports"},
        strict = true,
        monochrome = true,
        dryRun = false
)

public class TestRunner {

}
