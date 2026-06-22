package testing.runners;



import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json"},
        features = "src/test/resources/features.search/",
        glue = "testing/stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class CrudRunner {
}
