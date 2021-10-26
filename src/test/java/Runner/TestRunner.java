package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(


        features= {"src/test/java/FeatureFiles"},
        glue= {"StepDefinitions"},
        plugin={"pretty:STDOUT",
                "html:target/cucumber-html-report",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml",
                "rerun:target/rerun.txt"}//,
        //tags ="@JMTesting or @RegressionTest"


)
public class TestRunner
{

}
