package com.paylocity.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(


        features="src/test/resources/features",
        glue = "com/paylocity/step_definitions",
        dryRun = false,
        tags = ""



)

public class CukesRunner {
}




/*
plugin = {
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
 */