package runnerclass;

import org.helper.JvmReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources\\feature\\fishpond.feature" }, glue = {
		"com.stepdefinition" }, dryRun = false, monochrome = true, plugin = {
				"junit:src\\test\\resources\\Reports\\cucumber.xml" })
public class TestRunnerFp {
	@AfterClass
	public static void afterclass() {
		JvmReport.generateJvmReport(System.getProperty("user.dir") + "src\\test\\resources\\Reports\\cucumber.json");

	}
}
