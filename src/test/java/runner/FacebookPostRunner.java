package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features/facebookPost.feature"},
            glue = {"stepDefinitions","hooks"},
//            plugin = {"pretty","html:target/HTMLReports/cucumber-report.html"})
//            plugin = {"pretty","json:target/report.json"})
            plugin = {"pretty","junit:target/report.xml"})
public class FacebookPostRunner {
}
