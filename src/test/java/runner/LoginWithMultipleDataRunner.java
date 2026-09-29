package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features/LoginWithMultipleData_DataTable.feature"},
        glue = {"stepDefinitions"},dryRun = false)
public class LoginWithMultipleDataRunner {
}
