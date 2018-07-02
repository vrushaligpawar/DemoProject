package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\workspace\\web-automation\\src\\main\\java\\Features",glue={"StepDefiniation"})

public class VerifyLoginRunner {

}
