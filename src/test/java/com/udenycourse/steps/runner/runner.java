package com.udenycourse.steps.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.udenycourse.steps.pages.BasePage;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/resources"}
		,glue = {"com.udenycourse.steps.steps"}
		,plugin = {"pretty", "html: target/cucumber-reports"}
		,monochrome = true
		,tags = {"@Dreams"}
		)		


public class runner{
	@AfterClass
	public static void closeDriver() {
		//BasePage.closeBrowser();
	}
}

		




