package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = "src/main/resources/Features/PracticeForm.feature", glue = "step.defination", plugin = {
		"json:target/cucumber-reports/Cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },tags = "@UITEST")

public class Runcuke extends AbstractTestNGCucumberTests{
	 

}
