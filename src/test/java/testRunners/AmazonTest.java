package testRunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/AppFeatures/Search.feature"},       //Path of feature file
        glue = {"stepDefinations","myHooks"},            //path of Stepdefinations and hooks
        plugin = {"pretty"}  ,                           //Formatting
        tags="@Smoke or @Regression"
)
public class AmazonTest {

}
