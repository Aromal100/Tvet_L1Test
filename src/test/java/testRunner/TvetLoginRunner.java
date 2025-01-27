package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="./Features//TVETLogin.feature",
		glue="testCases",
		plugin= {"pretty","html:target/cucumber_tvetlogin.html"}
		)




public class TvetLoginRunner extends AbstractTestNGCucumberTests{

}
