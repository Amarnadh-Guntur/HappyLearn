package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="F:\\selenium\\Selenium Scripts\\HappyLearn\\src\\main\\java\\Features\\Login.feature",
		glue = {"stepdefinition"}
		//format ={"pretty","html:test-outout"}
		
		
		)
public class TestRunner {

}
