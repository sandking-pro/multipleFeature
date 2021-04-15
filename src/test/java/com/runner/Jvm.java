package com.runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Jvm {
	
	public static void genarateJvmReport(String jsonFile) {
		File reportDirectory = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\reports");
		Configuration config = new Configuration(reportDirectory,"Adactin Automation");
		config.addClassifications("Browser Name", "Chrome");
		config.addClassifications("Browser Version", "86");
		config.addClassifications("os", "Windows");
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		
		ReportBuilder repbuilder = new ReportBuilder(jsonFiles, config);
		repbuilder.generateReports();
		
		
	}

}
