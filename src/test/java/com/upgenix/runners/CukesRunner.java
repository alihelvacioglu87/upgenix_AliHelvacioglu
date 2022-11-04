package com.upgenix.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "json:target/cucumber.json",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",
        glue = "com/upgenix/stepDefinitions",
        //dryRun = true --> do not run my step_definitions, but only check if any step is missing snippet
        //dryRun = false --> this will turn off dryRun, and our code will run as expected.
        dryRun = false,
        tags = "@Logout"
)
public class CukesRunner {
}