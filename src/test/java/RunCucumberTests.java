
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by samschofield on 4/03/17.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
    format = {"pretty",
        "html:target/site/cucumber-pretty",
        "json:target/cucumber.json"},
    snippets = SnippetType.CAMELCASE,
    glue = "steps")
public class RunCucumberTests {
}