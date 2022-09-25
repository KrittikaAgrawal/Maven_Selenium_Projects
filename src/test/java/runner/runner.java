package runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features"
		,glue="stepdefinations"
		,plugin= {"pretty", "html:target/html/cucumber-default-report"}
		,monochrome=true
		)

public class runner {

}
