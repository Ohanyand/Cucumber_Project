package StepDefiniton;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/features", glue ={"StepDefiniton"}, monochrome = true)
public class TestRunner {
}
