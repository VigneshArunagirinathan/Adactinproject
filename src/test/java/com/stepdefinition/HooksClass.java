package com.stepdefinition;

import org.helper.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.*;

public class HooksClass extends BaseClass {
	@Before
	public void beforeExecution() {
		getDriver();
		launch(getConfig("url"));
		System.out.println("before executed");

	}

	/**
	 * 
	 * @param sc
	 */

	@After
	public void afterExecution(Scenario sc) {
		if (sc.isFailed()) {
			TakesScreenshot tk = (TakesScreenshot) driver;
			byte[] b = tk.getScreenshotAs(OutputType.BYTES);
			System.out.println(b[0]);
			sc.embed(b, "failed/png");
		} else {
			TakesScreenshot tk = (TakesScreenshot) driver;
			byte[] b = tk.getScreenshotAs(OutputType.BYTES);
			System.out.println(b[0]);
			sc.embed(b, "pass/png");
		}
		System.out.println("after executed");

	}

}
