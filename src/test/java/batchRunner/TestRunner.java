package batchRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber .class)
@CucumberOptions(
plugin = {"json:Srinivas/cucumber.json", "html:target2/index.html"},
features= {"C:\\Users\\r.kumar.chintakunta\\Downloads\\SampleMaven\\SampleMaven\\Features\\outline.feature" },
		glue= {"stepDefinition"})
		//tags= {"@SIT, @Regression, @UAT"})
public class TestRunner {
}
// (features="{f1,f2}")

