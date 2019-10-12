package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "F:/Git_repo/CRM_BDD_FW_V1.0/FreeCrmBddFramework/src/main/java/Features/Login.feature", tags="@test",
glue = { "stepDefinitions" },
format = { "pretty", "html:test-output" })
public class TestRunner {
}

/*
 * Feature file path should be right path and folder 
 */
