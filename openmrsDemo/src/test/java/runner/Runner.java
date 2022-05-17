package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src//test//resources//features"},
		glue= {"step_definitions"},
		monochrome=true,
		dryRun=true,
		plugin= {"pretty","html:target/HtmlReport"}
		)

public class Runner {

}
