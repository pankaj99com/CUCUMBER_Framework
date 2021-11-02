package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\hooks.feature", // path of feature file
		glue = { "StepDefinitions" }, // path of step definition file
		monochrome = true,
				stepNotifications = true,
//plugin= {"pretty","json:target/JSONReports/Report.json"})
//plugin={"pretty","html:target/HtmlReports/Test.html"},
	plugin = { "pretty", "junit:target/JSONUnitReports/report.xml", "html:target/cucumber-reports/htmlReports/index.html",
			"json:target/JSONReports/report.json" }, // multiple reports formats available
 // used to explicity see the the tagged features and scenarios in the output
								// console
		strict = true, // used to check if any steps are not defined in steps definition file
		dryRun = false,
		tags ={"@Smoke" , "@Regression"}) // used to check if mappings are proper between steps definition and feature
						// file

public class TestRunner  {

}
