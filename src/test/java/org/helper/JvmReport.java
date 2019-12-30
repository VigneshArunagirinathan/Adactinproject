package org.helper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void generateJvmReport(String jsonloc) {
		Configuration con = new Configuration(
				new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Report\\"), "Fishpond");
		con.addClassifications("browser", "chrome");
		con.addClassifications("browserversion", "v77");
		con.addClassifications("sprint", "10");
		con.addClassifications("os", "10");
		List<String> jsonlst = new ArrayList<String>();
		jsonlst.add(jsonloc);
		ReportBuilder build = new ReportBuilder(jsonlst, con);
		build.generateReports();

	}

}
