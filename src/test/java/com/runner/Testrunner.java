package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.Baseclass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\cuc",glue = "com\\stebdefnition1",monochrome = true,
plugin = {"html:target/cucumber-reports/report.html","pretty","json:target/cucumber-reports/report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/reports.html"})
public class Testrunner extends Baseclass {
public static WebDriver driver;
	
	
	@BeforeClass
	public static void setub() {
	launchBrowser("chrome");

	}
	@AfterClass
	public static void teardown() {
		//close();
	}
	

}
