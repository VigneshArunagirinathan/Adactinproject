package runnerclass;
import org.helper.JvmReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources\\feature\\adactinlogin.feature" }, glue = {
		"com.stepdefinition" }, tags = { "@Func1" }, plugin = { "pretty",
				"rerun:src\\test\\resources\\feature\\FailedTestCase.txt",
				"json:src\\test\\resources\\Report\\cucumber.json" }, dryRun = false, monochrome = true, strict = true)
/**
 * 
 * @author vignesh
 *
 */

public class TestRunner {
	@AfterClass
	public static void afterClass() {
		JvmReport.generateJvmReport(System.getProperty("user.dir") + "\\src\\test\\resources\\Report\\cucumber.json");
	}
}
