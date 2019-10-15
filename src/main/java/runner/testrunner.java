package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
(
	format={"pretty","html:report/html","json:report/json/cucumber.json"},
			tags={"@test","@maintest"},
			features={"src/test/resources/feature/reregister.feature","src/test/resources/feature/register.feature"},
			glue={"stepdefinitions", "stepdefinition"}
			
)

public class testrunner extends AbstractTestNGCucumberTests {
	

}
