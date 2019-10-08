package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "F:/Git_repo/CRM_BDD_FW_V1.0/FreeCrmBddFramework/src/main/java/Features/Login.feature", glue = { "stepDefinition" } )// format = { "pretty", "html:test-output" })
public class TestRunner {
}

/*
 * Feature file pathi should be right
 */