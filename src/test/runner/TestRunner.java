package runner;


import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
@CucumberOptions(features = "src\\test\\java\\features\\login.feature",
        glue = {"classpath:src/test/java/steps/"}, monochrome = true)
@RunWith(Cucumber.class)
public class TestRunner
{



}
