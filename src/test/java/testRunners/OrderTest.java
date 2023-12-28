package testRunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/AppFeatures/Order.feature"},       //Path of feature file
        glue = {"stepDefinations"},                     //path of Step dedinations
        plugin = {"pretty"}                             //Formatting
)
public class OrderTest {

}
