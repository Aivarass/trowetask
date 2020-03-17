package cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "features" ,
        glue ={"stepdefinitions"} ,
        monochrome = true )
public class CucumberRunner {


}
