package TestRunner;

import cucumber.api.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ganes\\eclipse-workspace\\CucDemo\\src\\test\\java\\features", glue = {
		"StepDefinition" })
public class TestRunner extends cucumber.api.testng.AbstractTestNGCucumberTests {

}
