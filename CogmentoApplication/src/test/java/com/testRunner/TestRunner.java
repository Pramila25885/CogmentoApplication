package com.testRunner;

import org.testng.annotations.AfterClass;

import com.vimalselvam.cucumber.listener.Reporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	//@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/resources/Features",
					plugin = {"pretty", "html:reports/cucumberreport","json:reports/cucumberreport/jsonreport",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
							},
			glue="com.login_StepDefinition"
			//strict= true
						
			)

	public class TestRunner extends AbstractTestNGCucumberTests{
		
			
		  @AfterClass
		  
		  public static void Extentsreport()
		  
		  {
			  Reporter.loadXMLConfig("src/test/resources/Extent-Config.xml");
		  Reporter.setSystemInfo("user", System.getProperty("user.name"));
		  Reporter.setSystemInfo("os", "Windows");
		  Reporter.setTestRunnerOutput("Sample test runner output message"); }
		 

}
