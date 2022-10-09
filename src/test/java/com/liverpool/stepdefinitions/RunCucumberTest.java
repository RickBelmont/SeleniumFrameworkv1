package com.liverpool.stepdefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"pretty", "html: target/cucumber-reports"}
		,features={"src/test/resources"}
		,glue={"com.udenycourse.steps.steps"}
		,tags={"@List"}
		,monochrome = false)

public class RunCucumberTest {

}
