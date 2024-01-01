package testRunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/AppFeatures/Registration.feature"},       //Path of feature file
        glue = {"stepDefinations"},            //path of Step defination and hooks
        plugin = {"pretty",             //Formatting
                    "json:target/Report/MyJsonReport.json",
                    "junit:target/Report/MyXMLReport.xml"}  ,
       //publish = true,
        monochrome=false,
        dryRun = false
)
public class RegistrationTest {

}
