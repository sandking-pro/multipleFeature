package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources",glue= {"com.stepdefinition"},dryRun=false,monochrome=true,snippets=SnippetType.CAMELCASE,plugin={"pretty","json:src\\test\\resources\\reports\\cucumber.json"})
public class TestRunner {
	
	@AfterClass
	public static void tc0() {
		Jvm.genarateJvmReport(System.getProperty("user.dir")+"\\src\\test\\resources\\reports\\cucumber.json");
	}
}
