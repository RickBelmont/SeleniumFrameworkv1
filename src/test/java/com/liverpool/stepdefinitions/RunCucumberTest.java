package com.liverpool.stepdefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"pretty"}
		,features={"src/test/resources"}
		,glue={"com.liverpool.stepdefinitions"}
		,tags={"@liverpool"}
		,monochrome = false)
public class RunCucumberTest {

}
