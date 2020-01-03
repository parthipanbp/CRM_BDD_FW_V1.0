package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "F:/Git_repo/CRM_BDD_FW_V1.0/FreeCrmBddFramework/src/main/java/Features/Login.feature", tags="@test",//"feature"->a path of feature file 
glue = { "stepDefinitions" }, // "Glue"->a path of stepdefiniton file 
format = { "pretty", "html:test-output", "json:Json_output_file/Output.json", "junit:xml_output_file/Output.xml" },//to generate differnet type of report like HTML,Json,XML 
dryRun = false,//"dryRun" -> verify the mapping between feature and Stepdefinition steps
strict = true, // To strickly ensur the stepdefiniton for the feature steps ,if step is not defined its thorws execetion immediatly 
monochrome=true) // Produce the proper readble consol output(True/False)

public class TestRunner {
}

/*
 * Feature file path should be right path and folder 
 */ 