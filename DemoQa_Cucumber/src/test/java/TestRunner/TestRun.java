package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(tags="@DataDriven", glue="StepDefinition", monochrome=true,
		plugin= {"pretty","html:test-output.html"},
		features="./Features",
		dryRun=false)
		
public class TestRun {

}
