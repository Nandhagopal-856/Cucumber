package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\resources\\features",
		glue= {"com.definition"},
		dryRun=true,
		monochrome = true,
		plugin= {"pretty"}
		//plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		//plugin= {"pretty","junit:target\\cucumberReports\\reports.xml"}
		)
public class Testrunner {

}
//"pretty","html:target\\cucumberReports\\reports.html"