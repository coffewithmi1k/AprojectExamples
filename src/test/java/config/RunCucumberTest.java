package config;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //  plugin = {"pretty","json:target\\json\\output.json"},
        plugin = {"pretty", "html:target\\html\\"},
        tags = {"@run"},
        //tags = {"@run"},
        features = "src\\test\\resources\\features\\",
        glue = "stepDefinitions"
        //  ,monochrome = true
)

public class RunCucumberTest {
}
