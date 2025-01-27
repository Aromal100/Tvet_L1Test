package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="./Features/CollegeCreation.feature",
		glue="testCases",
		plugin= {"pretty","html:target/collegecreation.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		)




public class CollegeCreationRunner extends AbstractTestNGCucumberTests {

}
