package runnerclass;

import org.helper.JvmReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "@src\\test\\resources\\feature\\FailedTestCase.txt" }, glue = {
		"com.stepdefinition" }, tags = { "@Func1" }, plugin = { "pretty",
				"json:src\\test\\resources\\Report\\cucumber.json" }, dryRun = false, monochrome = true, strict = true)
public class TestRunnerF {
	@AfterClass
	public static void afterClass() {
		JvmReport.generateJvmReport(System.getProperty("user.dir") + "\\src\\test\\resources\\Report\\cucumber.json");
	}
}
