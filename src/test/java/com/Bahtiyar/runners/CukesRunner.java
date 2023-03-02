package com.Bahtiyar.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "json:target/cucumber.json"

        },
        features="src/test/resources",
        glue ="com/Bahtiyar/step_definitions",
        dryRun = true,
        //stepNotifications = true,
        tags = "@Login"
)
public class CukesRunner {

}
