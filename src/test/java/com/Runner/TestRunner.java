package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/featureFiles/ScrollPage.feature",
					glue ="com.steps", 
					plugin = { "pretty", "html:target/cucumber-reports" },
					monochrome = true)
public class TestRunner {

}
