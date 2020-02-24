package com.cluno.apimain;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterMethod;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import stepDefinition.getOffersStepDefinition;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/java/feature"
 ,glue={"stepDefinition"},tags= {"@Tests","~@Ignore"}, plugin = {  "pretty", "json:target/cucumber-reports/Cucumber.json",
		 "junit:target/cucumber-reports/Cucumber.xml",
		 "html:target/cucumber-reports"},monochrome =true
 )
 
public class TestRunner {

}

