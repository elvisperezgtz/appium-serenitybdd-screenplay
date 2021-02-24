package gt.com.tigo.qa.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "gt.com.tigo.qa.stepsdefinitions",
        snippets = SnippetType.CAMELCASE,
        features = "src\\test\\resources\\features\\login\\login.feature",
        tags = "@LoginOTPInvalido"
)
public class Login {
}
